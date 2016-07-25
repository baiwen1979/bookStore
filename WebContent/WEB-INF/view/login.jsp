<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>用户登录</h2>
<s:form theme="simple" action="login" method="post">
  <s:actionerror/>
  <p><label>登录名:</label><s:textfield name="loginId"/></p>
  <p><label>密码:</label><s:password name="password"/></p>
  <p class="action-bar"><s:submit value="登录" cssClass="button-blue"/></p>
</s:form>