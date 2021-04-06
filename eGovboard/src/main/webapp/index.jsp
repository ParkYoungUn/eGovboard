<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%-- <jsp:forward page="/register.do"/> --%>
<%-- <jsp:forward page="/egovSampleList.do"/> --%>

<%-- <%@ include file="WEB-INF/jsp/egovframework/example/user/login.jsp"%> --%>
<%-- <c:if test="${msg == 'success'}">
    <h2>${sessionScope.userName}(${sessionScope.userId})님 환영합니다.</h2>
    </c:if> --%>

<form role="form" method="post" autocomplete="off">
 <p>
  <label for="userId">아이디</label>
  <input type="text" id="userId" name="userId" />
 </p>
 <p>
  <label for="userPass">아이디</label>
  <input type="password" id="userPass" name="userPass" />
 </p>
 <p><button type="submit">로그인</button></p>
 
 <p><a href="/register.do">회원가입</a></p>
</form>
