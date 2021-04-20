<%-- 
    Document   : index
    Created on : 11 Apr, 2021, 3:54:35 PM
    Author     : Simran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard - Contact Application </title>
         <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    <s:url var="url_bg" value="/static/images/bg.jpg"/>
    <body background="${url_bg}">
        <table width="80%" align="center">
            <tr>
                <td height="80px" class="tableheader">
                    <%-- Header --%>
                    <jsp:include page="include/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px" class="tablemenu">
                     <%-- Menu --%>
                     <%--<jsp:include page="include/menu.jsp" />--%>
                    <s:url var="url_logout" value="/logout"/>
                    <s:url var="url_uhome" value="/user/dashboard"/>
                    <s:url var="url_cform" value="/user/contact_form"/>
                    <s:url var="url_clist" value="/user/clist"/>
                    <a class="link" href="${url_uhome}">Home</a>  <a class="link" href="${url_cform}">Add Contact</a>  <a class="link" href="${url_clist}">Contact List</a>  <a class="link" href="${url_logout}">Logout</a>  
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top" class="formtable">
                     <%-- Page Content Area--%>
                     <h1>User Dashboard</h1>
                     <p>TODO : User Options in this page</p>
                </td>
            </tr>
             <tr>
                 <td height="25px" class="footer">
                     <%-- Footer --%>
                     <jsp:include page="include/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>