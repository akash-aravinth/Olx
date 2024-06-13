<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, com.akash.app.model.Product , com.akash.app.dao.GetProduct" %>

<div>
<h2>Show All</h2>
    <%
    GetProduct product = new GetProduct();
    List<Product> productList = product.getProduct();
    request.setAttribute("List", productList);
    %>
    <c:forEach var="p" items="${List}">
                    <p>${p.getProductid()}</P>
                </c:forEach>


                <img src = "./images/iphone.png" alt = "image" />


</div>