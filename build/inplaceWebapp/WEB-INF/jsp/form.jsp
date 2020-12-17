<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="ajoutFilm" method="post" modelAttribute="film">
    <form:input path="titre"/>
    <form:input path="realisateur"/>
    <button type="submit">Envoyer</button>
</form:form>
</body>
</html>
