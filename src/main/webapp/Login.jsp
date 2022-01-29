<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="./login.css">
</head>
<body>
	<section>
        <article>
            
            <form  action="login" method="post">
                <h2>Login</h2>
                <div class="form-control">
                    <label for="email">Email</label>
                    <input type="email" name="useremail" id="email" placeholder= "enter email" required>
                </div>
                <div class="form-control">
                    <label for="password">Password</label>
                    <input type="password" name="userpassword" id="password" placeholder="enter password" required>
                </div>
                <div class="form-control">
                    <button>Log In</button>
                </div>
                
            </form>
            
        </article>
    </section>
	
</body>
</html>