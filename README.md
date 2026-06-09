## 프로젝트 소개

<img width="300" alt="Image" src="https://github.com/user-attachments/assets/60c09d7f-6a33-44b3-b285-80bf87dfcb22" />

<img width="800" alt="Image" src="https://github.com/user-attachments/assets/9cc9104b-7ed8-4c64-b023-ee13056d61a4" />

<img width="800" alt="Image" src="https://github.com/user-attachments/assets/286aece0-4b62-4c1f-a78b-a649143d054b" />

<br>

✔ https://xfg9fxw41c.execute-api.ap-northeast-2.amazonaws.com
| **테스트 계정** |        **아이디**        |        **비밀번호**        |
| :------: | :--------------------: | :--------------------: |
|  회원1  | anmedi3623@naver.com | test1234 |
|  회원2  | billage3623@gmail.com | test1234 |

<br>

## 팀원 구성

| **이름** |        **역할**        |
| :------: | :--------------------: |
|  나용진  |    대여 기록, 후기     |
|  백승주  |         지역        |
|  윤호준  |     회원가입, 로그인    |
|  한상현  |       채팅, 배포       |
|  허수빈  |    팀장, 상품, 이미지    |

<br>

## 개발 기간

2024.11.18 ~ 2024.12.13 (1개월)

<br>

## 기술 스택

### Back-end

<img width="960" alt="Image" src="https://github.com/user-attachments/assets/2b70efda-f249-4092-9585-eee7e45978ca" />

