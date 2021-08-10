<%@ page import="ru.job4j.car_accident.model.Accident" %>
<%@ page import="ru.job4j.car_accident.control.AccidentControl" %>
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

        <form action="<c:url value='/edit'/>" method='POST'>
            <table class="table align-content-center table-bordered">
                <tr>
                    <td>Айдишник:</td>
                    <td><input type='number' value='<%=request.getParameter("id")%>' name='id' ></td>
                </tr>
                <tr>
                    <td>Название:</td>
                    <td><input type='text' value='<%=request.getParameter("name")%>' name='name'></td>
                </tr>
                <tr>
                    <td>Описание:</td>
                    <td><input type='text' value="<%=request.getParameter("text")%>" name='text'></td>
                </tr>
                <tr>
                    <td>Адрес:</td>
                    <td><input type='text' value="<%= request.getParameter("address")%>" name='address'></td>
                </tr>
                <tr>
                    <td>Тип инцидента:</td>
                    <td>
                        <select name="type.id">
                            <c:forEach var="type" items="${types}" >
                                <option value="${type.id}">${type.name}</option>
                            </c:forEach>
                        </select>
                    </td>
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