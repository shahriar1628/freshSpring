<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url var="actionUrl" value="addStudent" />

<form:form action="${actionUrl}" modelAttribute="student" method="POST" acceptCharset="UTF-8">
	<form:input path="name" />
	<form:errors path="name" />

	<form:input path="age" />
	<form:errors path="age" />


    <form:button id="add-student">Add Student</form:button>
</form:form>