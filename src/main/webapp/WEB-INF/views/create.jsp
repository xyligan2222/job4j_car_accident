<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Создание инцидента</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<div class="container pt-3">
    <div>
        <%--@elvariable id="Accident" type="java"--%>
<%--        <form:form modelAttribute="Accident">--%>
<%--            <table class="table align-content-center table-bordered">&ndash;%&gt;--%>
<%--                                    <tr>--%>
<%--                                        <td>Название:</td>--%>
<%--                                        <form:input path="name" id="nameInput" />--%>
<%--                                        <td><input type='text' name='name'></td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Описание:</td>--%>
<%--                                        <td><input type='text' name='text'></td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Адрес:</td>--%>
<%--                                        <td><input type='text' name='address'></td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td colspan='2'><input name="submit" type="submit" value="Сохранить"/></td>--%>
<%--                                    </tr>--%>
<%--                                </table>--%>
<%--        </form:form>--%>
        <form action="<c:url value='/save'/>" method='POST'>
            <table class="table align-content-center table-bordered">
                <tr>
                <td>Айдишник:</td>
                <td><input type='number' name='id'></td>
                </tr>
                <tr>
                    <td>Название:</td>
                    <td><input type='text' name='name'></td>
                </tr>
                <tr>
                    <td>Описание:</td>
                    <td><input type='text' name='text'></td>
                </tr>
                <tr>
                    <td>Адрес:</td>
                    <td><input type='text' name='address'></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit" value="Сохранить"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>
</html>