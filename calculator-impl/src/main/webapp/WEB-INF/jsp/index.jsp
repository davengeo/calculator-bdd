<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>calculator</title>
</head>
<body>
    <h1>${message}</h1>
    <p>${time}</p>
    <form action="calculate" method="GET">
        <span class="first_number">First Number:</span><input type="text" name="first_number" value="">
        <br />
        <span class="second_number">Second Number:</span><input type="text" name="second_number" value=""/>
        <br />
        <span class="result_label">Result:</span><span class="result_value">${result}</span>
        <br />
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
