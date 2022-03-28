package org.apache.jsp.shoppers_002dgh_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import com.ce016.Product;

public final class shop_002dsingle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    HashMap<Integer, Product> product = new HashMap<>();
    int pid = 0;

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

      out.write('\n');
      out.write('\n');

    pid = Integer.parseInt(request.getParameter("prid"));
    Product singlepr = product.get(pid);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Shoppers &mdash; Colorlib e-Commerce Template</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Mukta:300,400,700\"> \n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  \n");
      out.write("  <div class=\"site-wrap\">\n");
      out.write("    <header class=\"site-navbar\" role=\"banner\">\n");
      out.write("      <div class=\"site-navbar-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"col-6 col-md-4 order-2 order-md-1 site-search-icon text-left\">\n");
      out.write("              <form action=\"\" class=\"site-block-top-search\">\n");
      out.write("                <span class=\"icon icon-search2\"></span>\n");
      out.write("                <input type=\"text\" class=\"form-control border-0\" placeholder=\"Search\">\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center\">\n");
      out.write("              <div class=\"site-logo\">\n");
      out.write("                <a href=\"index.jsp\" class=\"js-logo-clone\">Shoppers</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-6 col-md-4 order-3 order-md-3 text-right\">\n");
      out.write("              <div class=\"site-top-icons\">\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\"><span class=\"icon icon-person\"></span></a></li>\n");
      out.write("                  <li><a href=\"#\"><span class=\"icon icon-heart-o\"></span></a></li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"cart.jsp\" class=\"site-cart\">\n");
      out.write("                      <span class=\"icon icon-shopping_cart\"></span>\n");
      out.write("                      <span class=\"count\">2</span>\n");
      out.write("                    </a>\n");
      out.write("                  </li> \n");
      out.write("                  <li class=\"d-inline-block d-md-none ml-md-0\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle\"><span class=\"icon-menu\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("      <nav class=\"site-navigation text-right text-md-center\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <ul class=\"site-menu js-clone-nav d-none d-md-block\">\n");
      out.write("            <li class=\"has-children\">\n");
      out.write("              <a href=\"index.jsp\">Home</a>\n");
      out.write("              <ul class=\"dropdown\">\n");
      out.write("                <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                <li class=\"has-children\">\n");
      out.write("                  <a href=\"#\">Sub Menu</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                    <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                    <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"has-children\">\n");
      out.write("              <a href=\"about.html\">About</a>\n");
      out.write("              <ul class=\"dropdown\">\n");
      out.write("                <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active\"><a href=\"shop.jsp\">Shop</a></li>\n");
      out.write("            <li><a href=\"#\">Catalogue</a></li>\n");
      out.write("            <li><a href=\"#\">New Arrivals</a></li>\n");
      out.write("            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("              <img src=\"");
      out.print( singlepr.getPimage() );
      out.write("\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("              <h2 class=\"text-black\">");
      out.print( singlepr.getProductName() );
      out.write("</h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur, vitae, explicabo? Incidunt facere, natus soluta dolores iusto! Molestiae expedita veritatis nesciunt doloremque sint asperiores fuga voluptas, distinctio, aperiam, ratione dolore.</p>\n");
      out.write("            <p class=\"mb-4\">Ex numquam veritatis debitis minima quo error quam eos dolorum quidem perferendis. Quos repellat dignissimos minus, eveniet nam voluptatibus molestias omnis reiciendis perspiciatis illum hic magni iste, velit aperiam quis.</p>\n");
      out.write("            <p><strong class=\"text-primary h4\">$ ");
      out.print( singlepr.getPrice() );
      out.write("</strong></p>\n");
      out.write("            <div class=\"mb-1 d-flex\">\n");
      out.write("              <label for=\"option-sm\" class=\"d-flex mr-3 mb-3\">\n");
      out.write("                <span class=\"d-inline-block mr-2\" style=\"top:-2px; position: relative;\"><input type=\"radio\" id=\"option-sm\" name=\"shop-sizes\"></span> <span class=\"d-inline-block text-black\">Small</span>\n");
      out.write("              </label>\n");
      out.write("              <label for=\"option-md\" class=\"d-flex mr-3 mb-3\">\n");
      out.write("                <span class=\"d-inline-block mr-2\" style=\"top:-2px; position: relative;\"><input type=\"radio\" id=\"option-md\" name=\"shop-sizes\"></span> <span class=\"d-inline-block text-black\">Medium</span>\n");
      out.write("              </label>\n");
      out.write("              <label for=\"option-lg\" class=\"d-flex mr-3 mb-3\">\n");
      out.write("                <span class=\"d-inline-block mr-2\" style=\"top:-2px; position: relative;\"><input type=\"radio\" id=\"option-lg\" name=\"shop-sizes\"></span> <span class=\"d-inline-block text-black\">Large</span>\n");
      out.write("              </label>\n");
      out.write("              <label for=\"option-xl\" class=\"d-flex mr-3 mb-3\">\n");
      out.write("                <span class=\"d-inline-block mr-2\" style=\"top:-2px; position: relative;\"><input type=\"radio\" id=\"option-xl\" name=\"shop-sizes\"></span> <span class=\"d-inline-block text-black\"> Extra Large</span>\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-5\">\n");
      out.write("              <div class=\"input-group mb-3\" style=\"max-width: 120px;\">\n");
      out.write("              <div class=\"input-group-prepend\">\n");
      out.write("                <button class=\"btn btn-outline-primary js-btn-minus\" type=\"button\">&minus;</button>\n");
      out.write("              </div>\n");
      out.write("              <input type=\"text\" class=\"form-control text-center\" value=\"1\" placeholder=\"\" aria-label=\"Example text with button addon\" aria-describedby=\"button-addon1\">\n");
      out.write("              <div class=\"input-group-append\">\n");
      out.write("                <button class=\"btn btn-outline-primary js-btn-plus\" type=\"button\">&plus;</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <p><a href=\"cart.html\" class=\"buy-now btn btn-sm btn-primary\">Add To Cart</a></p>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <footer class=\"site-footer border-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <h3 class=\"footer-heading mb-4\">Navigations</h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">Sell online</a></li>\n");
      out.write("                  <li><a href=\"#\">Features</a></li>\n");
      out.write("                  <li><a href=\"#\">Shopping cart</a></li>\n");
      out.write("                  <li><a href=\"#\">Store builder</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">Mobile commerce</a></li>\n");
      out.write("                  <li><a href=\"#\">Dropshipping</a></li>\n");
      out.write("                  <li><a href=\"#\">Website development</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">Point of sale</a></li>\n");
      out.write("                  <li><a href=\"#\">Hardware</a></li>\n");
      out.write("                  <li><a href=\"#\">Software</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-3 mb-4 mb-lg-0\">\n");
      out.write("            <h3 class=\"footer-heading mb-4\">Promo</h3>\n");
      out.write("            <a href=\"#\" class=\"block-6\">\n");
      out.write("                <img src=\"");
      out.print( singlepr.getPimage() );
      out.write("\" alt=\"Image placeholder\" class=\"img-fluid rounded mb-4\">\n");
      out.write("              <h3 class=\"font-weight-light  mb-0\">Finding Your Perfect Shoes</h3>\n");
      out.write("              <p>Promo from  nuary 15 &mdash; 25, 2019</p>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 col-lg-3\">\n");
      out.write("            <div class=\"block-5 mb-5\">\n");
      out.write("              <h3 class=\"footer-heading mb-4\">Contact Info</h3>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li class=\"address\">203 Fake St. Mountain View, San Francisco, California, USA</li>\n");
      out.write("                <li class=\"phone\"><a href=\"tel://23923929210\">+2 392 3929 210</a></li>\n");
      out.write("                <li class=\"email\">emailaddress@domain.com</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"block-7\">\n");
      out.write("              <form action=\"#\" method=\"post\">\n");
      out.write("                <label for=\"email_subscribe\" class=\"footer-heading\">Subscribe</label>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" class=\"form-control py-4\" id=\"email_subscribe\" placeholder=\"Email\">\n");
      out.write("                  <input type=\"submit\" class=\"btn btn-sm btn-primary\" value=\"Send\">\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>  \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pt-5 mt-5 text-center\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <p>\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            Copyright &copy;<script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\" class=\"text-primary\">Colorlib</a>\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
