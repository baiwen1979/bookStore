<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>订单列表</h2>
<s:if test="#session.user.orders.size>0">
  <s:iterator value="#session.user.orders">
  <table id="orders" class="table">
  <caption>
	    <label>订单编号：</label><strong>#<s:property value="id"/></strong>
	    <label>合计：</label><em class="price"><s:property value="totalPrice"/></em>
	    <label>订单日期：</label><em class="date"><s:date format="yyyy-MM-dd HH:mm:ss" name="creationDate"/></em>
  </caption>
  <tr><th>图书</th><th>单价</th><th>数量</th></tr>
    <s:iterator value="orderItems">
    <tr>
	  <td>
	    <img class="book small" src="images/<s:property value="book.coverImageFile"/>"/>
	    <strong><s:property value="book.name"/></strong>
	  </td>
	  <td><em id="price"><s:property value="book.price"/></em></td>
	  <td><em id="quantity"><s:property value="quantity"/></em></td>
    </tr>
	</s:iterator>
  </table>
  </s:iterator>
</s:if>
<s:else>
  <p class="message">您还没有下过订单，订单列表为空！</p>
  <p class="action-bar"><a class="button" href="index.jsp">返回首页</a></p>
</s:else>