    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, com.akash.app.model.Product , com.akash.app.dao.ProductDao" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto+Mono:ital,wght@0,100..700;1,100..700&display=swap');
.heading{
  font-family : Poppins;
  font-size : 20px;
  font-style : bold;
}
.textbox{
  display : flex;
  align-items:center;
  justify-content:space-between;
}
.name{
color:black;
     font-family : Roboto Mono;
     font-size : 17px;
     font-style : bold;
     margin : 5px 0px;
     text-align : center;
}
.linkre{
text-decoration : none;
list-style:none;
}

.price{
  color:black;
  font-family : Noto Sans;
  font-size : 25px;
  font-style : bold;
  margin : 5px 0px;
  text-align : center;
}
.recommended{
   padding : 0px 20px;
   display : block;
   align-items:center;
   justify-content:space-between;
}
.image{
  height : 200px;
  width : 200px;
  background-color : white;
}
.imagebox{
   display: flex;
   justify-content: center;
   align-items: center;
}
.outerbox{
  margin : 20px 40px;
  display : flex;
  align-items : centre;
  justify-content: space-between;
  flex-wrap : wrap;
}
.box{
  border: 1px solid #ddd;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  padding : 10px;
  display : block;
  justify-content: space-between;
  align-items: center;
  width : 250px;
  height : 350px;
  flex : wrap-content;
  margin-bottom:50px;
}
.favourite{
        font-family : Mukta;
        border : 1.5px solid black;
        padding : 1px 10px;
        border-radius : 2px;
        text-decoration: none;
}
.buynow{
             background-color:black;
             color:white;
             font-family : Mukta;
             border : 1.5px solid black;
             padding : 1px 10px;
             border-radius : 2px;
             text-decoration: none;
}
.btns{
    margin : 20px;
    display : flex;
    flex-direction : row;
    align-items:center;
    justify-content:space-between;
}
</style>
</head>
<body>

<c:import url="navbar.jsp" />

    <div class = "recommended">
       <p class = "heading">${category}</p>
            <div class = "outerbox">

     <c:forEach items="${products}" var="p">
        <div class = "box">
          <div class = "imagebox">
           <img src ="./images/${p.getImage()}" alt = "image" height = "200px" width = "200px" class = "image"/>
          </div class = "textbox">
           <p class = "name">${p.getName()}</P>
           <p class = "price">${p.getPrice()}</P>
           <div class = "btns">
             <a href='showproduct?product=${p.getProductid()}' class = "favourite">View Details</a>
             <a href = 'showproduct?product=${p.getProductid()}' class = "buynow">Buy Now</a>
           </div>
        </div>
     </c:forEach>
            </div>
    </div>

</body>
</html>