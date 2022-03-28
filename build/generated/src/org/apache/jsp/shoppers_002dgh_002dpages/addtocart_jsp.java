package org.apache.jsp.shoppers_002dgh_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ce016.Product;
import java.util.HashMap;

public final class addtocart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 HashMap<Integer, Product> product = new HashMap<>();
    HashMap<Integer, Integer> cart = new HashMap<>();
    int TotalQuantity=0;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/shoppers-gh-pages/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    if(application.getAttribute("product")== null){
        product = Product.getProducts();
        application.setAttribute("product", product);
    }
    else{
        product = (HashMap<Integer, Product>) application.getAttribute("product");
    }
    
    if(session.getAttribute("cart")==null){
        session.setAttribute("cart", cart);
        session.setAttribute("TotalQuantity", TotalQuantity);    
    }
    else{
        cart = (HashMap<Integer, Integer>)session.getAttribute("cart");
        TotalQuantity = (Integer)session.getAttribute("TotalQuantity");
    }
    
    
 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Perfect shoppers</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Mukta:300,400,700\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header class=\"site-navbar\" role=\"banner\">\n");
      out.write("                <div class=\"site-navbar-top\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row align-items-center\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-6 col-md-4 order-2 order-md-1 site-search-icon text-left\">\n");
      out.write("                                <form action=\"\" class=\"site-block-top-search\">\n");
      out.write("                                    <span class=\"icon icon-search2\"></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control border-0\" placeholder=\"Search\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center\">\n");
      out.write("                                <div class=\"site-logo\">\n");
      out.write("                                    <a href=\"index.jsp\" class=\"js-logo-clone\">Shoppers</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-6 col-md-4 order-3 order-md-3 text-right\">\n");
      out.write("                                <div class=\"site-top-icons\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"login.jsp\"><span class=\"icon icon-person\"></span></a></li>\n");
      out.write("                                        <li><a href=\"#\"><span class=\"icon icon-heart-o\"></span></a></li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"addtocart.jsp\" class=\"site-cart\">\n");
      out.write("                                                <span class=\"icon icon-shopping_cart\"></span>\n");
      out.write("                                                <span class=\"count\">");
      out.print( TotalQuantity );
      out.write("</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li> \n");
      out.write("                                        <li class=\"d-inline-block d-md-none ml-md-0\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle\"><span class=\"icon-menu\"></span></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <ul class=\"site-menu js-clone-nav d-none d-md-block\">\n");
      out.write("                            <li class=\"has-children active\">\n");
      out.write("                                <a href=\"index.jsp\">Home</a>\n");
      out.write("                                <ul class=\"dropdown\">\n");
      out.write("                                    <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                                    <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                                    <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                                    <li class=\"has-children\">\n");
      out.write("                                        <a href=\"#\">Sub Menu</a>\n");
      out.write("                                        <ul class=\"dropdown\">\n");
      out.write("                                            <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                                            <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                                            <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"has-children\">\n");
      out.write("                                <a href=\"about.html\">About</a>\n");
      out.write("                                <ul class=\"dropdown\">\n");
      out.write("                                    <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                                    <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                                    <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"shop.jsp\">Shop</a></li>\n");
      out.write("                            <li><a href=\"#\">Catalogue</a></li>\n");
      out.write("                            <li><a href=\"#\">New Arrivals</a></li>\n");
      out.write("                            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write('\n');

    int prQuantity = Integer.parseInt(request.getParameter("prQuantity"));

      out.write('\n');
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
