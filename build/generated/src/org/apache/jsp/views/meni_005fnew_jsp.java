package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meni_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/views/template/header.jsp");
    _jspx_dependants.add("/views/template/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>MMA</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- navbar top -->\n");
      out.write("        <nav class=\"navbar navbar-inverse topnav\"style=\"opacity: 0.80;\">\n");
      out.write("\n");
      out.write("            <!-- topnav -->\n");
      out.write("            <div class=\"container topnav\">\n");
      out.write("\n");
      out.write("                <!-- Logo -->\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#mainNavBar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"> <img src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("                         style=\"position: relative; right: 30px; bottom: 5px; height:73px;\" class=\"navbar-brand\"/>\n");
      out.write("                    <a href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" class=\"navbar-brand\">MMA Picerija</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Menu Items -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"mainNavBar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">O nama</a></li>\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">Kontakt</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\">Meni</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li> <a href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\">Login/Register</a></li>\n");
      out.write("                    </ul>     \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container marketing\">\n");
      out.write("    \n");
      out.write("    <!-- Three columns of text below the carousel -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <img class=\"img-circle\"\n");
      out.write("                 src=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\" alt=\"Capricciosa\"width=\"140\" height=\"140\">\n");
      out.write("\n");
      out.write("            <h2>Capricciosa</h2>\n");
      out.write("            <p>Najpopularnija pica. Ultimativno dostignuće pizza majstora, odličan spoj  osvojiće Vas na prvi zalogaj.</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                    &raquo;</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <img class=\"img-circle\"\n");
      out.write("                 src=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\" alt=\"Margherita\"width=\"140\" height=\"140\">\n");
      out.write("            <h2>Margherita</h2>\n");
      out.write("            <p>Suština svake pizze je upravo ova pizza i sve ostale su nadgradnja.  \n");
      out.write("                Odličan ukus pice margarite. Probajte i nećete se pokajati.</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                    &raquo;</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <img class=\"img-circle\"\n");
      out.write("                 src=\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\" alt=\"QuattroFormaggi\"width=\"140\" height=\"140\">\n");
      out.write("            <h2>Quattro formaggi</h2>\n");
      out.write("            <p>Kraljica ponude, pizza sa 4 vrste sira, za prave hedoniste i ljubitelje sireva.</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                    &raquo;</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.col-lg-4 -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.row -->\n");
      out.write("\n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("        <!-- Three columns of text below the carousel -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle\"\n");
      out.write("                     src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" alt=\"Pepperoni\"width=\"140\" height=\"140\">\n");
      out.write("\n");
      out.write("                <h2>Pepperoni </h2>\n");
      out.write("                <p>Pica koja ostavlja bez daha. Originalna Pepperoni kobasica,\n");
      out.write("                    pikantna taman koliko treba osvojiće Vas već pri prvom zalogaju.</p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                        &raquo;</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle\"\n");
      out.write("                     src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" alt=\"Hawaii\"width=\"140\" height=\"140\">\n");
      out.write("                <h2>Hawaii</h2>\n");
      out.write("                <p>Neverovatan spoj slanog, slatkog i kiselog. \n");
      out.write("                    Mnogi kojima se ova pica nije svidela na osnovu informacija šta ona sadrži,\n");
      out.write("                    nakon probe,  promenili su svoj stav.</p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                        &raquo;</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle\"\n");
      out.write("                     src=\"");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\" alt=\"Frutti di mare\"width=\"140\" height=\"140\">\n");
      out.write("                <h2>Frutti di mare</h2>\n");
      out.write("                <p>Ako volite pizzu i obožavate morske plodove, ovo je prava pizza za Vas.</p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                        &raquo;</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("            <!-- Three columns of text below the carousel -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"img-circle\"\n");
      out.write("                         src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\" alt=\"PosnaPizza\"width=\"140\" height=\"140\">\n");
      out.write("\n");
      out.write("                    <h2>Posna pizza </h2>\n");
      out.write("                    <p>Dani posta više ne moraju biti i dani bez pizze.\n");
      out.write("                        Posna pica, sa svežim začinima, \n");
      out.write("                        neverovatnog ukusa će učiniti da zaboravite da je post u toku.</p>\n");
      out.write("                    <p>\n");
      out.write("                        <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                            &raquo;</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-4 -->\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"img-circle\"\n");
      out.write("                         src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\" alt=\"Valentine's Pizza\"width=\"140\" height=\"140\">\n");
      out.write("                    <h2>Valentine's Pizza</h2>\n");
      out.write("                    <p>Svakim zalogajem izjavite ljubav. </p>\n");
      out.write("                    <p>\n");
      out.write("                        <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                            &raquo;</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-4 -->\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img class=\"img-circle\"\n");
      out.write("                         src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\" alt=\"MMA Special Pizza\"width=\"140\" height=\"140\">\n");
      out.write("                    <h2>MMA Special Pizza</h2>\n");
      out.write("                    <p>MMA pizza je fantastični specijalitet kuće, koji ostavlja bez daha.</p>\n");
      out.write("                    <p>\n");
      out.write("                        <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details\n");
      out.write("                            &raquo;</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-4 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"page-footer font-small blue pt-4 mt-4\" style=\"background-color: #505256; opacity: 0.75; color: white\">\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("        <h5 class=\"text-uppercase\">MMA Piceriju mozete pratiti putem linkova: </h5>\n");
      out.write("\n");
      out.write("        <ul class=\"list-unstyled\">\n");
      out.write("\n");
      out.write("            <a href=\"https://www.facebook.com\" class=\"fa fa-facebook btn btn-rounded\"></a>\n");
      out.write("            <a href=\"https://www.twitter.com\"class=\"fa fa-twitter btn btn-rounded\"></a>\n");
      out.write("            <a href=\"https://www.instagram.com\"class=\"fa fa-instagram btn btn-rounded \"></a>\n");
      out.write("            <a href=\"https://www.youtube.com\" class=\"fa fa-youtube btn btn-rounded\"></a>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Call to action -->\n");
      out.write("    <ul class=\"list-unstyled list-inline text-center py-2\">\n");
      out.write("        <li class=\"list-inline-item\">\n");
      out.write("            <h5 class=\"mb-1\">Prijavite se besplatno</h5>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"list-inline-item\">\n");
      out.write("            <a href=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\" class=\"btn btn-info btn-rounded\">Prijava!</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- Call to action -->\n");
      out.write("    <hr>\n");
      out.write("    <div class=\"footer-copyright text-center py-3\" style=\"background-color: #222; color: whitesmoke;\">© 2018 MMA Picerija:\n");
      out.write("        <a href=\"");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("\"> MMAPicerija.com</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .fa {\n");
      out.write("        padding: 10px;\n");
      out.write("        font-size: 30px;\n");
      out.write("        width: 50px;\n");
      out.write("        text-align: center;\n");
      out.write("        text-decoration: none;\n");
      out.write("    }\n");
      out.write("    .fa-facebook {\n");
      out.write("        background: #3B5998;\n");
      out.write("        color: white;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-twitter {\n");
      out.write("        background: #55ACEE;\n");
      out.write("        color: white;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .fa-instagram {\n");
      out.write("        background: #125688;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    .fa-youtube {\n");
      out.write("        background: #bb0000;\n");
      out.write("        color: white;\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/css/landing.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/views/home.jsp");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/images/logo_pizzerija.PNG");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/views/home.jsp");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/views/oNama.jsp");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/views/kontakt.jsp");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/views/meni.jsp");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/views/login.jsp");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("/images/Capricciosa.jpg");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("/images/Margherita.jpg");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("/images/QuattroFormaggi.jpg");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("/images/Pepperoni.jpg");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("/images/Hawaii.jpg");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/images/FruttiDiMare.jpg");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("/images/PosnaPizza.jpg");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("/images/Valentine'sPizza.jpg");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("/images/mma_special.jpg");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("/views/login.jsp");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("/views/home.jsp");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }
}
