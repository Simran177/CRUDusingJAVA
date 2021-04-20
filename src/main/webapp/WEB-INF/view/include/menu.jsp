<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>

<s:url var="url_logout" value="/logout"/>

<c:if test="${sessionScope.userId==null}">
    <%-- User is not yet logged in : Guest Menu --%>
    <s:url var="url_reg_form" value="/reg_form"/>
    <s:url var="url_index" value="/index"/>
    <s:url var="url_about" value="/about"/>
    <a class="link" href="${url_index}">Home</a>  <a class="link" href="${url_index}">Login</a>  <a class="link" href="${url_reg_form}">Register</a>  <a class="link" href="${url_about}">About</a> 
</c:if>
<c:if test="${sessionScope.userId!=null && sessionScope.role == 1}">
    <%-- Admin is logged in : Admin Menu --%>    
    <a class="link" href="#">Home</a>  <a class="link" href="<s:url value="/admin/users"/>">User List</a>  <a class="link" href="${url_logout}">Logout</a>  
</c:if>
<c:if test="${sessionScope.userId!=null && sessionScope.role == 2}">
    <%-- General User is logged in : User Menu --%>
    <s:url var="url_uhome" value="/user/dashboard"/>
    <s:url var="url_cform" value="/user/contact_form"/>
    <s:url var="url_clist" value="/user/clist"/>
    <a class="link" href="${url_uhome}">Home</a>  <a class="link" href="${url_cform}">Add Contact</a>  <a class="link" href="${url_clist}">Contact List</a>  <a class="link" href="${url_logout}">Logout</a>  
</c:if>
<!--User Menu functionality is written in dashboard_user page-->
