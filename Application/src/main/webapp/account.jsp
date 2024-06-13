<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" import = " java.util.*,com.akash.app.model.User,com.akash.app.model.Product,com.akash.app.dao.OrderDao,com.akash.app.dao.SellDao"%>

<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&family=Rubik:ital,wght@0,300..900;1,300..900&display=swap');
.box{
height : fit-content;
width : full;
margin : 50px 100px;
}
.products{
 flex-wrap : wrap;
 height : fit-content;
 width : 100%;
 margin : 10px;
 background:#efefef;
 display:flex;
 flex-direction : row;
}
.boxes{
 margin:20px;
}
.accountbox{
  display : flex;
  flex-direction : column;
  align-items : flex-start;
  justify-content : center;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  margin-left : 20px;
  padding : 40px;
}
.button{
 text-decoration : none;
 list-style : none;
 padding : 7px 15px;
 outline : none;
 background-color : white;
 color : black;
 border : 2px solid black;
}
.heading{
  color : black;
  font-family : Noto Sans;
}
.accounttxt{
  font-family : Rubik;
  margin-top : 0px;
}

.boxes{
  padding : 20px;
  background-color : white;
   margin:20px;
}
.btns{
  display : flex;
  align-items : center;
  justify-content:space-between;
  margin-top : 5px;
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
.price{
  color:black;
  font-family : Noto Sans;
  font-size : 25px;
  font-style : bold;
  margin : 5px 0px;
  text-align : center;
}

</style>
<html>
<body>

<c:import url="navbar.jsp" />
  <div class = "box">
     <h1 class = "heading">Account</h1>
     <div class = "accountbox">
       <p class = "accounttxt">Name  :  ${user.getUserName()}</p>
       <p class = "accounttxt">Email  :  ${user.getEmail()}</p>
       <p class = "accounttxt">Address  :  ${user.getAddress()}</p>
       <p class = "accounttxt">Mobile Number  :  ${user.getMobileno()}</p>
       <a href = "logout" class = "button">Logout<a>
     </div>

       <%
           int id = (int)session.getAttribute("userId");
           OrderDao orderDao = new OrderDao();
           List<Product> orders = orderDao.getOrderList(id);
           request.setAttribute("orders", orders);
           SellDao sellDao = new SellDao();
           List<Product> sells = sellDao.getSellList(id);
           request.setAttribute("sells", sells);
       %>

        <p class ="heading">Order Products</p>
         <div class = "products">
            <c:forEach items="${orders}" var="p">
               <div class = "boxes">
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

          <p class ="heading">Sell Products</p>
                  <div class = "products">
                     <c:forEach items="${sells}" var="p">
                        <div class = "boxes">
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
       <c:import url="footer.jsp" />
</body>

</html>