<h1>:cherry_blossom:Creating an Online Education Website Project Based on Spring Boot




</h1>

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
:flushed: My role was.. Project Manager (PM), Front-end Developer, Database Designer<br>


<hr>




In the previous project, I practiced implementing basic algorithms for a bulletin board. However, in this project, the scope and complexity have significantly increased as it not only includes member management and bulletin board functionality but also implements features such as course registration, My Classroom, lecture playback, lecture attendance recording, and lecture evaluation on an intranet platform.

In this project, I took on the role of a project manager (PM) and also handled front-end development. I also took charge of designing the database, which was newly implemented. These decisions were made to facilitate smooth communication and collaboration with team members. For the project's success, it was essential to design the database in a way that aligns with the logic, which is why I actively sought input and feedback from other team members.



<h2>Step 1: Project Topic Selection</h2>
During the initial stage of the project, we brainstormed various ideas for the project's topic and decided on a topic that satisfied everyone through discussions. The criteria for topic selection were as follows:

- Is it not too similar to the previous bulletin board project? (Does it include elements that can be applied differently?)
- Does it require completely new technologies that we haven't learned?
- Is the topic not too easy or difficult so that we can make the most of the given timeframe (1 month) to complete it?
- Does it not demand specialized knowledge that is difficult for all team members to understand?

Ultimately, we chose to develop an online learning platform that aims to address the unequal access to educational opportunities caused by various factors.



<h2>Step 2: Screen Function Configuration and Design Mockup</h2>
To streamline the project, we simultaneously worked on screen function configuration and design mockups. Setting up the screen configuration in advance helps identify necessary features and facilitates efficient work. Additionally, having a unified and intuitive UI design is crucial for overall user experience. Therefore, it was decided that it would be better for one person to oversee the overall design, while others reviewed and provided feedback. I enjoyed working on the design and quickly familiarized myself with the Figma tool, allowing me to create the overall design mockups.
(Figma screenshots)
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/ce20a72e-0778-43ed-9827-5d4a517c1c1c">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/db9fd653-b292-4d9b-8b44-734c1da2e07d">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/a8251b6b-d63c-4ef9-9902-c9079a172c15">



<h2>Step 3: Screen Function Specification</h2>
Based on the design mockups, we documented the necessary features and data for each page in the form of screen function specifications. This documentation improves communication among developers and ensures consistency in their work. It also helps establish a clear direction for the project.
(Sample specifications)
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/70f58378-c790-4041-bf7d-da7bfc5f6b8c">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/29391361-50a7-45d9-ae80-38a7ec7a9499">



<h2>Step 4: Database Design</h2>
While the bulletin board and member management parts were similar to the previous project, the course and enrollment management parts were newly designed. This allowed us to establish a database structure that meets the project's requirements and efficiently manage data.

Here is an example of the table specifications for course and enrollment management:
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/d5ed4144-98a7-4c54-8c7c-4d1363423955">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/50da30c2-ece5-4659-8ca3-c90602d7ccbc">



<h2>Step 5: Individual Tasks Progress</h2>
We gradually completed the project by working on our assigned tasks, ensuring smooth collaboration and communication through documentation.

In my case, I was responsible for the overall bulletin board management, except for the member information modification feature, and also worked on the student and teacher pages in the My Page section.

- Main Page
- Header that dynamically changes menus based on the session role for most pages
- Freeboard/Noticeboard sections
- Student My Page: In Progress, Completed, My Reviews, Wishlist
- Student My Page: Course Evaluation (Leaving Reviews)
- Teacher My Page: Approved, Pending Approval, Rejected Course List
- Teacher My Page: Apply for New Course


To facilitate effective communication and collaboration between the back-end and front-end, I decided that documentation would be more beneficial than verbal communication.

Hence, I created an API documentation that detailed the data models, request formats, response formats, and other aspects of data communication. This API documentation played a crucial role in preventing conflicts and misunderstandings between the back-end and front-end teams.
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/b0454b9a-7992-45f1-8c51-f620a80ad4b2">
<img width="100%" src="https://github.com/hanav00/AfterSchool-project/assets/123611673/9e17998c-cef3-41dd-91a9-5ee9b089a9b9">



<h2>Step 6: Creating a Consolidated Version</h2>
To prevent last-minute errors that could arise during the integration process, we started merging our work gradually one week before the deadline. Starting two days before the deadline, we created a single consolidated version. 
During this stage, team members worked on their respective parts individually, and after uploading their code changes, I reviewed them and added them to the consolidated version. This approach minimized confusion during collaboration and ensured smooth integration of the overall project.



<h2>Step 7: CSS Refinements</h2>
One of the team members who excelled in CSS took charge of about 80% of the CSS work. For sections with similar UIs, we copied the CSS code from their work and applied it uniformly.
By adopting this approach, we maintained a consistent design and style throughout the project and efficiently progressed with our work. Additionally, by referencing the CSS code from that team member, we ensured consistency and minimized duplicate work.



<h2>Step 8: Access Authorization Testing</h2>
For managing login, logout, and access authorization, we primarily utilized Spring Security. Spring Security provides powerful security features, making it easy to implement authentication and authorization for web applications.

We implemented login and logout functionality using Spring Security, and managed access authorization. When a user logs in, their authentication is processed, and the authentication information is stored in the session. Upon logout, the session information is removed. Additionally, by configuring Spring Security, we enforced authorization for pages that required specific access permissions, blocking access for users without the necessary roles.

```java
		http
		.authorizeHttpRequests()
		.requestMatchers("/freeboard/**").hasAnyAuthority("STUDENT","MANAGER")
		.requestMatchers("/noticeboard/**").hasAnyAuthority("STUDENT","TEACHER","MANAGER")
		.requestMatchers("/manager/**").hasAnyAuthority("MANAGER")
		.requestMatchers("/student/**").hasAnyAuthority("STUDENT")
		.requestMatchers("/teacher/**").hasAnyAuthority("TEACHER")
		.requestMatchers("/**").permitAll()
		.anyRequest().authenticated();
```


<h2>Step 9: Deployment</h2>
Similar to the previous project, we deployed the application with a virtual domain.

