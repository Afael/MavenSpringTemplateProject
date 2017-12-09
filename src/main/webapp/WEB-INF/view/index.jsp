<%-- 
    Document   : index
    Created on : Dec 6, 2017, 5:20:25 PM
    Author     : Jajang Jaenal Yusup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        <s:url var="CoreCss" value="/resources/css/bootstrap.css"/>
        <link href="${CoreCss}" rel="stylesheet" type="text/css"/>

        <!-- Waves Effect Css -->
        <s:url var="WaveEffectCss" value="/resources/css/waves.css"/>
        <link href="${WaveEffectCss}" rel="stylesheet" type="text/css"/>

        <!-- Animation Css -->
        <s:url var="AnimationCss" value="/resources/css/animate.css"/>
        <link href="${AnimationCss}" rel="stylesheet" type="text/css"/>

        <!-- Morris Chart Css-->
        <s:url var="MorrisCss" value="/resources/css/morris.css"/>
        <!--<link href="${MorrisCss}" rel="stylesheet" type="text/css"/>-->

        <!-- Custom Css -->
        <s:url var="CustomCss" value="/resources/css/style.css"/>
        <link href="${CustomCss}" rel="stylesheet" type="text/css"/>

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <s:url var="AllThemeCss" value="/resources/css/all-themes.css"/>
        <link href="${AllThemeCss}" rel="stylesheet" type="text/css"/>
    </head>

    <body class="login-page">
        <div id="body" style="display:none;">
            <!-- Page Loader -->
            <div class="page-loader-wrapper">
                <div class="loader">
                    <div class="preloader">
                        <div class="spinner-layer pl-red">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div>
                            <div class="circle-clipper right">
                                <div class="circle"></div>
                            </div>
                        </div>
                    </div>
                    <p>Please wait...</p>
                </div>
            </div>
            <div class="login-box">
                <div class="logo">
                    <a href="javascript:void(0);">Candahar School</a>
                    <small>Smart way to study - online method</small>
                </div>
                <div class="card">
                    <div class="body">
                        <s:url var="loginContact" value="/login"/>
                        <f:form action="${loginContact}" modelAttribute="command">
                            <div class="msg">Sign in to start your session</div>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="material-icons">person</i>
                                </span>
                                <div class="form-line">
                                    <f:input id="loginNameId" type="text" path="loginName" class="form-control" placeholder="Username" required="required" autofocus="autofocus"/>                              
                                </div>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="material-icons">lock</i>
                                </span>
                                <div class="form-line">
                                    <f:input id="passwordId" type="password" path="password" class="form-control" placeholder="Password" required="required" />      
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-8 p-t-5">
                                    <input type="checkbox" name="rememberme" id="rememberme" class="filled-in chk-col-pink">
                                    <label for="rememberme">Remember Me</label>
                                </div>
                                <div class="col-xs-4">
                                    <button class="btn btn-block bg-pink waves-effect" type="submit">SIGN IN</button>
                                </div>
                            </div>
                            <div class="row m-t-15 m-b--20">
                                <div class="col-xs-6">
                                    <a href="sign-up.html">Register Now!</a>
                                </div>
                                <div class="col-xs-6 align-right">
                                    <a href="forgot-password.html">Forgot Password?</a>
                                </div>
                            </div>
                        </f:form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Jquery Core Js -->
        <s:url var="CoreJs" value="/resources/js/jquery.min.js"/>
        <script src="${CoreJs}" type="text/javascript"></script>

        <!-- Bootstrap Core Js -->
        <s:url var="BootstrapCoreJs" value="/resources/js/bootstrap.js"/>
        <script src="${BootstrapCoreJs}" type="text/javascript"></script>

        <!-- Waves Effect Plugin Js -->
        <s:url var="WavesEffectJs" value="/resources/js/waves.js"/>
        <script src="${WavesEffectJs}" type="text/javascript"></script>

        <!-- Validation Plugin Js -->
        <s:url var="ValidationJs" value="/resources/js/jquery.validate.js"/>
        <script src="${ValidationJs}" type="text/javascript"></script>

        <!-- Custom Js -->
        <s:url var="AdminJs" value="/resources/js/admin.js"/>
        <script src="${AdminJs}" type="text/javascript"></script>

        <s:url var="SignInJs" value="/resources/js/sign-in.js"/>
        <script src="${SignInJs}" type="text/javascript"></script>
        
        <!--MODALS-->
        <s:url var="ModalsJs" value="/resources/js/modals.js"/>
        <script src="${ModalsJs}" type="text/javascript"></script>
        
        <script type="text/javascript">
            $(document).ready(function () {
                $('#body').show();
                $('#loginNameId').focus();
            });
        </script>
        
        <div class="modal fade" id="defaultModal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="defaultModalLabel">Modal title</h4>
                        </div>
                        <div class="modal-body">
                            Test
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-link waves-effect" data-dismiss="modal">CLOSE</button>
                        </div>
                    </div>
                </div>
            </div>
    </body>

</html>