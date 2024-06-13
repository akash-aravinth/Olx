<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.*,javax.servlet.http.*,javax.servlet.annotation.*,java.io.*,org.apache.commons.fileupload.*,org.apache.commons.fileupload.servlet.*,org.apache.commons.fileupload.disk.*"%>
<%@ page import="java.util.*"%>

<style>
@import url('https://fonts.googleapis.com/css2?family=Mukta:wght@200;300;400;500;600;700;800&display=swap');

body{
  overflow-x: hidden;
  overflow-y: scroll;
  height : 100vh;
  width : 100vw;
  display : flex;
  align-items : center;
  justify-content : center;
}
.box{
padding : 30px 100px;
height:fit-content;
width:fit-content;
border: 1px solid #ddd;
box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
border-radius:5px;
}
.heading{
font-family:Mukta;
text-align:center;
}
.mainbox{
  width:100%;
}
.inputbox{
display:block;
}
.labeltxt{
   margin:0px 0px 5px 0px;
   font-family:Mukta;
   font-size : 20px;
}
.inputtxt{
margin-bottom:5px;
height : 30px;
 width:100%;
 padding:5px 10px;
 outline : none;
}
.areabox{
margin-bottom:5px;
 outline : none;
}
.cattext{
margin-bottom:5px;
height : 30px;
}
.btnbox{
  margin-top : 25px;
  padding : 8px 5px;
  color : white;
  height : 30px;
  width:100%;
  background-color : black;
  border-radius : 2px;
  outline : none;
  border : none;
  text-decoration : none;
  cursor : pointer;
}
</style>


<html>
<body>
     <form action = "sellproduct" method="post" enctype="multipart/form-data">
        <div class = "box">
           <h1 class = "heading">Sell Your Product With us...</h1>
           <div class = "mainbox">
                    <div class = "inputbox">
                        <label class = "labeltxt">Product Name</label>
                        <input type = "text" name = "name" class = "inputtxt"/>
                    </div>
                    <div class = "inputbox">
                        <label class = "labeltxt">Product Price</label>
                        <input type = "text" name = "price" class = "inputtxt"/>
                    </div>
                    <div class = "areabox">
                        <label class = "labeltxt">Product Description</label>
                        <textarea name = "description" class = "inputtxt"></textarea>
                    </div>
                     <div class = "areabox">
                         <label class = "labeltxt">Product About</label>
                         <textarea name = "about" class = "inputtxt"></textarea>
                     </div>
                     <div class = "inputbox">
                         <label class = "labeltxt">Choose Category</label>
                             <select id="category" name="category" class = "cattext">
                                 <option value="0">Select a category...</option>
                                 <option value="Electronics">Electronics</option>
                                 <option value="Furniture">Furniture</option>
                                 <option value="Vehicle">Vehicle</option>
                                 <option value="Books">Books</option>
                                  <option value="Fashion">Fashion</option>
                                 <option value="Plants">Plants</option>
                                 <option value="Accessories">Accessories</option>
                             </select>
                     </div>
                     <div class = "inputbox">
                               <label class = "labeltxt">Choose Image</label>
                               <input type = "file" name = "image" class = "inputtxt"/>
                     </div>
                      <div class = "inputbox">
                          <label class = "labeltxt">Product Type</label>
                          <input type = "text" name = "producttype" class = "inputtxt"/>
                      </div>
                       <div class = "btnboxx">
                            <input type = "submit" class = "btnbox"/>
                       </div>
           </div>
        </div>
    </form>
</body>
</html>