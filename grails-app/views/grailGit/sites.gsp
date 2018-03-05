<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta name="layout" content="main"/>
    <title>
        Sitios
    </title>

    <asset:stylesheet src="estilos_sites.css"/>

</head>
<body>
<div id="content" role="main">
<table class="table">
    <thead>
        <td>Sitio</td>
        <td>Estado</td>
    </thead>
    <tbody>
    <g:each var="site" in="${sites}">
        <g:if test="${site.active}">
            <tr class="active">
        </g:if>
        <g:else>
            <tr class="inactive">
        </g:else>
        <td><a href="/grailGit/showCategories/${site.id}">${site.name}</a></td>
        <td>
            <g:if test="${site.active}">
                Activo
            </g:if>
            <g:else>
                Inactivo
            </g:else>
        </td>
        </tr>
    </g:each>
    </tbody>

</table>

</div>
<asset:javascript src="application.js"/>

</body>
</html>
