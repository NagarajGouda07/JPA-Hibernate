<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navbar with Logo and Login</title>
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
          .h1{
                    text-align: center;
                    color: rgb(0, 8, 255)
                }
    </style>
</head>
<body>

    <div class="navbar">
        <div class="logo">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Logo">
        </div>
        <a href="xworkz.jsp" class="login-btn">Login</a>
    </div>
    <div class="h1">
        <h1>Welcome to Xworkz form</h1>
    </div>
</body>
</html>
