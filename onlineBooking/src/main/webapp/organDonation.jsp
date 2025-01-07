<!DOCTYPE html>
<html>
<head>
    <title>Organ Donation</title>
</head>
<body>
    <h2>Organ Donation Form</h2>
    <form action="OrganDonation" method="post">

        Full Name: <input type="text" name="name"><br><br>

        Date of Birth: <input type="date" name="dob" ><br><br>

        Gender:
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
        <input type="radio" name="gender" value="Other"> Other<br><br>

        Blood Group:
        <select id="bloodGroup" name="bloodGroup" >
            <option value="">Select</option>
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="B+">B+</option>
            <option value="B-">B-</option>
            <option value="O+">O+</option>
            <option value="O-">O-</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
        </select><br><br>

        Email: <input type="email" name="email" ><br><br>

        Phone Number: <input type="text" id="phone" name="phone" ><br><br>

        Address: <textarea id="address" name="address" rows="4" cols="30" ></textarea><br><br>

        Organs to Donate:
        <input type="checkbox" id="heart" name="organs" value="Heart"> Heart<br>
        <input type="checkbox" id="kidney" name="organs" value="Kidney"> Kidney<br>
        <input type="checkbox" id="liver" name="organs" value="Liver"> Liver<br>
        <input type="checkbox" id="lungs" name="organs" value="Lungs"> Lungs<br>
        <input type="checkbox" id="eyes" name="organs" value="Eyes"> Eyes<br><br>

        Emergency Contact Name: <input type="text" id="emergencyName" name="emergencyName" ><br><br>

        Emergency Contact Phone: <input type="text" id="emergencyPhone" name="emergencyPhone" ><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
