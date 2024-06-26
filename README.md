# OLX-like Marketplace Web Application

## Description
This project is an online marketplace web application where users can add, sell, and purchase products. It features secure account login and user-friendly interfaces, developed using Java Servlets, JSP, and MySQL.

## Features
- **User Registration and Login**: Secure authentication and authorization mechanisms.
- **Add Products**: Users can add products they want to sell.
- **Purchase Products**: Users can browse and purchase products listed by others.
- **User Management**: Each user has a profile and can manage their listings.

## Technologies Used
- **Frontend**: HTML, CSS, JSP
- **Backend**: Java Servlets
- **Database**: MySQL
- **Other**: JDBC for database connectivity

## Setup and Installation

### Prerequisites
- JDK 8 or later
- Apache Tomcat 9 or later
- MySQL Server
- IDE (Eclipse, IntelliJ IDEA, etc.)

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/akash-aravinth/Olx.git

2. **Import the project into your IDE**

3. **Configure MySQL Database**
   - Create a database named marketplace_db
   - Run the following SQL script to create necessary tables:
  

### Tables

## User Table

```bash
  create table user(
      id int primary key auto_increment,
      username varchar(100),
      email varchar(100),
      password varchar(100),
      address longtext,
      mobileNo varchar(100)
);
```

## Product Table

```bash
  create table product(
      productid int primary key auto_increment,
      userid int,
      productname varchar(500),
      price varchar(500),
      description longtext,
      about longtext,
      category varchar(500),
      producttype varchar(500),
      image varchar(500)
);
```

## Order Table

```bash
  create table ordertable(
      orderid int primary key auto_increment,
      userid int,
      productid int
);
```

## Sell Table

```bash
  create table selltable(
      sellid int primary key auto_increment,
      userid int,
      productid int
);
```
###  Configure Database Connection

 - Update the db.properties file with your MySQL credentials

```bash
      db.url=jdbc:mysql://localhost:3306/yourdatabasename
      db.username=yourusername
      db.password=yourpassword
```

### Deploy on Tomcat

- Export the project as a WAR file from your IDE
- Deploy the WAR file to your Tomcat server.

### Run the Application

 - Access the application at http://localhost:8080/yourappname

## Usages 
  - Register a new account
  - Login to your account
  - Add a product to sell
  - Browse and purchase products from other users


## Screenshots


## Login Page


![Login Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/login.png)


## SignUp Page


![SignUp Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/signup.png)


## Home Page


![home Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/home.png)


## Product Page


![product Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/product.png)


## Add Product Page


![addProduct Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/sellproduct.png)


## Category Component


![category Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/categorys.png)


## Category Page


![Show Category Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/showcategory.png)


## Account Page


![Account Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/account.png)


## Ordered Products Page


![Orders Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/orders.png)


## Selling Products Page


![sell Image](https://github.com/akash-aravinth/Olx/blob/main/readmeimg/sellings.png)



## Contributors

- [Akash Aravinth](https://github.com/akash-aravinth)
- [Arumugam](https://github.com/Arumugamakash)
- [Narayanan](https://github.com/Narayanan-005)


# Contact us 

# For any queries, please contact 
  
   - akasharavinth2424@gmail.com
   - arumugamn048@gmail.com
   - nareanbrul@gmail.com
