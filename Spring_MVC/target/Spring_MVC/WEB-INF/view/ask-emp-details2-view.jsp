<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
    <title>Second view</title>
</head>

<body>

<h2>Dear Employee, please enter your details</h2>

<br><br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>

    <br><br>

    Surname <form:input path="surname"/>

    <br><br>

    Salary <form:input path="salary"/>

    <br><br>

    Department <form:select path="department">
<%--    <form:option value="Infotmation Technologies" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>

    <br><br>

    Which car do You want ? <br>
<%--    <form:radiobutton path="carBrand" value="BMW"/> BMW--%>
<%--    <form:radiobutton path="carBrand" value="Mercedes Benz"/> MB--%>
<%--    <form:radiobutton path="carBrand" value="Audi"/> Audi--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br><br>

    Foreign language(s)
<%--    <form:checkbox path="languages" value="English"/> En--%>
<%--    <form:checkbox path="languages" value="Deutch"/> De--%>
<%--    <form:checkbox path="languages" value="French"/> Fr--%>
    <form:checkboxes path="languages" items="${employee.languagesList}"/>

    <br><br>

    <input type="submit" value="SEND">

</form:form>


</body>

</html>