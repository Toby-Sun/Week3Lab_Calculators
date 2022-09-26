<%-- 
    Document   : wronginput
    Created on : Sep 25, 2022, 5:35:17 PM
    Author     : tobys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wrong input</title>
    </head>
    <body>
                <h1>Age Calculator</h1>
        <form method="post" action="age">
            <h2>Enter your age: <input type="text" name="currentAge" value="${currentAge}"><br>
                <input type="submit" value="Age next birthday">
                <p>${message}</p>
    </body>
</html>
