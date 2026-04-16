package com.team01.billage.config;

import com.team01.billage.config.jwt.impl.JwtProviderImpl;
import com.team01.billage.exception.CustomException;
import com.team01.billage.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StompHandler implements ChannelInterceptor {

    private final JwtProviderImpl jwtProvider;

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        // StompHeaderAccessor를 사용하여 STOMP메시지 헤더에 접근
        StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);

        // 메시지의 STOMP 명령이 CONNECT인 경우를 체크(CONNECT 명령은 클라이언트가 처음으로 웹소켓 연결을 시도할 때 사용)
        if (StompCommand.CONNECT.equals(accessor.getCommand())) {

            // STOMP 헤더에서 "Authorization" 헤더 값을 추출
            String token = accessor.getFirstNativeHeader("Authorization");

            try {
                if (token != null && token.startsWith("Bearer ")) {
                    token = token.substring(7);

                    if (jwtProvider.validateToken(token)) {
                        Authentication authentication = jwtProvider.getAuthentication(token);

                        // 생성된 Authentication 객체를 SecurityContextHolder에 설정하여, 현재 보안 컨텍스트에 인증 정보 저장
                        SecurityContextHolder.getContext().setAuthentication(authentication);

                        // STOMP 접근자(accessor)에 사용자 정보를 설정하여 연결된 사용자가 누구인지 식별할 수 있도록
                        accessor.setUser(authentication);
                    }

                }
            } catch (Exception e) {
                throw new CustomException(ErrorCode.INVALID_TOKEN);
            }
        }
        return message;
    }

}
