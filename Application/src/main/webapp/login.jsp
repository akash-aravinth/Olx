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
 padding : 20px 60px 30px 60px;
 border: 1px solid #ddd;
 box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
.formbox{
display:flex;
flex-direction:column;
}
.labletext{
  margin : 5px 0px;
  font-family : Mukta;
  font-size : 20px;
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
                    <form action="login" method="get" class = "formbox">
                        <label for="username" class = "labletext">Email or Phone:</label>
                        <input type="text" name="email" class = "inputbox"/>
                        <label for="password" class = "labletext">Password:</label>
                        <input type="password" name="password" class = "inputbox"/>
                        <input type="submit" value="Login" class = "inputbtn"/>
                    </form>
                    <a class= "forgot" href = "#" >Forgot Password</a>
                    <p class = "createbtn">Don&apos;t Have an Account  <a class = "signupbtn" href = "signup.jsp"> Create Account?</a></p>
                </div>
        </div>

</body>
</html>