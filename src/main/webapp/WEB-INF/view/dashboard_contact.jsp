<%-- 
    Document   : index
    Created on : Dec 6, 2017, 5:20:25 PM
    Author     : Jajang Jaenal Yusup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="c" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Welcome To | Bootstrap Based Admin Template - Material Design</title>
        <!-- Favicon-->
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">
        
        <link href="resources/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="resources/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        
        <!-- Bootstrap Core Css -->
        <c:url var="CoreCss" value="/resources/css/bootstrap.css"/>
        <link href="${CoreCss}" rel="stylesheet" type="text/css"/>

        <!-- Waves Effect Css -->
        <c:url var="WaveEffectCss" value="/resources/css/waves.css"/>
        <link href="${WaveEffectCss}" rel="stylesheet" type="text/css"/>
        
        <!-- Animation Css -->
        <c:url var="AnimationCss" value="/resources/css/animate.css"/>
        <link href="${AnimationCss}" rel="stylesheet" type="text/css"/>

        <!-- Morris Chart Css-->
        <c:url var="MorrisCss" value="/resources/css/morris.css"/>
        <link href="${MorrisCss}" rel="stylesheet" type="text/css"/>

        <!-- Custom Css -->
        <c:url var="CustomCss" value="/resources/css/style.css"/>
        <link href="${CustomCss}" rel="stylesheet" type="text/css"/>

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <c:url var="AllThemeCss" value="/resources/css/all-themes.css"/>
        <link href="${AllThemeCss}" rel="stylesheet" type="text/css"/>
    </head>

    <body class="theme-red">
        <!-- Page Loader -->
        <!-- Bordered Table -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                                CANDAHAR TECHNOLOGIES
                                <!--<small>Add <code>.table-bordered</code> for borders on all sides of the table and cells.</small>-->
                            </h2>
                        </div>
                        <div class="body table-responsive">
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <td height="80px">
                                            <%-- HEADER --%>
                                            <jsp:include page="include/header.jsp"/>
                                        </td>
                                    </tr>
                                </thead>
                                <thead>
                                    <tr>
                                        <td height="25px">
                                            <%-- MENU --%>
                                            <jsp:include page="include/menu.jsp"/>
                                        </td>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr height="360px">
                                        <td>
                                            <%-- CONTENT --%>
                                            <h1>Contact Dashboard</h1>
                                        </td>
                                    </tr>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <td>
                                            <%-- FOOTER --%>
                                            <jsp:include page="include/footer.jsp"/>
                                        </td>
                                    </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Bordered Table -->
    </body>

</html>