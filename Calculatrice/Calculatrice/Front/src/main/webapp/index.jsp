<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitionnal//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>title</title>
</head>
<body>
    <B>Calculatrice</B>
    <center>
        <form method="GET" action="add">
            <table>
                <tr>
                    <td>Premier Nombre</td>
                    <td><input type="text" name="nombre1"></td>
                </tr>
                <tr>
                    <td>Second Nombre</td>
                    <td><input type="text" name="nombre2"></td>
                </tr>
            </table>
            <input type="submit" value="additionner">
        </form>
    </center>
</body>
</html>