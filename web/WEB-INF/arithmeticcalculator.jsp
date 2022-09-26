<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2022, 9:07:11 PM
    Author     : tobys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First:  <input type="text" name="firstNum" value="${firstNum}"><br>
            Second: <input type="text" name="secondNum" value="${secondNum}"><br> 

            <input type="submit" name="plusButton" value="+" />
            <input type="submit" name="minusButton" value="-" />
            <input type="submit" name="multiplyButton" value="*" />
            <input type="submit" name="moduloButton" value="%" />
        </form>
        <br><p>${result}</p>
        <a href="http://localhost:8084/Week3Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
