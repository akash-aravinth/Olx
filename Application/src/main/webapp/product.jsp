<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, com.akash.app.model.Product , com.akash.app.dao.ProductDao" %>


<html>

<style>
@import url('https://fonts.googleapis.com/css2?family=Mukta:wght@200;300;400;500;600;700;800&display=swap');
.container{
display : flex;
flex-direction : row;
margin : 80px;
}
.image{
box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
.right{
margin-left : 100px;
}
.heading{
font-family : Mukta;
margin: -3px 0px -3px 0px;
font-size : 35px;
}
.price{
font-family : Mukta;
margin: -3px 0px -3px 0px;
font-size : 30px;
}
.description{
font-family : Mukta;
font-size : 20px;
}
.about{
font-family : Mukta;
font-size : 18px;
}
.box{
display:flex;
align-item : center;
justify-content : center;
margin-top : 50px;
}
.btn{
padding : 6px 25px;
font-family : Mukta;
border-radius : 3px;
cursor : pointer;
background-color:black;
color : white;
text-decoration : none;
}
</style>

<body>

<c:import url="navbar.jsp" />

<div class = "container">
      <div class = "left">
         <img src ="./images/${product.getImage()}" alt = "image" height = "400px" width = "400px" class = "image" />
      </div>

      <div class = "right">
         <p class = "heading">${product.getName()}</p>
         <p class = "price">${product.getPrice()}</p>
         <p class = "description">${product.getDesc()}</p>
         <p class = "about">${product.getAbout()}</p>
         <div class = "box">
            <a class = "btn" href = "purchase?id=${product.getProductid()}">Order Now</a>
         </div>
      </div>
</div>

<c:import url="footer.jsp" />
</body>
</html>