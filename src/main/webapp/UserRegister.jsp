<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password],input[type=email],input[type=number],input[type=date] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=email]:focus, input[type=number]:focus,input[type=date]:focus
 {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 40px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>
	
	<form action="registeruser" method="post">
  	<div class="container">
    <h1>User</h1>
    <p>Please fill in this form to add User.</p>
    <hr>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter name" name="username" id="name" required>
    
    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter email" name="useremail" id="email" required>
    
    <label for="pass"><b>Password</b></label>
    <input type="password" placeholder="Enter password" name="userpassword" id="pass" required>
    
    <label for="cno"><b>Contact Number</b></label>
    <input type="number" placeholder="Enter number" name="usercontact" id="cno" required>
    
    
    <label for="age"><b>Age</b></label>
    <input type="number" placeholder="Enter age" name="userage" id="age" >
    <br>
    <br>
    <hr>

    <button type="submit" class="registerbtn">Create Item</button>
  </div>
  </form>

</body>
</html>