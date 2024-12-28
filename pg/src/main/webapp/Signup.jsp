<%@ page isELIgnored = "false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SignUp</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #e9ecef;
            padding: 20px;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        .form-container .btn {
            display: block;
            width: 100%;
            margin-top: 20px;
        }
        .form-group span {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="form-container">
                <h2>Sign Up</h2>
                <form action="signup" method="post">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="nameid" name="name" placeholder="Enter name" onchange="onField()">
                        <span id="nameValid"></span>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" onblur="validData(event)">
                        <span id="emailvalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="phoneNo">Phone Number</label>
                        <input type="text" class="form-control" id="phoneNo" name="phoneNo" placeholder="Enter phone number" onblur="validData(event)">
                        <span id="phonevalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="location">Location</label>
                        <input type="text" class="form-control" id="location" name="location" placeholder="Enter location">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>
</script>
</body>
</html>
