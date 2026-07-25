<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>
<h1>Пользователи</h1>

<a href="${pageContext.request.contextPath}/users/new">Добавить пользователя</a>

<table border="1">
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Возраст</th>
        <th>Национальность</th>
        <th></th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.lastName}</td>
            <td>${user.age}</td>
            <td>${user.nationality}</td>
            <td>
                <a href="${pageContext.request.contextPath}/users/edit/${user.id}">Изменить</a>
                <a href="${pageContext.request.contextPath}/users/delete/${user.id}">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>