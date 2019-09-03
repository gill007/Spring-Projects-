<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Goal Added</title>
<style>
 .error{color:#FF0000}
 
 .errorblock{color:#000; background-color:#ffEEEE}

</style>

</head>
<body>
<form:form modelAttribute="goal">
  <form:errors path="*" cssClass="errorblock" element="div"/>
  <table>
     <tr> <td>Enter Minutes:</td><td><form:input path="minutes"/></td>
     <td><form:errors path="minutes" cssClass="error"/></td>
     </tr>
     <tr><td colspan="3"><input type="submit" value="Enter Goal Minutes"></td></tr>
  </table>
</form:form>

</body>
</html>