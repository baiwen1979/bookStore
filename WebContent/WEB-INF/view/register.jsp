<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>用户注册</h2> 
<s:form theme="simple" action="register" method="post">
  <s:actionerror/>      
  <p><label>登录名:</label><s:textfield name="loginId"/></p>
  <p><label>姓名:</label><s:textfield name="name"/></p>
  <p><label>密码:</label><s:password name="password"/></p>
  <p><label>确认密码:</label><s:password name="password2"/></p>
  <p><label>性别:</label><s:radio name="sex" list="#{'M':'男','F':'女'}"/></p>
  <p><label>出生日期:</label><s:textfield name="birthday" /></p>
  <p class="action-bar"><s:submit value="注册"/></p>
</s:form>