| 기술                                                                                                                | 버전     | 설명                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------- | -------- | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| ![Java](https://img.shields.io/badge/Java-17-007396?logo=java&logoColor=white)                                      | 17 (LTS) | 최신 LTS 버전으로 안정성과 성능 제공                                                                                                             |
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-6DB33F?logo=springboot&logoColor=white)             | 3.3.4    | 경량화된 자바 프레임워크, RESTful API 구축 및 서버 사이드 로직 처리                                                                              |
| ![Spring Security](https://img.shields.io/badge/Spring%20Security-3.3.4-6DB33F?logo=springsecurity&logoColor=white) | 3.3.4    | Spring Boot를 사용하여 개발하는 과정에 높은 연동성을 제공 <br> 인증, 권한 부여, 접근 제어 지원. JWT와 연동해 토큰 기반 인증 구현                 |
| ![JWT](https://img.shields.io/badge/JWT-0.11.5-000000?logo=jsonwebtokens&logoColor=white)                           | 0.11.5   | Stateless 인증 지원. Access/Refresh Token 전략으로 확장성 제공                                                                                   |
| ![JPA](https://img.shields.io/badge/JPA-Hibernate%20based-59666C?logo=hibernate&logoColor=white)                    | 3.3.4    | ORM 기술로 객체지향적 데이터 접근 제공 <br> 단순한 DB조작 처리 |
| ![QueryDSL](https://img.shields.io/badge/QueryDSL-5.0.0-5DACDF?logo=querydsl&logoColor=white)                    | 5.0.0    | 컴파일 시점 타입 체크가 가능한 동적 쿼리 빌더 <br> 복잡한 검색 조건에 따른 동적 필터링 처리 및 공간 연산을 처리하여 서비스를 구현하는 이번 프로젝트에 적합 |
| ![MySQL](https://img.shields.io/badge/MySQL-AWS%20RDS-4479A1?logo=mysql&logoColor=white)                            | AWS RDS  | 관계형 데이터베이스                                                                                                                              |
| ![Redis](https://img.shields.io/badge/Redis-8.4-FF4438?logo=Redis&logoColor=white)                            | 8.4 (Cloud)  | 안 읽은 메시지 카운팅 및 토큰 관리를 위한 인메모리 DB                                                                                                                              |
| ![Jakarta Mail](https://img.shields.io/badge/Jakarta%20Mail-2.0.3-FB7200?logo=maildotru&logoColor=white)            | 2.0.3    | 이메일 발송 지원                                                                                                                                 |
| ![AWS S3](https://img.shields.io/badge/AWS%20S3-2.2.6-569A31?logo=amazons3&logoColor=white)                         | 2.2.6    | 이미지/파일 업로드 및 관리                                                                                                                       |
| ![WebSocket](https://img.shields.io/badge/WebSocket-3.3.4-FF6F00?logo=websocket&logoColor=white)            | 3.3.4    | STOMP 기반의 실시간 양방향 채팅 구현                                                                                                                                 |
| ![Hibernate Spatial](https://img.shields.io/badge/spatial-Hibernate%20based-59666C?logo=hibernate&logoColor=white)            | 6.2.9    | 좌표 데이터를 Geometry 타입으로 관리, ST_Contains 등 공간 함수를 통한 위치 기반 데이터 처리                                                                                                                                 |

### Front-end

- HTML, CSS : 웹 표준을 준수한 마크업 및 스타일링
- React : 컴포넌트 기반의 UI 라이브러리를 활용하여 효율적인 상태 관리 및 인터랙티브한 사용자 인터페이스 구현
- Axios: 백엔드와의 HTTP 통신을 위한 비동기 요청 처리 라이브러리

<br>

### 서비스 배포 환경

- 프론트엔드, 백엔드

  - <img src="https://img.shields.io/badge/aws-F68F1E?style=for-the-badge&logo=aws&logoColor=white">

    - <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">
    - <img src="https://img.shields.io/badge/ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white">
    - <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">

<br>

### 버전 및 이슈관리

<img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

### 협업 툴

<img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white"> <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">

### 기타

<img src="https://img.shields.io/badge/lombok-A42E2B?style=for-the-badge&logo=lombok&logoColor=white"> <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black">

<br>

## 브랜치 전략

- Git-flow 전략을 기반으로 master, develop 브랜치와 featue 등의 기능 브랜치를 활용했습니다.
  - master : 배포 단계에서만 사용하는 브랜치입니다.
  - develop : 개발 단계에서의 master 역할을 하는 브랜치입니다.
  - review : 기능 브랜치를 develop에 merge하기 전 코드 리뷰를 통해 정상적으로 동작을 하는지 확인하는 역할을 하는 브랜치입니다.
  - feature: 기능 단위로 독립적인 개발 환경을 위해 사용하고 merge 후 브랜치를 삭제해주었습니다.
  - refactor: 기존 코드를 개선하고 구조를 변경하는 브랜치입니다. review으로 merge 후 브랜치를 삭제해 주었습니다.

<br>

## 프로젝트 구조

```

# category : 상품 카테고리
# chatting : 채팅
# common : 쿠키 관리
# config : jwt, oauth 및 각종 설정 관리
# exception : 전역 예외 관리
# map : 지도
# product : 상품
# product_review : 상품 후기
# rental_record : 대여 기록
# user : 회원
# user_review : 회원 후기
# utils : s3


src
├── main
│   └── java
│       └── com
│           └── team01
│               └── billage
│                   ├── category
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── chatting
│                   │   ├── controller
│                   │   ├── dao
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── common
│                   ├── config
│                   │   ├── jwt
│                   │   └── oauth
│                   ├── exception
│                   ├── map
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── product
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── enums
│                   │   ├── repository
│                   │   └── service
│                   ├── product_review
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── rental_record
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── user
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── dto
│                   │   ├── repository
│                   │   └── service
│                   ├── user_review
│                   │   ├── controller
│                   │   ├── domain
│                   │   ├── repository
│                   │   └── service
│                   └── utils
│                       └── s3
└── test
    └── java
        └── com
            └── team01
                └── billage
                    ├── config
                    │   └── jwt
                    └── member
                        ├── controller
                        ├── repository                    
                        └── service



```

<br>

## ERD

<img width="2773" height="1467" alt="Image" src="https://github.com/user-attachments/assets/e7857a50-5afe-4f6d-b6ce-1fae8e7b16b0" />

<br>
<br>
<br>

## 주요 기능

### 회원

- 이메일, 비밀번호 기반의 로그인 기능

  ![Image](https://github.com/user-attachments/assets/05db9b59-49ca-4e59-83ce-8cf08ceaaaad)

- 이메일, 비밀번호 기반의 회원가입 기능

  ![Image](https://github.com/user-attachments/assets/5de82821-1b48-4b91-8427-1c1183531304)

- Google API Cloud를 연동한 로그인 기능

  ![Image](https://github.com/user-attachments/assets/9308ef16-c774-406e-bb3b-f14cda32ad7c)

- 클라이언트에 저장된 AccessToken으로 로그인 유지 가능
- 토큰 탈취 대책으로 짧은 수명의 AccessToken 생성, 자동 재발급을 위한 RefreshToken 쿠키 저장

<br>

### 지역

- 활동 지역 설정 기능

  ![Image](https://github.com/user-attachments/assets/e7142e13-58cf-4869-92c7-2f26f9480e9b)

<br>

### 상품

- 카테고리 및 활동 지역을 필터링하여 상품 조회

  ![Image](https://github.com/user-attachments/assets/eb54f82e-65fb-4228-bd66-808652a988af)

- 상품 등록
  - 상품 등록 시 지도에 마커를 찍어 거래 희망 장소 선택

  ![Image](https://github.com/user-attachments/assets/c0c8d0e6-e382-49ab-846b-c4213de88c2a)
  
- 상품 수정 및 삭제

  ![Image](https://github.com/user-attachments/assets/6bb35b18-25be-4a68-83e7-4e30b7fd2ee6)

<br>

### 채팅

- 판매자와 구매자간의 채팅 기능
  - 채팅이 오면 아래의 카운트 수 증가

  ![Image](https://github.com/user-attachments/assets/32a792ef-7ae5-401a-8b63-a07061ee8c6b)

<br>

### 대여

- 내가 빌려주는 물건에서 대여중으로 변경을 누르면 대여 등록 화면으로 이동
  - 채팅 기록을 바탕으로 누구에게 빌려줄 것인지 선택하여 대여 가능

  ![Image](https://github.com/user-attachments/assets/bf0afc2d-39f2-4ec2-90e8-135439c814d4)

<br>

### 후기

- 판매자

  - 판매자가 반납 완료를 누르면 구매자 후기 등록 가능

  ![Image](https://github.com/user-attachments/assets/c54edadd-0027-4859-b7cb-e0af6d139776)

- 구매자

  - 판매자가 반납 완료를 누르면 구매자 또한 판매자에 대한 후기와 물건에 대한 후기 등록 가능

  ![Image](https://github.com/user-attachments/assets/b759702b-1581-4778-9913-0926e9d550de)

<br>

## Exception Handling & HTTP Status Code

```
### 1. **400 Bad Request**
클라이언트의 잘못된 요청으로 인해 발생하는 오류입니다.
- **PRODUCT_MODIFICATION_NOT_ALLOWED**: 현재 대여 중인 상품은 수정/삭제할 수 없습니다.
- **USER_ALREADY_DELETED**: 이미 삭제된 회원입니다.
- **PASSWORD_NOT_MATCH**: 비밀번호가 올바르지 않습니다.
- **EMPTY_LOGIN_REQUEST**: 이메일 또는 비밀번호가 비어있습니다.
- **PRODUCT_ID_REQUIRED**: 상품 ID는 필수입니다.
- **INVALID_QUERY_PARAMETER_TYPE**: 유효하지 않은 쿼리 파라미터 유형입니다.
- **INVALID_CHAT_TYPE**: 올바르지 않은 채팅방 조회 타입입니다.
- **EMAIL_NOT_VERIFIED**: 인증 완료되지 않은 이메일입니다.

### 2. **401 Unauthorized**
인증되지 않은 사용자가 접근을 시도할 때 발생하는 오류입니다.
- **INVALID_EMAIL_CODE**: 잘못된 인증 코드입니다.
- **EXPIRED_EMAIL_CODE**: 만료된 인증 코드입니다.
- **INVALID_TOKEN**: 유효하지 않은 토큰입니다.
- **INVALID_REFRESH_TOKEN**: 유효하지 않은 REFRESH 토큰입니다.
- **UNAUTHORIZED_USER**: 인증되지 않은 사용자입니다.

### 3. **403 Forbidden**
사용자가 권한이 없는 리소스에 접근하려 할 때 발생하는 오류입니다.
- **WRITE_ACCESS_FORBIDDEN**: 후기 작성 권한이 없습니다.
- **CHANGE_ACCESS_FORBIDDEN**: 변경 권한이 없습니다.
- **CHATROOM_ACCESS_FORBIDDEN**: 채팅방에 참여 중이지 않습니다.
- **NOT_PRODUCT_OWNER**: 상품의 주인이 아닙니다.
- **UNAUTHORIZED_WEBSOCKET_CONNECTION**: 웹소켓 연결을 다시 확인해주세요. 토큰이 있나요?
- **ACCESS_DENIED**: 접근 권한이 없습니다.
- **CHATROOM_VALIDATE_FAILED**: 구매자 또는 판매자가 토큰의 값과 다릅니다.

### 4. **404 Not Found**
요청한 리소스가 존재하지 않을 때 발생하는 오류입니다.
- **CATEGORY_NOT_FOUND**: 해당 카테고리를 찾을 수 없습니다.
- **PRODUCT_NOT_FOUND**: 해당 상품을 찾을 수 없습니다.
- **USER_NOT_FOUND**: 해당 유저를 찾을 수 없습니다.
- **RENTAL_RECORD_NOT_FOUND**: 해당 대여기록을 찾을 수 없습니다.
- **CHATROOM_NOT_FOUND**: 해당 채팅방을 찾을 수 없습니다.
- **CHAT_NOT_FOUND**: 해당 ID를 가진 채팅을 찾을 수 없습니다.
- **THUMBNAIL_NOT_FOUND**: 썸네일 이미지를 찾을 수 없습니다.
- **PRODUCT_IMAGE_NOT_FOUND**: 해당 상품 이미지를 찾을 수 없습니다.
- **EMD_AREA_NOT_FOUND**: 행정 구역을 찾을 수 없습니다.
- **ACTIVITY_AREA_NOT_FOUND**: 활동 지역을 찾을 수 없습니다.
- **NEIGHBOR_AREA_NOT_FOUND**: 이웃 지역을 찾을 수 없습니다.
- **ADDRESS_NOT_FOUND**: 주소를 찾을 수 없습니다.

### 5. **409 Conflict**
리소스의 현재 상태와 충돌할 때 발생하는 오류입니다.
- **USER_ALREADY_EXISTS**: 해당 유저가 이미 존재합니다.
- **EMAIL_ALREADY_EXISTS**: 해당 이메일이 이미 존재합니다.
- **NICKNAME_ALREADY_EXISTS**: 해당 닉네임이 이미 존재합니다.
- **REVIEW_ALREADY_EXISTS**: 해당 거래에 대한 리뷰가 이미 존재합니다.
- **PRODUCT_ALREADY_RETURNED**: 이미 반납이 완료된 상품입니다.
- **LIKE_ALREADY_EXISTS**: 이미 좋아요를 한 상품입니다.

### 6. **500 Internal Server Error**
서버 내부에서 예상치 못한 오류가 발생했을 때 반환하는 상태 코드입니다.
- **PUT_OBJECT_EXCEPTION**: S3 업로드 중 오류가 발생했습니다.
- **IO_EXCEPTION_ON_FILE_DELETE**: 이미지 삭제 중 오류가 발생했습니다.
- **SERVER_ERROR**: 서버에 문제가 발생했습니다.
```
