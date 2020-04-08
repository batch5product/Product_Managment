<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<link rel="stylesheet" type="text/css" href="/css/mystyle2.css">


 <script src="/js/login_script.js"></script>

</head>
<body>

<form name="frm" method="get" action="/welcome_page" onSubmit="return myFunction()">
 <div class="imgcontainer">
    <img src="/css/img_avatar2.png" alt="Avatar" class="avatar">
  </div>

 <div class="container">
 <label for="username"><b>Username</b></label>
<input type="text" placeholder="Enter Username" id="username" name="username"/>
 
  <label for="password"><b>Password</b></label>
 <input type="password" placeholder="Enter Password" id="password" name="password">

<input type="submit" class="button" value="Login">

</div>
</form>
</body>
</html>