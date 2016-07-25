<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>购物车</h2>
<s:if test="#session.cart.orderItems.size>0">
  <s:form theme="simple" action="updateCart" method="post">
    <table id="cart" class="table table-striped">
      <tr><th>图书名称</th><th>价格</th><th>数量</th><th>操作</th></tr>
    <s:iterator value="#session.cart.orderItems">
      <tr>
	    <td>
	      <input type="hidden" name="bookId" value="<s:property value="book.id"/>"/>
	      <s:property value="book.name"/>
	    </td>
	    <td>
	      <s:property value="book.price"/>
	    </td>
	    <td>
	      <s:if test="quantity>1">
	      <a href="updateCart.action?bookId=<s:property value="book.id"/>&quantity=<s:property value="quantity-1"/>">[-]</a>
	      </s:if>
	      <s:else>
	      <span>[-]</span>
	      </s:else>
	      <s:textfield name="quantity" cssClass="number"/>
	      <a href="updateCart.action?bookId=<s:property value="book.id"/>&quantity=<s:property value="quantity+1"/>">[+]</a>
	    </td>
	    <td>
	      <a href="removeFromCart.action?bookId=<s:property value="book.id"/>">[删除]</a>
	    </td>
      </tr>
    </s:iterator>
      <tr>
        <td id="totalPrice" colspan="4">
          <strong>总价：</strong>
          <em class="price"><s:property value="#session.cart.totalPrice"/></em>
        </td>
      </tr>
    </table>
    <p class="action-bar">
      <s:submit value="更新数量"/>
      <a href="checkout.action" class="button button-red">去结算</a>
    </p>
  </s:form>
</s:if>
<s:else>
  <p class="message">购物车为空，您还没有购买任何图书！</p>
  <p class="action-bar"><a class="button" href="index.jsp">返回首页</a></p>
</s:else>