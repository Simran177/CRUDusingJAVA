<%-- 
    Document   : about
    Created on : 20 Apr, 2021, 5:06:20 PM
    Author     : Unnati Goyal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us - Contact Application </title>
         <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
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
                     <jsp:include page="include/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td>
                     <%-- Page Content Area--%>
               
                     <h2 style="text-align:center">Our Team</h2>
                    <div class="row">
                      <div class="column">
                        <div class="card">
                             <s:url var="url_bg" value="/static/images/Unnati.jpeg"/>
                          <img src="${url_bg}" style="width:100%">
                          <div class="container">
                            <h2>Unnati Goyal</h2>
                            <p class="title">Mathura</p>
                          </div>
                        </div>
                      </div>

                      <div class="column">
                        <div class="card">
                           <s:url var="url_bg" value="/static/images/Simran.jpeg"/>
                          <img src="${url_bg}" style="width:100%">
                          <div class="container">
                            <h2>Simran Maurya</h2>
                            <p class="title">Varansi</p>
                          </div>
                        </div>
                      </div>

                      <div class="column">
                        <div class="card">
                           <s:url var="url_bg" value="/static/images/Aishwarya.jpg"/>
                          <img src="${url_bg}" >
                          <div class="container">
                            <h2>Aishwarya Singh</h2>
                            <p class="title">Varansi</p>
                          </div>
                        </div>
                      </div>
                    </div>

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