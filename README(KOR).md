<h1>:cherry_blossom: 스프링 부트 기반 온라인 교육 사이트 구축</h1>

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
:raising_hand: 팀 프로젝트 (5명)<br>
:flushed: 역할은.. PM + Front + DB설계 <br>


<hr>



이전 프로젝트에서는 게시판을 구현하기 위한 기본 알고리즘을 연습했다. 하지만 이번 프로젝트에서는 회원관리와 게시판 기능뿐만 아니라 수강신청, 내 강의실, 강의 재생 및 강의 수강 기록 저장, 강의 평가 기능이 있는 인트라넷을 구현했다. 이에 따라 프로젝트의 범위와 복잡성이 이전보다 크게 증가하였다.

나는 이번 프로젝트에서 PM 역할뿐만 아니라 Front-end 개발도 담당하였고, 데이터베이스 설계도 새로 진행하였다. 이는 팀원들과의 원활한 소통과 협업을 위함이었다. 프로젝트의 성공을 위해서는 데이터베이스 설계가 로직에 어긋나지 않게 설계되어야 했고, 그렇게 때문에 다른 팀원들의 검토 역시 적극적으로 수용하여 진행하였다.



<h2>Step 1: 프로젝트 주제 선정</h2>
프로젝트 시작 단계에서는 주제 선정을 위해 브레인스토밍을 진행하였고, 회의를 통해 모두가 만족할 만한 주제를 결정하였다. 
주제 선정의 기준은 이전 프로젝트와의 중복성, 새로운 기술 필요성, 완성 가능한 기간 등을 고려하였다. 

- 이전 게시판 프로젝트와 너무 동일하지 않은가? (새롭게 응용할 수 있는 요소가 있는가?)
- 우리가 배우지 않은 아예 새로운 기술을 필요로 하지 않는가?
- 주제가 너무 쉽거나 어렵지 않아서 주어진 기간(1달)을 최대한 활용해서 완성을 할 수 있는가?
- 팀원 모두가 이해하기 어려운 전문적인 지식을 요구하지 않는가?

최종적으로 온라인 강의 플랫폼을 주제로 선택하였으며, 이는 다양한 원인으로 발생하는 교육 기회의 불균형을 해소하기 위한 목적을 가지고 있습니다.



<h2>Step 2: 화면 기능 구성 및 디자인 도안</h2>
화면 기능 구성과 디자인 도안 작업은 병행하여 진행하였다. 화면 구성을 미리 정하는 것은 필요한 기능을 파악하고 효율적인 작업을 위해 중요하다. 또한, UI 디자인 역시 전체적인 사용자 경험을 고려하여 통일성 있고 직관적인 디자인을 구현하기 위해 중요한 요소이다. 그렇기 때문에 한 명이 전체적으로 진행을 하고 나머지가 검토 후 수정사항을 말하는 것이 낫겠다고 판단하였다. 
디자인하는 것을 좋아하기도 했고, Figma 툴을 쓰는 것에 금방 익숙해져서 내가 전체적인 도안을 제작하였다.
(Figma 일부)
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/ce20a72e-0778-43ed-9827-5d4a517c1c1c">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/db9fd653-b292-4d9b-8b44-734c1da2e07d">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/a8251b6b-d63c-4ef9-9902-c9079a172c15">



<h2>Step 3: 화면 기능 명세서</h2>
화디자인 도안을 기반으로 각 페이지의 기능과 필요한 데이터를 문서화하여 화면 기능 명세서를 작성하였다. 이를 통해 개발자들 간의 의사소통과 작업의 일관성을 높일 수 있으며, 작업의 방향성을 명확하게 설정할 수 있었다.
(명세서 일부)
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/70f58378-c790-4041-bf7d-da7bfc5f6b8c">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/29391361-50a7-45d9-ae80-38a7ec7a9499">



<h2>Step 4: 데이터베이스 설계</h2>
데이터베이스 설계는 게시판 관리와 회원 관리 부분은 이전 프로젝트에서 활용한 것과 크게 다르지 않았지만, 강좌와 수강 관리 부분은 새롭게 설계되었다. 이를 통해 프로젝트의 요구사항에 맞는 데이터베이스 구조를 구축하고 데이터 관리를 효율적으로 할 수 있었습니다.

밑은 강좌와 수강 관리 부분의 테이블 명세서이다.
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/d5ed4144-98a7-4c54-8c7c-4d1363423955">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/50da30c2-ece5-4659-8ca3-c90602d7ccbc">



<h2>Step 5: 각자 맡은 일 진행</h2>
각자 맡은 일을 진행하면서 프로젝트를 점진적으로 완성해 나갔으며, 문서화와 팀원들과의 소통을 통해 업무 협업을 원활하게 진행하였다.
내가 맡은 파트는 게시판 관리 전체와 강좌 관리 중 회원 정보 변경 기능만 제외한 마이페이지 학생, 강사 페이지였다.

- 메인 페이지
- 대부분의 페이지에 들어갈 session role에 따라 메뉴가 달라지는 헤더
- 자유게시판/공지게시판 전체
- 마이페이지 학생: 수강중, 수강완료, 내 리뷰, 찜하기 목록 보기
- 마이페이지 학생: 강좌 평가하기(리뷰 남기기)
- 마이페이지 강사: 승인 완료, 승인 대기, 승인 거절 강좌 목록 보기
- 마이페이지 강사: 신규 강좌 신청하기


프로젝트를 진행하면서, 백엔드와 프론트엔드 간의 소통을 원활하게 하기 위해 구두로 의사소통하는 것보다 문서화를 통해 참고할 수 있는 자료를 만들기로 결정하였다. 
이에 따라 데이터 API 문서를 작성하여 데이터 통신에 사용되는 데이터 모델, 요청 형식, 응답 형식 등을 자세히 기록하였다. 
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/b0454b9a-7992-45f1-8c51-f620a80ad4b2">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/9e17998c-cef3-41dd-91a9-5ee9b089a9b9">
이러한 API 문서 덕분에 백엔드과 프론트엔드 간의 의사소통에서 발생할 수 있는 오류와 갈등을 사전에 차단할 수 있었다.



<h2>Step 6: 합본 만들기</h2>
프로젝트 마감 기한에 다가가면서 합본을 만들기 위해 마감 일주일 전부터 조금씩 작업물을 합치기 시작하였다. 조금 일찍 시작한 이유는 추후에 합치는 과정에서 발생할 수 있는 오류를 방지하기 위함이었다.

마감일 이틀 전부터는 모든 작업물을 하나의 합본으로 만들어 진행하였다. 이 단계에서는 각 팀원들이 담당한 부분을 개별적으로 작업하고, 자신의 코드에서 변경된 부분을 업로드하여 제가 확인한 후 합본에 추가하는 방식을 채택하였다. 이를 통해 팀원들 간의 작업 혼선을 최소화하고, 전체적인 프로젝트의 통합을 원활하게 진행할 수 있었다.


<h2>Step 6: CSS 수정</h2>
CSS는 잘하는 팀원이 80% 도맡아서 하였다..ㅎㅎ 페이지 UI가 비슷한 부분은 그 팀원이 짠 코드에서 복사해와서 동일하게 css를 적용시켰다.
