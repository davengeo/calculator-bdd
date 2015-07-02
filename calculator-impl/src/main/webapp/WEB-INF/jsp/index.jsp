<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>hello</title>
</head>

<body>
    <h1>${message}</h1>
    <p>${time}</p>
    <form action="calculate" method="GET">
        First Number: <input type="text" name="first_number" value="1">
        <br />
        Second Number: <input type="text" name="second_number" />
        <br />
        Result: ${result}
        <br />
        <input type="submit" value="Submit" />
    </form>

</body>

</html>
