<%-- 
    Document   : index
    Created on : 11 Apr, 2021, 3:54:35 PM
    Author     : Simran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--to add a url we use taglib --%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard - Contact Application</title>
        <s:url var="url_css" value="/static/css/style.css" />
        <link href="${url_css}" rel="stylesheet" type="text/css" />
    </head>
    <%--<s:url var="url_bg" value="/static/images/bg-1.jpg"/>--%>
    <!--<body background="${url_bg}">-->
    <body>
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <!--<h1>Contact Application</h1>-->
                    <jsp:include page="include/header.jsp" />
                </td>
                </tr>
                <tr>
                <td height="25px">
                    <%-- Menu --%>
                    <%--<jsp:include page="include/menu.jsp" />--%>
                    <s:url var="url_logout" value="/logout"/>
                    <s:url var="url_uhome" value="/user/dashboard"/>
                    <s:url var="url_cform" value="/user/contact_form"/>
                    <s:url var="url_clist" value="/user/clist"/>
                    <a href="${url_uhome}">Home</a> | <a href="${url_clist}">Contact List</a> | <a href="${url_cform}">Add Contact</a> | <a href="${url_logout}">Logout</a>  
                </td>
                </tr>
                <tr>
                <td height="350px" valign="top">
                    <%-- Page Content Area --%>
                    <h1>User Dashboard</h1>
                    TODO- User Option in this page
                </td>
                </tr>
                <tr>
                <td height="25px">
                    <%-- Footer --%>
                     <jsp:include page="include/footer.jsp" />
                </td>
            </tr>
        </table>
    </body>
</html>
