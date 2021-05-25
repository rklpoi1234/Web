<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>join</h1>
<script defer src="/res/js/join.js"></script>

<form action="/user/join" method="post" id="frm" 
	onsubmit="return frmChk();">
	<div>
		<input type="text" name="uid" placeholder="id">
		<input type="button" id="btnChkId" value="중복ID체크">
	</div>
	<div id="chkUidResult"></div>
	<div><input type="password" name="upw" placeholder="password"></div>
	<div><input type="password" name="chkUpw" placeholder="password chk"></div>
	<div>
		gender:
		<label>female<input type="radio" name="gender" value="0" checked="checked"></label>
		<label>male<input type="radio" name="gender" value="1"></label>
	</div>
	<div><input type="text" name="unm" placeholder="name"></div>
	<div>
		<input type="submit" value="회원가입">
		<input type="reset" value="초기화">
	</div>
</form>
