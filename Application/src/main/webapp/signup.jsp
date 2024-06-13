<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
@import url('https://fonts.googleapis.com/css2?family=Mukta:wght@200;300;400;500;600;700;800&display=swap');

.logo{
   color : black;
   text-decoration: none;
   list-style : none;
   font-family : Mukta;
   font-size : 50px;
   cursor : pointer;
   padding : 0;
}
body{
margin : 0;
overflow:hidden;
}
.login{
    height : 100vh;
    width : 100vw;
    display : flex;
    align-items : center;
    justify-content:center;
}
.loginbox{
 border-radius : 5px;
 display : flex;
 flex-direction : column;
 align-items : center;
 justify-content:center;
 width : fit-content;
 padding : 2px 60px 2px 60px;
 border: 1px solid #ddd;
 box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
.formbox{
display:flex;
flex-direction:column;
}
.labletext{
  margin : 3px 0px;
  font-family : Mukta;
  font-size : 15px;
  font-style : bold;
}
.inputbox{
  outline : none;
  padding : 5px 5px;
  width : 260px;
}
.inputbtn{
  margin-top : 25px;
  padding : 8px 5px;
  color : white;
  background-color : black;
  border-radius : 2px;
  outline : none;
  border : none;
  text-decoration : none;
  cursor : pointer;
}
.createbtn{
  font-family : Mukta;
  color : black;
}
.forgot{
  color: blue;
  font-size : 13px;
  margin-top : 8px;
}
.signupbtn{
  color : blue;
}
</style>


<html>
<body>

        <div class = "login">
                <div class = "loginbox">
                    <h1><a class = "logo" href = "index.jsp">Olx</a></h1>
                    <form action="signup" method="post" class = "formbox">
                        <label for="username" class = "labletext">User Name :</label>
                        <input type="text" name="username" class = "inputbox"/>
                        <label for="username" class = "labletext">User Email :</label>
                        <input type="text" name="email" class = "inputbox"/>
                        <label for="password" class = "labletext">Password :</label>
                        <input type="password" name="password" class = "inputbox"/>
                        <label for="password" class = "labletext">Mobile No :</label>
                        <input type="text" name="mobile" class = "inputbox"/>
                        <label for="username" class = "labletext">Address :</label>
                        <textarea type="text" name="address" class = "inputbox"></textarea>
                        <input type="submit" value="SignUp" class = "inputbtn"/>
                        <a class= "forgot" href = "#" >Forgot Password</a>
                    </form>
                    <p class = "createbtn">Already Have an Account  <a class = "signupbtn" href = "login.jsp"> Login</a></p>
                </div>
        </div>

</body>
</html>