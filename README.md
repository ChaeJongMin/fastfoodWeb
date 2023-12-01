# 1. Project Title

패스트푸트 

### 환경
 IDE: 인텔리제이, Brackets</br>
 프레임워크: Spring Boot</br>
 Skill: JPA, Spring Security, Thymeleaf, JUnit, AWS(현재 사용하지 않고있습니다.)</br> 
 사용한 언어: HTML5/CSS3, Java, JavaScript</br> 
 DB : MySQL</br>
 OS : Windows, Linux(aws 배포 시 사용)</br>
 CI/CD : TravisCI, AWS Code Deploy (현재 사용하지 않고있습니다.)

## 2. 프로젝트 진행

### 21.04 ~ 21.07 
개발 인원: 3인
일반적인 패스트푸트 웹 완성

+ ### V1 (개인)
 #### 22.09 ~ 22.10 
 AWS EC2에 서버 배포 (현재 배포 중단)
 (이후 기능 추가와 수정은 1인 개발)

 #### 22.12 
 기존 프로젝트는 Entity Repository Controller 로 이루어졌는데 여러 교재를 통해 잘못된 설계를 하게 된것을 알게되어 
 Entity Repository Dto Service Controller로 분리를 해봤습니다.</br>
 그러나 막상 구현해보니 해당 계층은 제 역할을 못하는 것 같습니다.

 #### 23.02
 게시판, 댓글, 페이징, 검색 기능을 추가해봤습니다.</br>
 해당 기능 구현을 통해 API 구현, 계층 분리, 커스텀 어노테이션 만들기, Auditing 등 다양한 것을 구현하고 알게되었습니다.

 #### 23.02.22
 스프링 시큐리티 적용(form login 방식 사용)</br>
 그러나 rest Api하게 만들기 위해 JWT TOKEN, OAuth2 적용 필요

 #### 23.02.24
 고객 정보를 처리하기 위해 고객 api 개발</br>
 잘못 구현한 Service 계층, DTO 등  수정

 #### 23.02.27
 제품 구매를 위해 장바구니 api 개발</br>
 잘못 구현한 Service 계층, DTO 등  수정

 #### 23.03.01
 주문을 위한 Api 개발 및 DTO, Service 계층 등 수정</br>
 메뉴페이지 새롭게 디자인</br>
 고객이 사용하는 기능들을 모두 수정 및 기능 추가 완료

 #### 23.03.04
 기존의 로그인 페이지 디자인을 변경했습니다.

 #### 23.03.26
 JWT 기능(발급, 재발급, 로그아웃 완료) 구현했으나 모든페이지 적용 X ---> 기능만 확인
 400번대 상태코드 처리
+ ### V2 (개인)

### ※ 참고한 교재
1. 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 
2. 스프링 부트 퀵스타트</br>

