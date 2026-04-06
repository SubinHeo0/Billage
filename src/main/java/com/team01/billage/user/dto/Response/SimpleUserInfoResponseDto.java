package com.team01.billage.user.dto.Response;

import com.team01.billage.user.domain.CustomUserDetails;
import lombok.Getter;

@Getter
public class SimpleUserInfoResponseDto {
    private Long userId;
    private String email;
    private String accessToken;

    public SimpleUserInfoResponseDto(CustomUserDetails userDetails, String accessToken) {
        if (userDetails == null) {
            this.userId = null;
            this.email = null;
            this.accessToken = null;
        } else {
            this.userId = userDetails.getId();
            this.email = userDetails.getEmail();
            this.accessToken = accessToken;
        }
    }
}
