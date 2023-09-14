<%@ page contentType="text/html; charset=UTF-8" %>
<%-- 웹브라우저에 출력되는 문자와 태그,언어코딩 타입을 설정해야 HTML태그,자바스크립트 등이 잘 적용되고,
	 한글이 안깨지게 잘 출력된다. --%>
	 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%-- EL즉 표현언어에서 사용한 serverTime은 HomeController.java에서 설정한 키이름이다. 이 이름을
	 참조해서 시간/날짜 포맷값을 가져온다. --%>
</body>
</html>
