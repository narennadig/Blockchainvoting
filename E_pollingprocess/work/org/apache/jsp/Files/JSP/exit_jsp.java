package org.apache.jsp.Files.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>ENTER PASSWORD</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  \twindow.history.forward();\r\n");
      out.write("   \tfunction noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<link rel=\"Stylesheet\" type=\"text/css\" href=\"home.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/bg.jpg\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<br><br><br>\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/logo-3.png\"><br>\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/Exit\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("<div style=\"background-image: url(");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/tashboard.png);\r\n");
      out.write("\t\t\twidth:400px;\r\n");
      out.write("\t\t\theight:300px;\r\n");
      out.write("\t\t\twidth:400;\r\n");
      out.write("\t\t\theight:300;\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/manager.png\" height=\"100\" width=\"100\">\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String booth_code=request.getParameter("booth_code");
	System.out.println("booth_code on exit JSP ="+booth_code);

      out.write("\r\n");
      out.write("<table style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><b>PASSWORD</b></td>\r\n");
      out.write("\t\t<td><input type=\"hidden\" name=\"b_no\" value=\"");
      out.print(booth_code);
      out.write("\">&emsp;&emsp;</td>\r\n");
      out.write("\t\t<td><input type=\"password\" name=\"pwd\" requried=\"requried\" ></input></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
	String status=null;
	status=(String)request.getAttribute("Status");			
	if(status==null)
	{
      out.write("\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t");
}
	else
{
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<font style=\"font-family:cambria; font-weight:bold; color:red;\">\r\n");
      out.write("\t");
      out.print(status);
      out.write("<br><br>\r\n");
      out.write("</font>\r\n");
}
      out.write("\t\r\n");
      out.write("<input type=\"image\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter.png\"\r\n");
      out.write("\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter-click.png'\"\r\n");
      out.write(" \t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter.png'\">\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \t\t\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/cancel.png\"\r\n");
      out.write("\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/cancel-click.png'\"\t\t\r\n");
      out.write("\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/cancel.png'\"></a>\r\n");
      out.write("</div>\t \t\r\n");
      out.write("</center>\r\n");
      out.write("</form>\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
