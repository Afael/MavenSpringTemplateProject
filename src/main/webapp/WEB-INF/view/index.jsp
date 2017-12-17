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
<html class="body-full-height">

    <head>
        <meta http-equiv="Content-Type" charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Welcome To | Management Contact</title>
        <!-- Favicon-->
        <!--<link rel="icon" href="favicon.ico" type="image/x-icon">-->

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!--<link href="resources/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="resources/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>-->

        <!-- Bootstrap Core Css -->
        <s:url var="BootstrapCoreCss" value="/resources/assets/css/theme-default.css"/>
        <link href="${BootstrapCoreCss}" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <!--        <div id="body" style="display:none;">
                     Page Loader 
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
            onsubmit="return checkInputForm();"
            <div class="msg">Sign in to start your session</div>
            <div class="input-group">
                <span class="input-group-addon">
                    <i class="material-icons">person</i>
                </span>
                <div class="form-line">                            
        </div>
    </div>
    <div class="input-group">
        <span class="input-group-addon">
            <i class="material-icons">lock</i>
        </span>
        <div class="form-line"> 
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
    </div>
</div>
</div>
</div>
</div>-->
        <div class="login-container lightmode">

            <div class="login-box animated fadeInDown">
                <!-- <div class="login-logo"></div>-->
                <div class="login-body">
                    <div class="login-title"><strong>Log In</strong> to your account</div>
                    <s:url var="loginContact" value="/login"/>
                    <f:form class="form-horizontal" action="${loginContact}" modelAttribute="command" > 
                        <div class="form-group">
                            <div class="col-md-12">
                                <f:input id="loginNameId" type="text" path="loginName" class="form-control" placeholder="Username" required="required" autofocus="autofocus"/>
                                <!--<input type="text" id="userEmail" name="userEmail" class="form-control" placeholder="E-mail"/>-->
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12">
                                <f:input id="passwordId" type="password" path="password" class="form-control" placeholder="Password" required="required" />
                                <!--<input type="password" id="userPassword" name="userPassword" class="form-control" placeholder="Password"/>-->
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6">
                                <a href="#" class="btn btn-link btn-block">Forgot your password?</a>
                            </div>
                            <div class="col-md-6">
                                <button type="submit" class="btn btn-info btn-block" >Log In</button>
                            </div>
                        </div>
                    </f:form>
                </div>
                <div class="login-footer">
                    <div class="pull-left">
                        &copy; 2014 Candahar
                    </div>
                    <div class="pull-right">
                        <a href="#">About</a> |
                        <a href="#">Privacy</a> |
                        <a href="#">Contact Us</a>
                    </div>
                </div>
            </div>

        </div>
        

        <!--MODALS-->
        <s:url var="ModalsJs" value="/resources/js/modals.js"/>
        <script src="${ModalsJs}" type="text/javascript"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#body').show();
                $('#loginNameId').focus();
            });
            
            function OnMessageFailure(MsgType, UserContext)
            {
                document.getElementById('FailureMsgType').innerHTML = MsgType;
                document.getElementById('FailureUserContext').innerHTML = UserContext;
                $("div[id*=FailureMsgDialog]").modal("show");
            }

            function checkInputForm()
            {
                if (!$("#loginNameId").val())
                {
                    OnMessageFailure("Something went wrong", "please review your entry on username");
                    $("#loginNameId").focus();
                    return false;
                }
                if (!$("#password").val())
                {
                    OnMessageFailure("Something went wrong", "please review your entry on password");
                    $("#password").focus();
                    return false;
                }
            }
        </script>

        <div class="modal fade" id="FailureMsgDialog" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="FailureMsgType">Modal title</h4>
                    </div>
                    <div class="modal-body">
                        <p><label id="FailureUserContext"></label></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-link waves-effect" data-dismiss="modal">CLOSE</button>
                    </div>
                </div>
            </div>
        </div>

        <s:url var="CoreJquery" value="/assets/js/jquery.min.js"/>
        <s:url var="CoreJqueryUi" value="/assets/js/jquery-ui.min.js"/>
        <s:url var="BootstrapJs" value="/assets/js/bootstrap.min.js"/>

        <script src="${CoreJquery}" type="text/javascript"></script>
        <script src="${CoreJqueryUi}" type="text/javascript"></script>
        <script src="${BootstrapJs}" type="text/javascript"></script>
    </body>

</html>