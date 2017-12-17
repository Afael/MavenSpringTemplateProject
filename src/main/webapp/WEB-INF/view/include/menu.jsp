<%-- 
    Document   : menu
    Created on : Dec 7, 2017, 10:07:17 AM
    Author     : Jajang Jaenal Yusup
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url var="linkLogout" value="/logout" />

<c:if test="${sessionScope.ContactPersonId == null}">
    <%-- ContactPerson not yet logged in - Guest Menu --%>
    <a href="#">Home</a> | <a href="#">Login</a> | <a href="#">Register</a> | <a href="#">About</a> | <a href="#">Help</a>
</c:if>

<c:if test="${sessionScope.ContactPersonId != null && sessionScope.ContactPersonRole == 1}">
    <%-- ContactPerson is logged in - Admin Menu --%>
    <a href="#">Home</a> | <a href="#">Contact List</a> | <a href="${linkLogout}">Logout</a>
</c:if>

<c:if test="${sessionScope.ContactPersonId != null && sessionScope.ContactPersonRole == 2}">
    <%-- ContactPerson logged in - Contact Person Menu --%>
    <a href="#">Home</a> | <a href="#">Add Contact</a> | <a href="#">Contact List</a> | <a href="${linkLogout}">Logout</a>
</c:if>