<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.arifulhaque.util.Mappings" %>
<html>
<head>
    <title>TODO Items</title>
</head>
<body>
    <header>
        <h1>TODO Items</h1>
    </header>

    <div align="center">
        <c:url var="addUrl" value="${Mappings.ADD_ITEMS}" />
        <a href="${addUrl}">New Item</a>

        <table border="1" cellpadding="5">
            <caption><h3>TODO Items List</h3></caption>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Deadline</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${todoData.items}">
                    <c:url var="deleteUrl" value="${Mappings.DELETE_ITEMS}" >
                        <c:param name="id" value="${item.id}" />
                    </c:url>

                    <tr>
                        <td><c:out value="${item.title}"/></td>
                        <td><c:out value="${item.deadline}"/> </td>
                        <td>
                            <a href="${deleteUrl}">Delete</a>
                        </td>
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
