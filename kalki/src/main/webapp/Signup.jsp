<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navbar with Form</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
            background-color: #333;
            color: white;
        }
        .navbar .logo img {
            height: 40px;
        }
        .navbar .btn-group {
            display: flex;
            gap: 10px;
        }
        .navbar .login-btn {
            text-decoration: none;
            color: white;
            background-color: #007BFF;
            padding: 10px 15px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .navbar .login-btn:hover {
            background-color: #0056b3;
        }
        .h1 {
            text-align: center;
            color: rgb(0, 8, 255);
            margin-top: 20px;
        }
        .form-container {
            max-width: 600px;
            margin: 30px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        .form-container label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        .form-container input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .form-container button {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .form-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="navbar">
        <div class="logo">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Logo">
        </div>
        <div class="btn-group">
            <a href="Signup.jsp" class="login-btn">Signup</a>
            <a href="Signin.jsp" class="login-btn">Signin</a>
        </div>
    </div>
    <div class="h1">
        <h1>Welcome to Signup form</h1>
    </div>

    <div class="form-container">
        <h2>Signup Form</h2>
        <c:forEach items="${error}" var="i">

        <span style="color:red"> ${i.message}</span>

        </c:forEach>
        <form action="signup" method="post">

            <label for="name">Name:</label>
            <input type="text" id="name" name="name"  />


            <label for="email">Email:</label>
            <input type="text" id="email" name="email" />


            <label for="phoneNo">Phone Number:</label>
            <input type="text" id="phoneNo" name="phoneNo"  />

            <label for="password">Password:</label>
            <input type="password" id="password" name="password"  />



            <label for="altEmail">Alternate Email:</label>
            <input type="text" id="altEmail" name="altEmail"  />


            <label for="location">Location:</label>
            <input type="text" id="location" name="location"  />

            <button type="submit">Sign Up</button>
        </form>

    </div>

</body>
</html>
