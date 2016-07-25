<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div>
  <p><label>登录名：</label><s:property value="loginId"/></p>
  <p><label>姓名：</label><s:property value="name"/></p>
  <p><label>性别：</label><s:if test="sex=='M'">男</s:if><s:else>女</s:else></p>
  <p><label>出生日期：</label><s:date format="yyyy年MM月dd日" name="birthday"/></p>
</div>