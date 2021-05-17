<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.arifulhaque.util.AttributeNames" %>
<html>
<head>
    <title>Add TODO Items</title>
</head>
<body>
    <header>
        <h1>Add TODO Items</h1>
    </header>

    <div align="center">
        <%--@elvariable id="${AttributeNames.TODO_ITEM}" type=""--%>
        <form:form method="post" modelAttribute="${AttributeNames.TODO_ITEM}">
            <table>
                <tr>
                    <th><label>Id</label></th>
                    <td>
                        <form:input path="id" />
                    </td>
                </tr>
                <tr>
                    <th><label>Title</label></th>
                    <td>
                        <form:input path="title"/>
                    </td>
                </tr>
                <tr>
                    <th><label>Details</label></th>
                    <td>
                        <form:input path="details"/>
                    </td>
                </tr>
                <tr>
                    <th><label>Deadline</label></th>
                    <td>
                        <form:input path="deadline"/>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>

        </form:form>
    </div>

    <footer>
        <small>By Arif</small>
    </footer>
</body>
</html>
