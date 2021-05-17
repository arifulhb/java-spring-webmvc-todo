<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TODO Items</title>
</head>
<body>
    <header>
        <h1>TODO Items</h1>
    </header>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h3>TODO Items List</h3></caption>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Deadline</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${todoData.items}">
                    <tr>
                        <td><c:out value="${item.title}"/> </td>
                        <td><c:out value="${item.deadline}"/> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>

    <footer>
        <small>By Arif</small>
    </footer>
</body>
</html>
