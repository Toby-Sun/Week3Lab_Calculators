<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2022, 2:44:53 PM
    Author     : tobys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <h2>Enter your age: <input type="text" name="currentAge" value="${currentAge}"><br>
                <input type="submit" value="Age next birthday">
        </form>
    </body>
</html>