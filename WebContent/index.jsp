<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href="styles/style.css"/>
<title>叮当网上书店</title>
</head>
<body>
  <s:include value="/WEB-INF/view/header.jsp"/>
  <s:include value="/WEB-INF/view/nav.jsp"/>
  <div id="main-container" class="clearfix">
    <div id="aside">
      <s:action name="categories" executeResult="true"/>
    </div>
    <div id="content">
      <s:if test="#parameters.action!=null">
      	<s:action name="%{#parameters.action}" executeResult="true"/>      	
      </s:if>
      <s:elseif test="#parameters.page!=null">
        <s:include value="/WEB-INF/view/%{#parameters.page}.jsp"/>
      </s:elseif>
      <s:else>
        <s:action name="books" executeResult="true"/>
      </s:else>
    </div>
  </div>
  <s:include value="/WEB-INF/view/footer.jsp"/>
</body>
</html>