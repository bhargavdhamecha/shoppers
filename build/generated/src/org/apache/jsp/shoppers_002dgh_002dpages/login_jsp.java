package org.apache.jsp.shoppers_002dgh_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login|Sign Up</title>\n");
      out.write("        <style>\n");
      out.write("            .box {\n");
      out.write("  position: relative;\n");
      out.write("  top: 0;\n");
      out.write("  opacity: 1;\n");
      out.write("  float: left;\n");
      out.write("  padding: 60px 50px 40px 50px;\n");
      out.write("  width: 100%;\n");
      out.write("  background: #fff;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  transform: scale(1);\n");
      out.write("  -webkit-transform: scale(1);\n");
      out.write("  -ms-transform: scale(1);\n");
      out.write("  z-index: 5;\n");
      out.write("\n");
      out.write("  &.back {\n");
      out.write("    transform: scale(0.95);\n");
      out.write("    -webkit-transform: scale(0.95);\n");
      out.write("    -ms-transform: scale(0.95);\n");
      out.write("    top: -20px;\n");
      out.write("    opacity: .8;\n");
      out.write("    z-index: -1;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  &:before {\n");
      out.write("    content: \"\";\n");
      out.write("    width: 100%;\n");
      out.write("    height: 30px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: -10px;\n");
      out.write("    background: rgba(255, 255, 255, 0.6);\n");
      out.write("    left: 0;\n");
      out.write("    transform: scale(0.95);\n");
      out.write("    -webkit-transform: scale(0.95);\n");
      out.write("    -ms-transform: scale(0.95);\n");
      out.write("    z-index: -1;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overbox .title {\n");
      out.write("  color: #fff;\n");
      out.write("\n");
      out.write("  &:before {\n");
      out.write("    background: #fff;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  width: 100%;\n");
      out.write("  float: left;\n");
      out.write("  line-height: 46px;\n");
      out.write("  font-size: 34px;\n");
      out.write("  font-weight: 700;\n");
      out.write("  letter-spacing: 2px;\n");
      out.write("  color: #ED2553;\n");
      out.write("  position: relative;\n");
      out.write("\n");
      out.write("  &:before {\n");
      out.write("    content: \"\";\n");
      out.write("    width: 5px;\n");
      out.write("    height: 100%;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: -50px;\n");
      out.write("    background: #ED2553;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("\n");
      out.write("  label, input, .spin {\n");
      out.write("    transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("\n");
      out.write("  button .button.login button i.fa {\n");
      out.write("    transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button .shape {\n");
      out.write("  &:before, &:after {\n");
      out.write("    transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("    -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button.login button {\n");
      out.write("  transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -webkit-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -ms-transition: 300ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button, .alt-2, .material-button .shape, .alt-2 .shape, .box {\n");
      out.write("  transition: 400ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -webkit-transition: 400ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("  -ms-transition: 400ms cubic-bezier(0.4, 0, 0.2, 1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  width: 100%;\n");
      out.write("  float: left;\n");
      out.write("\n");
      out.write("  label, input, .spin {\n");
      out.write("    width: 100%;\n");
      out.write("    float: left;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  width: 100%;\n");
      out.write("  float: left;\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    width: 100%;\n");
      out.write("    float: left;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input, .button {\n");
      out.write("  margin-top: 30px;\n");
      out.write("  height: 70px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  position: relative;\n");
      out.write("\n");
      out.write("  input {\n");
      out.write("    position: relative;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  position: relative;\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    position: relative;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  input {\n");
      out.write("    height: 60px;\n");
      out.write("    top: 10px;\n");
      out.write("    border: none;\n");
      out.write("    background: transparent;\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("    font-size: 24px;\n");
      out.write("    color: rgba(0, 0, 0, 0.8);\n");
      out.write("    font-weight: 300;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  label {\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("    font-size: 24px;\n");
      out.write("    color: rgba(0, 0, 0, 0.8);\n");
      out.write("    font-weight: 300;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button button {\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  font-size: 24px;\n");
      out.write("  color: rgba(0, 0, 0, 0.8);\n");
      out.write("  font-weight: 300;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("  &:before, .spin {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 1px;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  &:before {\n");
      out.write("    content: \"\";\n");
      out.write("    background: rgba(0, 0, 0, 0.1);\n");
      out.write("    z-index: 3;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .spin {\n");
      out.write("    background: #ED2553;\n");
      out.write("    z-index: 4;\n");
      out.write("    width: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overbox .input {\n");
      out.write("  .spin {\n");
      out.write("    background: rgba(255, 255, 255, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  &:before {\n");
      out.write("    background: rgba(255, 255, 255, 0.5);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input label {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 10px;\n");
      out.write("  left: 0;\n");
      out.write("  z-index: 2;\n");
      out.write("  cursor: pointer;\n");
      out.write("  line-height: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  &.login {\n");
      out.write("    width: 60%;\n");
      out.write("    left: 20%;\n");
      out.write("\n");
      out.write("    button {\n");
      out.write("      width: 100%;\n");
      out.write("      line-height: 64px;\n");
      out.write("      left: 0%;\n");
      out.write("      background-color: transparent;\n");
      out.write("      border: 3px solid rgba(0, 0, 0, 0.1);\n");
      out.write("      font-weight: 900;\n");
      out.write("      font-size: 18px;\n");
      out.write("      color: rgba(0, 0, 0, 0.2);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    width: 100%;\n");
      out.write("    line-height: 64px;\n");
      out.write("    left: 0%;\n");
      out.write("    background-color: transparent;\n");
      out.write("    border: 3px solid rgba(0, 0, 0, 0.1);\n");
      out.write("    font-weight: 900;\n");
      out.write("    font-size: 18px;\n");
      out.write("    color: rgba(0, 0, 0, 0.2);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  &.login {\n");
      out.write("    margin-top: 30px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  margin-top: 20px;\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #ED2553;\n");
      out.write("    border: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  &.login button {\n");
      out.write("    &.active {\n");
      out.write("      border: 3px solid transparent;\n");
      out.write("      color: #fff !important;\n");
      out.write("\n");
      out.write("      span {\n");
      out.write("        opacity: 0;\n");
      out.write("        transform: scale(0);\n");
      out.write("        -webkit-transform: scale(0);\n");
      out.write("        -ms-transform: scale(0);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      i.fa {\n");
      out.write("        opacity: 1;\n");
      out.write("        transform: scale(1) rotate(-0deg);\n");
      out.write("        -webkit-transform: scale(1) rotate(-0deg);\n");
      out.write("        -ms-transform: scale(1) rotate(-0deg);\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    i.fa {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 100%;\n");
      out.write("      position: absolute;\n");
      out.write("      top: 0;\n");
      out.write("      left: 0;\n");
      out.write("      line-height: 60px;\n");
      out.write("      transform: scale(0) rotate(-45deg);\n");
      out.write("      -webkit-transform: scale(0) rotate(-45deg);\n");
      out.write("      -ms-transform: scale(0) rotate(-45deg);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    &:hover {\n");
      out.write("      color: #ED2553;\n");
      out.write("      border-color: #ED2553;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  margin: 40px 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  z-index: 2;\n");
      out.write("\n");
      out.write("  button {\n");
      out.write("    cursor: pointer;\n");
      out.write("    position: relative;\n");
      out.write("    z-index: 2;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pass-forgot {\n");
      out.write("  width: 100%;\n");
      out.write("  float: left;\n");
      out.write("  text-align: center;\n");
      out.write("  color: rgba(0, 0, 0, 0.4);\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".click-efect {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  background: #ED2553;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overbox {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  overflow: inherit;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  padding: 60px 50px 40px 50px;\n");
      out.write("\n");
      out.write("  .title, .button, .input {\n");
      out.write("    z-index: 111;\n");
      out.write("    position: relative;\n");
      out.write("    color: #fff !important;\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .title {\n");
      out.write("    width: 80%;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .input {\n");
      out.write("    margin-top: 20px;\n");
      out.write("\n");
      out.write("    input, label {\n");
      out.write("      color: #fff;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .material-button, .alt-2 {\n");
      out.write("    display: block;\n");
      out.write("\n");
      out.write("    .shape {\n");
      out.write("      display: block;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button, .alt-2 {\n");
      out.write("  width: 140px;\n");
      out.write("  height: 140px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  background: #ED2553;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 40px;\n");
      out.write("  right: -70px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  z-index: 100;\n");
      out.write("  transform: translate(0%, 0%);\n");
      out.write("  -webkit-transform: translate(0%, 0%);\n");
      out.write("  -ms-transform: translate(0%, 0%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button .shape, .alt-2 .shape {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button .shape:before, .alt-2 .shape:before, .material-button .shape:after, .alt-2 .shape:after {\n");
      out.write("  content: \"\";\n");
      out.write("  background: #fff;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%) rotate(360deg);\n");
      out.write("  -webkit-transform: translate(-50%, -50%) rotate(360deg);\n");
      out.write("  -ms-transform: translate(-50%, -50%) rotate(360deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button .shape:before, .alt-2 .shape:before {\n");
      out.write("  width: 25px;\n");
      out.write("  height: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button .shape:after, .alt-2 .shape:after {\n");
      out.write("  height: 25px;\n");
      out.write("  width: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".material-button.active, .alt-2.active {\n");
      out.write("  top: 50%;\n");
      out.write("  right: 50%;\n");
      out.write("  transform: translate(50%, -50%) rotate(0deg);\n");
      out.write("  -webkit-transform: translate(50%, -50%) rotate(0deg);\n");
      out.write("  -ms-transform: translate(50%, -50%) rotate(0deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-image: url(https://lh4.googleusercontent.com/-XplyTa1Za-I/VMSgIyAYkHI/AAAAAAAADxM/oL-rD6VP4ts/w1184-h666/Android-Lollipop-wallpapers-Google-Now-Wallpaper-2.png);\n");
      out.write("  background-position: center;\n");
      out.write("  background-size: cover;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  min-height: 100vh;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".materialContainer {\n");
      out.write("  width: 100%;\n");
      out.write("  max-width: 460px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  -webkit-transform: translate(-50%, -50%);\n");
      out.write("  -ms-transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("  list-style-type: none;\n");
      out.write("  outline: none;\n");
      out.write("\n");
      out.write("  &:after, &::before {\n");
      out.write("    -webkit-box-sizing: border-box;\n");
      out.write("    -moz-box-sizing: border-box;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    text-decoration: none;\n");
      out.write("    list-style-type: none;\n");
      out.write("    outline: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"materialContainer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"box\">\n");
      out.write("\n");
      out.write("                <div class=\"title\">LOGIN</div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"name\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"name\" id=\"name\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"pass\">Password</label>\n");
      out.write("                    <input type=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"button login\">\n");
      out.write("                    <button><span>GO</span> <i class=\"fa fa-check\"></i></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"\" class=\"pass-forgot\">Forgot your password?</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"overbox\">\n");
      out.write("                <div class=\"material-button alt-2\"><span class=\"shape\"></span></div>\n");
      out.write("\n");
      out.write("                <div class=\"title\">REGISTER</div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"regname\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"regname\" id=\"regname\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"regpass\">Password</label>\n");
      out.write("                    <input type=\"password\" name=\"regpass\" id=\"regpass\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input\">\n");
      out.write("                    <label for=\"reregpass\">Repeat Password</label>\n");
      out.write("                    <input type=\"password\" name=\"reregpass\" id=\"reregpass\">\n");
      out.write("                    <span class=\"spin\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"button\">\n");
      out.write("                    <button><span>NEXT</span></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("\n");
      out.write("                $(\".input input\").focus(function () {\n");
      out.write("\n");
      out.write("                    $(this).parent(\".input\").each(function () {\n");
      out.write("                        $(\"label\", this).css({\n");
      out.write("                            \"line-height\": \"18px\",\n");
      out.write("                            \"font-size\": \"18px\",\n");
      out.write("                            \"font-weight\": \"100\",\n");
      out.write("                            \"top\": \"0px\"\n");
      out.write("                        })\n");
      out.write("                        $(\".spin\", this).css({\n");
      out.write("                            \"width\": \"100%\"\n");
      out.write("                        })\n");
      out.write("                    });\n");
      out.write("                }).blur(function () {\n");
      out.write("                    $(\".spin\").css({\n");
      out.write("                        \"width\": \"0px\"\n");
      out.write("                    })\n");
      out.write("                    if ($(this).val() == \"\") {\n");
      out.write("                        $(this).parent(\".input\").each(function () {\n");
      out.write("                            $(\"label\", this).css({\n");
      out.write("                                \"line-height\": \"60px\",\n");
      out.write("                                \"font-size\": \"24px\",\n");
      out.write("                                \"font-weight\": \"300\",\n");
      out.write("                                \"top\": \"10px\"\n");
      out.write("                            })\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\".button\").click(function (e) {\n");
      out.write("                    var pX = e.pageX,\n");
      out.write("                            pY = e.pageY,\n");
      out.write("                            oX = parseInt($(this).offset().left),\n");
      out.write("                            oY = parseInt($(this).offset().top);\n");
      out.write("\n");
      out.write("                    $(this).append('<span class=\"click-efect x-' + oX + ' y-' + oY + '\" style=\"margin-left:' + (pX - oX) + 'px;margin-top:' + (pY - oY) + 'px;\"></span>')\n");
      out.write("                    $('.x-' + oX + '.y-' + oY + '').animate({\n");
      out.write("                        \"width\": \"500px\",\n");
      out.write("                        \"height\": \"500px\",\n");
      out.write("                        \"top\": \"-250px\",\n");
      out.write("                        \"left\": \"-250px\",\n");
      out.write("\n");
      out.write("                    }, 600);\n");
      out.write("                    $(\"button\", this).addClass('active');\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                $(\".alt-2\").click(function () {\n");
      out.write("                    if (!$(this).hasClass('material-button')) {\n");
      out.write("                        $(\".shape\").css({\n");
      out.write("                            \"width\": \"100%\",\n");
      out.write("                            \"height\": \"100%\",\n");
      out.write("                            \"transform\": \"rotate(0deg)\"\n");
      out.write("                        })\n");
      out.write("\n");
      out.write("                        setTimeout(function () {\n");
      out.write("                            $(\".overbox\").css({\n");
      out.write("                                \"overflow\": \"initial\"\n");
      out.write("                            })\n");
      out.write("                        }, 600)\n");
      out.write("\n");
      out.write("                        $(this).animate({\n");
      out.write("                            \"width\": \"140px\",\n");
      out.write("                            \"height\": \"140px\"\n");
      out.write("                        }, 500, function () {\n");
      out.write("                            $(\".box\").removeClass(\"back\");\n");
      out.write("\n");
      out.write("                            $(this).removeClass('active')\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        $(\".overbox .title\").fadeOut(300);\n");
      out.write("                        $(\".overbox .input\").fadeOut(300);\n");
      out.write("                        $(\".overbox .button\").fadeOut(300);\n");
      out.write("\n");
      out.write("                        $(\".alt-2\").addClass('material-buton');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                $(\".material-button\").click(function () {\n");
      out.write("\n");
      out.write("                    if ($(this).hasClass('material-button')) {\n");
      out.write("                        setTimeout(function () {\n");
      out.write("                            $(\".overbox\").css({\n");
      out.write("                                \"overflow\": \"hidden\"\n");
      out.write("                            })\n");
      out.write("                            $(\".box\").addClass(\"back\");\n");
      out.write("                        }, 200)\n");
      out.write("                        $(this).addClass('active').animate({\n");
      out.write("                            \"width\": \"700px\",\n");
      out.write("                            \"height\": \"700px\"\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        setTimeout(function () {\n");
      out.write("                            $(\".shape\").css({\n");
      out.write("                                \"width\": \"50%\",\n");
      out.write("                                \"height\": \"50%\",\n");
      out.write("                                \"transform\": \"rotate(45deg)\"\n");
      out.write("                            })\n");
      out.write("\n");
      out.write("                            $(\".overbox .title\").fadeIn(300);\n");
      out.write("                            $(\".overbox .input\").fadeIn(300);\n");
      out.write("                            $(\".overbox .button\").fadeIn(300);\n");
      out.write("                        }, 700)\n");
      out.write("\n");
      out.write("                        $(this).removeClass('material-button');\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if ($(\".alt-2\").hasClass('material-buton')) {\n");
      out.write("                        $(\".alt-2\").removeClass('material-buton');\n");
      out.write("                        $(\".alt-2\").addClass('material-button');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
