package org.apache.jsp.shoppers_002dgh_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ce016.Product;
import java.util.HashMap;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 HashMap<Integer, Product> product = new HashMap<>(); 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/shoppers-gh-pages/header.jsp");
    _jspx_dependants.add("/shoppers-gh-pages/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <body>\n");
      out.write("  <div class=\"site-wrap\">\n");
      out.write("    ");
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
      out.write("                                            <a href=\"cart.html\" class=\"site-cart\">\n");
      out.write("                                                <span class=\"icon icon-shopping_cart\"></span>\n");
      out.write("                                                <span class=\"count\">2</span>\n");
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
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"site-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-9 order-2\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 mb-5\">\n");
      out.write("                <div class=\"float-md-left mb-4\"><h2 class=\"text-black h5\">Shop All</h2></div>\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                  <div class=\"dropdown mr-1 ml-md-auto\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary btn-sm dropdown-toggle\" id=\"dropdownMenuOffset\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      Latest\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuOffset\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Men</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Women</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Children</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"btn-group\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary btn-sm dropdown-toggle\" id=\"dropdownMenuReference\" data-toggle=\"dropdown\">Reference</button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuReference\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Relevance</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Name, A to Z</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Name, Z to A</a>\n");
      out.write("                      <div class=\"dropdown-divider\"></div>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Price, low to high</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">Price, high to low</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row mb-5\">\n");
      out.write("                ");

                    for(int i=0;i<product.size();i++){
                
      out.write("\n");
      out.write("              <div class=\"col-sm-6 col-lg-4 mb-4\" data-aos=\"fade-up\">\n");
      out.write("                  <form action=\"shop-single.jsp\" method=\"get\">\n");
      out.write("                <div class=\"block-4 text-center border\">\n");
      out.write("                  <figure class=\"block-4-image\">\n");
      out.write("                      <a href=\"shop-single.jsp\"><img src=\"");
      out.print( product.get(i).getPimage() );
      out.write("\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n");
      out.write("                  </figure>\n");
      out.write("                  <div class=\"block-4-text p-4\">\n");
      out.write("                      <h3><a href=\"shop-single.jsp\">");
      out.print( product.get(i).getProductName() );
      out.write("</a></h3>\n");
      out.write("                      <p class=\"mb-0\">");
      out.print( product.get(i).getPdisc() );
      out.write("</p>\n");
      out.write("                      <p class=\"text-primary font-weight-bold\">$ ");
      out.print( product.get(i).getPrice() );
      out.write("</p>\n");
      out.write("                      <input value=");
      out.print( i );
      out.write(" type=\"hidden\" name=\"prid\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-dark\">view</button> \n");
      out.write("                  </div>\n");
      out.write("                  </form>   \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" data-aos=\"fade-up\">\n");
      out.write("              <div class=\"col-md-12 text-center\">\n");
      out.write("                <div class=\"site-block-27\">\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"#\">&lt;</a></li>\n");
      out.write("                    <li class=\"active\"><span>1</span></li>\n");
      out.write("                    <li><a href=\"#\">2</a></li>\n");
      out.write("                    <li><a href=\"#\">3</a></li>\n");
      out.write("                    <li><a href=\"#\">4</a></li>\n");
      out.write("                    <li><a href=\"#\">5</a></li>\n");
      out.write("                    <li><a href=\"#\">&gt;</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-3 order-1 mb-5 mb-md-0\">\n");
      out.write("            <div class=\"border p-4 rounded mb-4\">\n");
      out.write("              <h3 class=\"mb-3 h6 text-uppercase text-black d-block\">Categories</h3>\n");
      out.write("              <ul class=\"list-unstyled mb-0\">\n");
      out.write("                <li class=\"mb-1\"><a href=\"#\" class=\"d-flex\"><span>Men</span> <span class=\"text-black ml-auto\">(2,220)</span></a></li>\n");
      out.write("                <li class=\"mb-1\"><a href=\"#\" class=\"d-flex\"><span>Women</span> <span class=\"text-black ml-auto\">(2,550)</span></a></li>\n");
      out.write("                <li class=\"mb-1\"><a href=\"#\" class=\"d-flex\"><span>Children</span> <span class=\"text-black ml-auto\">(2,124)</span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"border p-4 rounded mb-4\">\n");
      out.write("              <div class=\"mb-4\">\n");
      out.write("                <h3 class=\"mb-3 h6 text-uppercase text-black d-block\">Filter by Price</h3>\n");
      out.write("                <div id=\"slider-range\" class=\"border-primary\"></div>\n");
      out.write("                <input type=\"text\" name=\"text\" id=\"amount\" class=\"form-control border-0 pl-0 bg-white\" disabled=\"\" />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"mb-4\">\n");
      out.write("                <h3 class=\"mb-3 h6 text-uppercase text-black d-block\">Size</h3>\n");
      out.write("                <label for=\"s_sm\" class=\"d-flex\">\n");
      out.write("                  <input type=\"checkbox\" id=\"s_sm\" class=\"mr-2 mt-1\"> <span class=\"text-black\">Small (2,319)</span>\n");
      out.write("                </label>\n");
      out.write("                <label for=\"s_md\" class=\"d-flex\">\n");
      out.write("                  <input type=\"checkbox\" id=\"s_md\" class=\"mr-2 mt-1\"> <span class=\"text-black\">Medium (1,282)</span>\n");
      out.write("                </label>\n");
      out.write("                <label for=\"s_lg\" class=\"d-flex\">\n");
      out.write("                  <input type=\"checkbox\" id=\"s_lg\" class=\"mr-2 mt-1\"> <span class=\"text-black\">Large (1,392)</span>\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"mb-4\">\n");
      out.write("                <h3 class=\"mb-3 h6 text-uppercase text-black d-block\">Color</h3>\n");
      out.write("                <a href=\"#\" class=\"d-flex color-item align-items-center\" >\n");
      out.write("                  <span class=\"bg-danger color d-inline-block rounded-circle mr-2\"></span> <span class=\"text-black\">Red (2,429)</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"d-flex color-item align-items-center\" >\n");
      out.write("                  <span class=\"bg-success color d-inline-block rounded-circle mr-2\"></span> <span class=\"text-black\">Green (2,298)</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"d-flex color-item align-items-center\" >\n");
      out.write("                  <span class=\"bg-info color d-inline-block rounded-circle mr-2\"></span> <span class=\"text-black\">Blue (1,075)</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"d-flex color-item align-items-center\" >\n");
      out.write("                  <span class=\"bg-primary color d-inline-block rounded-circle mr-2\"></span> <span class=\"text-black\">Purple (1,075)</span>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"site-section site-blocks-2\">\n");
      out.write("                <div class=\"row justify-content-center text-center mb-5\">\n");
      out.write("                  <div class=\"col-md-7 site-section-heading pt-4\">\n");
      out.write("                    <h2>Categories</h2>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-6 col-md-6 col-lg-4 mb-4 mb-lg-0\" data-aos=\"fade\" data-aos-delay=\"\">\n");
      out.write("                    <a class=\"block-2-item\" href=\"#\">\n");
      out.write("                      <figure class=\"image\">\n");
      out.write("                        <img src=\"images/women.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                      </figure>\n");
      out.write("                      <div class=\"text\">\n");
      out.write("                        <span class=\"text-uppercase\">Collections</span>\n");
      out.write("                        <h3>Women</h3>\n");
      out.write("                      </div>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-sm-6 col-md-6 col-lg-4 mb-5 mb-lg-0\" data-aos=\"fade\" data-aos-delay=\"100\">\n");
      out.write("                    <a class=\"block-2-item\" href=\"#\">\n");
      out.write("                      <figure class=\"image\">\n");
      out.write("                        <img src=\"images/children.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                      </figure>\n");
      out.write("                      <div class=\"text\">\n");
      out.write("                        <span class=\"text-uppercase\">Collections</span>\n");
      out.write("                        <h3>Children</h3>\n");
      out.write("                      </div>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-sm-6 col-md-6 col-lg-4 mb-5 mb-lg-0\" data-aos=\"fade\" data-aos-delay=\"200\">\n");
      out.write("                    <a class=\"block-2-item\" href=\"#\">\n");
      out.write("                      <figure class=\"image\">\n");
      out.write("                        <img src=\"images/men.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("                      </figure>\n");
      out.write("                      <div class=\"text\">\n");
      out.write("                        <span class=\"text-uppercase\">Collections</span>\n");
      out.write("                        <h3>Men</h3>\n");
      out.write("                      </div>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("         \n");
      out.write("    <!--------------------------   footer -------------------->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("    <footer class=\"site-footer border-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 mb-5 mb-lg-0\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h3 class=\"footer-heading mb-4\">Navigations</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li><a href=\"#\">Sell online</a></li>\n");
      out.write("                                    <li><a href=\"#\">Features</a></li>\n");
      out.write("                                    <li><a href=\"#\">Shopping cart</a></li>\n");
      out.write("                                    <li><a href=\"#\">Store builder</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li><a href=\"#\">Mobile commerce</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dropshipping</a></li>\n");
      out.write("                                    <li><a href=\"#\">Website development</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li><a href=\"#\">Point of sale</a></li>\n");
      out.write("                                    <li><a href=\"#\">Hardware</a></li>\n");
      out.write("                                    <li><a href=\"#\">Software</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-lg-0\">\n");
      out.write("                        <h3 class=\"footer-heading mb-4\">Promo</h3>\n");
      out.write("                        <a href=\"#\" class=\"block-6\">\n");
      out.write("                            <img src=\"images/hero_1.jpg\" alt=\"Image placeholder\" class=\"img-fluid rounded mb-4\">\n");
      out.write("                            <h3 class=\"font-weight-light  mb-0\">Finding Your Perfect Shoes</h3>\n");
      out.write("                            <p>Promo from  nuary 15 &mdash; 25, 2019</p>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <div class=\"block-5 mb-5\">\n");
      out.write("                            <h3 class=\"footer-heading mb-4\">Contact Info</h3>\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("                                <li class=\"address\">203 Fake St. Mountain View, San Francisco, California, USA</li>\n");
      out.write("                                <li class=\"phone\"><a href=\"tel://23923929210\">+2 392 3929 210</a></li>\n");
      out.write("                                <li class=\"email\">emailaddress@domain.com</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"block-7\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <label for=\"email_subscribe\" class=\"footer-heading\">Subscribe</label>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control py-4\" id=\"email_subscribe\" placeholder=\"Email\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-sm btn-primary\" value=\"Send\">\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row pt-5 mt-5 text-center\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <p>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            Copyright &copy;<script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script>document.write(new Date().getFullYear());</script> All rights reserved | Made with <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a target=\"_blank\" class=\"text-primary\">Perfect Shoppers</a>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"js/aos.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(' ');
      out.write(' ');
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
