<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
    <title>Box creation</title>
</head>

<body>

<form:form method="post" modelAttribute="box">
    <table>
        <tr>
            <td><form:label path="id">Box name </form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>