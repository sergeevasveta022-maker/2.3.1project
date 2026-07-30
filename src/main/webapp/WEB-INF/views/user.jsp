<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Пользователь</title>
</head>
<body>
<h1>Данные пользователя</h1>

<form action="${pageContext.request.contextPath}/admin/save" method="post">
    <input type="hidden" name="id" value="${user.id}">

    <label>Имя:</label>
    <input type="text" name="name" value="${user.name}"><br>

    <label>Фамилия:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br>

    <label>Возраст:</label>
    <input type="number" name="age" value="${user.age}"><br>

    <label>Национальность:</label>
    <input type="text" name="nationality" value="${user.nationality}"><br>

    <button type="submit">Сохранить</button>
</form>

<a href="${pageContext.request.contextPath}/admin">Отмена</a>
</body>
</html>