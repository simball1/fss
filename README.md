# 영화 별 점 fss(Film Stars Score) 서비스

## 개발환경
- Windows
	- Spring Tool Suite 4
	- Verstion: 4.1.2.RELEASE
	- Build Id:
	
- Java Version: 1.8.0.291
- Spring Boot Verstion: 2.7.0

## 주요 흐름
- 영화 목록
	- 영화 목록이 나타남
	- 영화에 대한 기본 정보 표시
	- 영화 검색 기능
	- 영화에 달린 코멘트 및 댓글 확인 가능
	
- 회원 기능
	- 마이페이지 기능
	- 영화에 별점 매기기 기능
	- 별점 매긴 영화에 코멘트 등록 
	- 그 코멘트에 댓글 등록 기능
	- 코멘트와 댓글에는 좋아요 기능

- 관리자 기능
	- 영화 추가/삭제/수정 가능
	
## DB 구성
- 영화 테이블(film)
	- id(영화 고유번호)
	- title(영화 제목)
	- director (영화 감독)
	- cast (영화 배우)
	- releaseDate (개봉일)
	- starScoreList (별점목록)
	
- 별점 테이블(starScore)
	- id(별점 고유번호)
	- stars(별점)
	- SiteUser(회원)

- 코멘트 테이블
- 댓글 테이블
- 회원 정보 테이블(SiteUser)
	- id(회원 고유번호)
	- userid(아이디)
	- password(비밀번호)
	- email(이메일)
	- username(닉네임)
	- watchedFilmList(본 영화목록)
	
## 실행 방법
-

## 릴리즈 방법
-

## 계정 정보
-

## 호스팅 서버 관련
-

## 이슈 사항
- 엔티티, dto, vo 등으로 역할 분리

## 버전 정보 관리
- 0.0.1-SNAPSHOT (2022-06-27)
	- 초기버전 생성

