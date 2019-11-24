package org.apache.jsp.Files.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.database.conn.*;

public final class Votingprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>VOTING PROCESS</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  \twindow.history.forward();\r\n");
      out.write("   \tfunction noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("function Reset(vote)\r\n");
      out.write("{\r\n");
      out.write("\tif(confirm('You Vote For '+vote+' Press ok to Confirm'))\r\n");
      out.write("  \t\treturn true;\r\n");
      out.write("  \telse \r\n");
      out.write("  \t\treturn false;\t\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/bg.jpg\">\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/logo-3.png\"><br>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String booth_no=request.getParameter("booth_no");
	String b_location=request.getParameter("b_location");
	String voter_id=(String)request.getSession().getAttribute("voter_id");
	System.out.println("jsp_booth_no="+booth_no);
	System.out.println("jsp_location="+b_location);
	System.out.println("jsp_vote_id="+voter_id);

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<div style=\"background-image: url(");
      out.print(request.getContextPath());
      out.write("/Files/Images/voting/voteboard.png);\r\n");
      out.write("\t\t\twidth:550px;\r\n");
      out.write("\t\t\theight:500px; \r\n");
      out.write("\t\t\twidth:550;\r\n");
      out.write("\t\t\theight:500;\">\r\n");
      out.write("<br>\t\t\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/VoteCount\" method=\"get\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"b_no\" value=\"");
      out.print(booth_no);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"b_loc\" value=\"");
      out.print(b_location);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"voter_id\" value=\"");
      out.print(voter_id);
      out.write("\">\r\n");
      out.write("\t<table style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t\t<tr style=\"background-color:black;color:white;\">\r\n");
      out.write("\t\t\t<td colspan=\"20\" align=\"center\" >CANDIDATES</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height=\"10\"></tr>\r\n");
      out.write("\t\t<tr style=\"background-color:lightblue;color:black;\">\r\n");
      out.write("\t\t\t<td width=\"150\" align=\"center\">SYMBOL</td>\r\n");
      out.write("\t\t\t<td width=\"200\" align=\"center\">CANDIDATE NAME</td>\r\n");
      out.write("\t\t\t<td width=\"150\" align=\"center\">SELECT</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height=\"10\"></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
		ResultSet rs=Methods.selectcandidate(b_location);

		
		
		while(rs.next())
		{ 
			HttpSession session2=request.getSession(true);
			String c_code=rs.getString(3);
			System.out.println("  vb :"+c_code);
			
			session2.setAttribute("vote_code",c_code);
			
			
			
			System.out.println("=======rs.getString(1)==============:"+rs.getString(1));
			System.out.println("=======rs.getString(2)==============:"+rs.getString(2));
			System.out.println("=======rs.getString(3)==============:"+rs.getString(3));
			
			
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><img src=\"/E_onlinevote/Files/images/Candidates/Symbol/");
      out.print(rs.getString(1));
      out.write("\" height=\"60\" width=\"60\"></td>\r\n");
      out.write("\t\t\t<td align=\"center\">");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("   \t   \t\t \t<input type=\"radio\" id=\"");
      out.print(rs.getString(2));
      out.write("\" name=\"vote_can\" value=\"");
      out.print(rs.getString(3));
      out.write("\"><br>\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
 		}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td><input type=\"submit\" value=\"Submit\"></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\t\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
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
