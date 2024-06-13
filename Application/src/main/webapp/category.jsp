    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, com.akash.app.model.Product , com.akash.app.dao.ProductDao" %>


           <%
               ProductDao product = new ProductDao();
               List<String> productList = product.getCategory();
               request.setAttribute("cat", productList);
           %>

<style>
body{
padding : 0;
margin : 0;
}
.catbox{
margin-top : 10px;
 height : 50px;
 width : 100vw;
  display : flex;
  flex-direction : column;
}
.catul{
  display : flex;
  flex-direction : column;
  list-style : none;
  align-items : center;
}
.cathead{
  font-style : bold;
  padding-right : 30px;
}
.link{
padding :0px 30px;
cursor : pointer;
}
.link:hover{

}
</style>
<html>
<body>
<div class = "catbox">
        <ul>
                    <c:forEach items="${cat}" var="p">
                         <a class = "link" href = "showcategory?value=${p}">${p}</a>
                    </c:forEach>
            </li>
        </ul>
<div>
</body>

</html>