<%--
  Created by IntelliJ IDEA.
  User: Minh Tran
  Date: 6/4/2023
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<div class="login-box">
    <form action="">
        <h2>Login</h2>
        <div class="input-box">
            <span class="icon"></span>
            <input type="username" required>
            <label>Username</label>
        </div>
        <div class="input-box">
            <span class="icon"><ion-icon name="lock-closed-outline"></ion-icon></span>
            <input type="password" required>
            <label>Password</label>
        </div>
        <div class="remember-forget">
            <label><input type="checkbox"> Remember me</label>
            <a href="#">Forgot Password</a>
        </div>
        <button type="submit">Login</button>
        <div class="register-link">
            <p>Don't have an account? <a href="#">Register</a></p>
        </div>
    </form>

</div>

<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>
