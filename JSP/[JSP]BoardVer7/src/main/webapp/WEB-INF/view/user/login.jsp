<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>login</h1>
<div>${requestScope.errMsg }</div>

	<form action="/user/login" method="post">
			<div><input type="text" name="uid" placeholder="id" value="kim"></div>
			<div><input type="password" name="upw" placeholder="pass" value="6913"></div>
			<input type="submit" name="login">
	</form>
	
<div>
	<a href="/user/join">회원가입</a>
</div> 