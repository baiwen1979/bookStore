<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>结算成功，订单信息如下：</h2>
<table id="order" class="table">
  <caption>
     <label>订单号：</label><strong>#<s:property value="model.id"/></strong>
     <label>总价格：</label><em class="price"><s:property value="model.totalPrice"/></em>
     <label>用户：</label><em><s:property value="model.user.name"/></em>
     <label>订单日期：</label><s:date format="yyyy-MM-dd HH:mm:ss" name="model.creationDate"/>
  </caption>
    <tr><th>图书</th><th>单价</th><th>数量</th><th>价格</th></tr>
  <s:iterator value="model.orderItems">
    <tr>
      <td>
        <img class="book small" alt="<s:property value="book.name"/>" src="images/<s:property value="book.coverImageFile"/>"/>
        <strong><s:property value="book.name"/></strong>
      </td>
      <td><s:property value="book.price"/></td>
      <td><s:property value="quantity"/></td>
      <td><s:property value="quantity*book.price"/></td>
    </tr>
  </s:iterator>
</table>
<p class="action-bar"><a class="button" href="index.jsp">返回首页</a></p>