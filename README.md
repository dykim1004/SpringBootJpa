# SpringBootJpa
   - 목표 SpringBoot + Jpa + MongoDB.. 소셜 로그인

* 공부 방향 선회 http://millky.com/@origoni/post/1152 블로그의 포스팅을 참고하여 블로그 만드는 예제를 따라해보기


# 참고
http://kwonnam.pe.kr/wiki/gradle/dependencies -> gradle 설명

# SpringLoaded 적용 방법

   -javaagent:"<path-to>/springloaded-1.2.1.RELEASE.jar" -noverify

eclipse : Run As → Run Configurations… → Java Application → <project_name> → Arguments → VM arguments 텍스트 박스에 추가
           Run As → Run Configurations… → Apache Tomcat → <Tomcat v7.0 Server at localhost> → Arguments → VM arguments 텍스트 박스에 추가

# thymeleaf Reload
application.properties -> spring.thymeleaf.cache=false

# spring xml 기반 ecache 설정 참고 사이트
https://donghwi-kim.github.io/jekyll/update/2015/04/05/ehcache.html
