<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
@import url('https://fonts.googleapis.com/css2?family=Mukta:wght@200;300;400;500;600;700;800&display=swap');
.nav{
  height : 60px;
  width : full;
  display : flex;
  align-items: center;
  justify-content : space-between;
  padding : 0 50px 0 50px;
  box-shadow: 0 2px 2px -2px rgba(0, 0, 0, 0.5);
 }
.sell{
  color:white;
  background-color : black;
  padding:4px 15px;
  border-radius : 5px;
  text-decoration: none;
  font-family : Mukta;
}
.logo{
   color : black;
   text-decoration: none;
   list-style : none;
   font-family : Mukta;
   font-size : 30px;
   cursor : pointer;
}
.icon{
   outline : none;
   border : 1.5px solid black;
   text-align:center;
   cursor : pointer;
   border-radius : 8px;
   padding-left : 8px 8px 8px 20px;
}
.searchbox{
  display : flex;
  align-items : center;
  justify-content : center;
}
.searchinp{
  margin-top : 15px;
  outline : none;
  border : 1.5px solid black;
  border-radius : 8px;
  height : 30px;
  text-align : center;
  font-size : 15px;
  width : 400px;
}
.login{
      font-family : Mukta;
      border : 1.5px solid black;
      padding : 1px 10px;
      border-radius : 2px;
      text-decoration: none;
      margin-left:40px;
}
</style>

<nav class = "nav">
<h1><a class = "logo" href = "index.jsp">Olx</a></h1>
<form action = "searchproduct">
    <div class = "searchbox">
    <input name = "search" type = "text" class = "searchinp" placeholder = "Search here..."  />
    </div>
</form>
<div>
    <a class = "sell" href = "sellproduct.jsp">Sell Product</a>
  <c:choose>
            <c:when test="${permission}">
                <a href= "account" class = "login">Account</a>
            </c:when>
            <c:otherwise>
                <a href= "login.jsp" class = "login">Login</a>
            </c:otherwise>
    </c:choose>
</div>
</nav>