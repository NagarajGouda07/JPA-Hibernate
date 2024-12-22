<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Success</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 100vh;
            background-color: #f8f9fa;
            margin: 0;
        }
        .header-box {
            width: 100%;
            background-color: #ffffff;
            border: 1px solid #dee2e6;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
            padding: 15px 20px;
            margin-bottom: 20px;
            text-align: center;
        }
        .header-box h2 {
            margin: 0;
            color: #343a40;
            font-family: 'Georgia', serif;
            font-size: 1.5rem;
        }
        h1 {
            color: #28a745;
            font-size: 2rem;
        }
    </style>
</head>
<body>
<div class="header-box">
    <h2>Welcome to the Success Page</h2>
</div>
<div class="text-center">
    <h1>${success}</h1>
</div>
<!-- Bootstrap JS and dependencies (optional) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
