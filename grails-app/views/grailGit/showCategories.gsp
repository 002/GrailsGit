<%--
  Created by IntelliJ IDEA.
  User: ferlima
  Date: 05/03/2018
  Time: 14:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'site.label', default: 'Site')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
<a href="#show-site" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div id="show-site" class="content scaffold-show" role="main">
    <h1>${site.name}</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <tr>
            <th>Categorias</th>
            <th>Visitas</th>
        </tr>
        <g:each var="category" in="${site.categories}">
        <tr>
            <td>
                <a href="http://localhost:8080/grailGit/showCategory/${category.id}">${category.name}</a>
            </td>
            <td>${category.visits}</td>
        </tr>
    </g:each>
    </table>
</div>
</body>
</html>