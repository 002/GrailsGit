<%--
  Created by IntelliJ IDEA.
  User: ferlima
  Date: 05/03/2018
  Time: 14:13
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'site.label', default: 'Site')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>
    <div id="show-category" class="content scaffold-show" role="main">
        <f:display bean="category" />
    </div>
</body>
</html>