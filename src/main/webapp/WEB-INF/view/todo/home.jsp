<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.arifulhaque.util.Mappings" %>
<html>
<head>
    <title>TODO List Application</title>
</head>
<body>

    <div align="center">
        <c:url var="itemLink" value="${Mappings.ITEMS}" />
        <h2><a href="${itemLink}">Show TODO items</a></h2>
    </div>
</body>
</html>
