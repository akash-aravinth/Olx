/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-06-13 07:35:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.akash.app.model.Product;
import com.akash.app.dao.ProductDao;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1715773725847L));
    _jspx_dependants.put("jar:file:/C:/Users/zsgs_w10_5/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.akash.app.dao.ProductDao");
    _jspx_imports_classes.add("com.akash.app.model.Product");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("           ");

               List<Product> pro = new ArrayList();
               ProductDao product = new ProductDao();
               if(session.getAttribute("userId") != null){
                 int userId = (int)session.getAttribute("userId");
                   pro = product.getProduct(userId);
               }else{
                   pro = product.getAllProduct();
               }
               request.setAttribute("List", pro);
           
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,100..900;1,100..900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto+Mono:ital,wght@0,100..700;1,100..700&display=swap');\r\n");
      out.write(".heading{\r\n");
      out.write("  font-family : Poppins;\r\n");
      out.write("  font-size : 20px;\r\n");
      out.write("  font-style : bold;\r\n");
      out.write("}\r\n");
      out.write(".textbox{\r\n");
      out.write("  display : flex;\r\n");
      out.write("  align-items:center;\r\n");
      out.write("  justify-content:space-between;\r\n");
      out.write("}\r\n");
      out.write(".name{\r\n");
      out.write("color:black;\r\n");
      out.write("     font-family : Roboto Mono;\r\n");
      out.write("     font-size : 17px;\r\n");
      out.write("     font-style : bold;\r\n");
      out.write("     margin : 5px 0px;\r\n");
      out.write("     text-align : center;\r\n");
      out.write("}\r\n");
      out.write(".linkre{\r\n");
      out.write("text-decoration : none;\r\n");
      out.write("list-style:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".price{\r\n");
      out.write("  color:black;\r\n");
      out.write("  font-family : Noto Sans;\r\n");
      out.write("  font-size : 25px;\r\n");
      out.write("  font-style : bold;\r\n");
      out.write("  margin : 5px 0px;\r\n");
      out.write("  text-align : center;\r\n");
      out.write("}\r\n");
      out.write(".recommended{\r\n");
      out.write("   padding : 0px 20px;\r\n");
      out.write("   display : block;\r\n");
      out.write("   align-items:center;\r\n");
      out.write("   justify-content:space-between;\r\n");
      out.write("}\r\n");
      out.write(".image{\r\n");
      out.write("  height : 200px;\r\n");
      out.write("  width : 200px;\r\n");
      out.write("  background-color : white;\r\n");
      out.write("}\r\n");
      out.write(".imagebox{\r\n");
      out.write("   display: flex;\r\n");
      out.write("   justify-content: center;\r\n");
      out.write("   align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".outerbox{\r\n");
      out.write("  margin : 20px 40px;\r\n");
      out.write("  display : flex;\r\n");
      out.write("  align-items : centre;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  flex-wrap : wrap;\r\n");
      out.write("}\r\n");
      out.write(".box{\r\n");
      out.write("  border: 1px solid #ddd;\r\n");
      out.write("  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  padding : 10px;\r\n");
      out.write("  display : block;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  width : 250px;\r\n");
      out.write("  height : 350px;\r\n");
      out.write("  flex : wrap-content;\r\n");
      out.write("  margin-bottom:50px;\r\n");
      out.write("}\r\n");
      out.write(".favourite{\r\n");
      out.write("        font-family : Mukta;\r\n");
      out.write("        border : 1.5px solid black;\r\n");
      out.write("        padding : 1px 10px;\r\n");
      out.write("        border-radius : 2px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".buynow{\r\n");
      out.write("             background-color:black;\r\n");
      out.write("             color:white;\r\n");
      out.write("             font-family : Mukta;\r\n");
      out.write("             border : 1.5px solid black;\r\n");
      out.write("             padding : 1px 10px;\r\n");
      out.write("             border-radius : 2px;\r\n");
      out.write("             text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".btns{\r\n");
      out.write("    margin : 20px;\r\n");
      out.write("    display : flex;\r\n");
      out.write("    flex-direction : row;\r\n");
      out.write("    align-items:center;\r\n");
      out.write("    justify-content:space-between;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class = \"recommended\">\r\n");
      out.write("       <p class = \"heading\">Recommended</p>\r\n");
      out.write("            <div class = \"outerbox\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /homepage.jsp(124,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/homepage.jsp(124,5) '${List}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${List}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /homepage.jsp(124,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("p");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        <div class = \"box\">\r\n");
            out.write("          <div class = \"imagebox\">\r\n");
            out.write("           <img src =\"./images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getImage()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt = \"image\" height = \"200px\" width = \"200px\" class = \"image\"/>\r\n");
            out.write("          </div class = \"textbox\">\r\n");
            out.write("           <p class = \"name\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</P>\r\n");
            out.write("           <p class = \"price\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</P>\r\n");
            out.write("           <div class = \"btns\">\r\n");
            out.write("             <a href='showproduct?product=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getProductid()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' class = \"favourite\">View Details</a>\r\n");
            out.write("             <a href = 'showproduct?product=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getProductid()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' class = \"buynow\">Buy Now</a>\r\n");
            out.write("           </div>\r\n");
            out.write("        </div>\r\n");
            out.write("     ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
