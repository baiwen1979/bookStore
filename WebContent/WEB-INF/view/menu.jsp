<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>图书分类</h2>
<ul id="categories">
  <s:iterator value="categories">
	<li <s:if test="id==categoryId">class="selected"</s:if>>
	  <a href="bookList?categoryId=<s:property value="id"/>"> 
		<s:property value="name" />
	  </a>
	</li>
  </s:iterator>
</ul>