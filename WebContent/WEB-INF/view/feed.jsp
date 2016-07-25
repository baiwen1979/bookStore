<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<h2>填充样本数据</h2>
<s:form theme="simple" action="feedSampleData" method="post">
  <p><label>填充码：</label><s:password name="feedCode"/></p>
  <p class="action-bar"><s:submit value="确定"/></p>
</s:form>