<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri = "http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>LOGIN PAGE</title>
<head>
<body>

LOGIN
<form method="POST" action="login">
    Username: <input type="text" id="username" name="username"><br>
    Password: <input type="password" id="password" name="password"><br>
    <sec:csrfInput/>
    <input type="submit" value="login">
</form>

</body>
</html>