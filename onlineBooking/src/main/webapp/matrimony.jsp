<!DOCTYPE html>
<html>
<head>
    <title>Matrimony</title>
</head>
<body>
    <h2>Matrimony Form</h2>
    <form action="Matrimony" method="post">
        Full Name: <input type="text" name="name" ><br><br>

        Date of Birth: <input type="date" name="dob" ><br><br>

        Gender:
        <input type="radio" id="male" name="gender" value="Male" > Male
        <input type="radio" id="female" name="gender" value="Female"> Female
        <input type="radio" id="other" name="gender" value="Other"> Other<br><br>


        Religion:
        <select id="religion" name="religion" >
            <option value="">Select</option>
            <option value="Hindu">Hindu</option>
            <option value="Muslim">Muslim</option>
            <option value="Christian">Christian</option>
            <option value="Sikh">Sikh</option>
            <option value="Other">Other</option>
        </select><br><br>

        Phone Number: <input type="text"  name="phone"><br><br>

        Email: <input type="email"  name="email" ><br><br>

      Address: <textarea id="address" name="address" rows="4" cols="30"></textarea><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
