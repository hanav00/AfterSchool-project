<h1>:cherry_blossom:Creating a Bulletin Board Application with the Spring Boot</h1>

<hr>
<span>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/apachetomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"/>
  <img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
</span>
<br>
<span>
  <img src="https://img.shields.io/badge/Java 17.0.6-007396?style=for-the-badge&logo=OpenJDK&logoColor=white"/>
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=black"/>
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=black"/>
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=black"/>
</span>

:calendar: 2023.05.30 ~ 06.20<br>
:raising_hand: Team Project<br>
:flushed: My role was.. <br>


<hr>


이전 프로젝트에서 게시판을 구현하기 위한 기본 알고리즘들을 연습하였다. 
이번 프로젝트에서는 단순히 전에 구현한 회원관리와 게시판 기능만이 아니라, 수강신청, 내 강의실, 강의 재생 및 강의 수강 기록 저장, 강의 평가 기능이 있는 인트라넷 구현하였다.



<h2>Step 1: 프로젝트 주제 선정</h2>
브레인스토밍을 진행하여 프로젝트의 주제에 대한 다양한 아이디어를 모으고, 회의를 통해 모두가 만족할 만한 내용을 주제로 선정하였다.
주제 선정의 기준은 다음과 같다.

- 이전 게시판 프로젝트와 너무 동일하지 않은가? (새롭게 응용할 수 있는 요소가 있는가?)
- 우리가 배우지 않은 아예 새로운 기술을 필요로 하지 않는가?
- 주제가 너무 쉽거나 어렵지 않아서 주어진 기간(1달)을 최대한 활용해서 완성을 할 수 있는가?
- 팀원 모두가 이해하기 어려운 전문적인 지식을 요구하지 않는가?

회의를 통해 정해진 주제는 온라인 강의 플랫폼이었다. 
단순한 인터넷 강의가 아니라, 다양한 원인으로 발생하는 교육 기회의 불균형을 해소하기 위해 어디서든 들을 수 있는 온라인 방과후 교육을 목적으로 하는 플랫폼을 만들기로 하였다.


<h2>Step 2: 화면 기능 구성 및 디자인 도안</h2>
스프링 프로젝트를 생성하고, 프로젝트의 디렉터리 구조를 설정한다. 데이터베이스와 연결을 위한 기본 설정도 한다. 이 프로젝트에서는 MariaDB를 사용하였다.


<h2>Step 3: 데이터베이스 테이블 설계 및 연동</h2>
게시글과 관련된 데이터를 저장할 테이블을 설계하고, JDBC를 사용해서 연동한다.

|테이블 이름|칼럼 명|설명|
|---|---|---|
|`tbl_board`|seqno|글 번호, PK|
||writer|글 작성자 이름(username)|
||title|글 제목|
||userid|글 작성자 아이디|
||content|글 내용|
||hitno|글 조회수|
||regdate|글 작성일|
||likecnt|글의 좋아요 개수|
|`tbl_file`|fileseqno|파일 번호, PK|
||org_filename|원본 파일 명|
||stored_filename|저장된 파일 명|
||filesize|파일 사이즈|
||userid|파일 올린 글의 작성자|
||seqno|파일 올린 글의 번호|
||checkfile|글 수정에서 파일을 삭제할 경우 N으로 체크|
|`tbl_like`|seqno|좋아요 누른 글 번호, PK|
||userid|좋아요 누른 사람의 아이디, PK|
||mylikecheck|좋아요 누른 상태 체크|
||likedate|좋아요 누른 시간|
|`tbl_reply`|replySeqno|댓글 번호, PK|
||replyWriter|댓글 작성자 이름|
||replyContent|댓글 내용|
||userid|댓글 작성자 아이디|
||seqno|댓글 단 글 번호|
||replyRegdate|댓글 단 시간|
||avatar|댓글 단 사람의 아바타|
|`tbl_user`|userid|회원의 아이디, PK
||username|회원의 이름
||password|회원의 비밀번호
||email|회원의 이메일
||gender|회원의 성별
||job|회원의 직업
||description|회원의 자기소개
||birthdate|회원의 생년월일
||country|회원의 국적
||role|회원의 역할(MASTER 역할 구분을 위해)
||avatar|회원의 아바타|
||authkey|자동로그인 체크|
||lastPasswordUpdate|마지막 비밀번호 변경일


<h2>Step 4: 스프링 MVC 구조에 맞는 코드 작성</h2>

|MVC구조|구성|
|---|---|
|View|board(list, modify, view, write.jsp)|
||user(login, signUp, mypage, changeInfo, changePassword, findMyId, IDView, findMyPassword, tempPasswordView.jsp)|
||master(boardmanage, filemanage, membermanage, sysinfo, sysmanage|
|Controller|Board, User, Master Controller.java|
|DAO|Board, User, Master DAO/DAOImpl.java|
|Mapper|Board, User, Master Mapper.xml|
|DTO|Board, File, Like, Reply, User VO.java|
|Service|Board, User, Master Service/ServiceImpl.java|
|util|Page.java|


<h2>Step 5: 페이지 UI 수정(CSS)</h2>


<h2>Step 6: 접근 권한/알람 설정 테스트</h2>
현재 session ID와 role을 확인하여 링크를 직접 치고 들어가도 해당 사용자가 아니면 페이지가 제한되도록 설정하였다. 
알람은 입력 페이지를 벗어날 때, 데이터가 영구 삭제될 때, 다른 기능에도 영향을 끼칠 때, 필수 정보를 미기입했을 때 알람이 떠서 사용자에게 알려주도록 설정하였다.


<h2>Step 7: 배포</h2>
가상 도메인을 설정해서 배포하였다.
