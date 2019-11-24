package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Voters_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/bg.jpg\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/logo-3.png\"><br>\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table style=\"margin: 100px\" border=\"1\" bordercolor=\"orange\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>V_code</td>\r\n");
      out.write("<td>V_id_no</td>\r\n");
      out.write("<td>V_name</td>\r\n");
      out.write("<td>V_address</td>\r\n");
      out.write("<td>V_sex</td>\r\n");
      out.write("<td>V_age</td>\r\n");
      out.write("<td>B_code</td>\r\n");
      out.write("<td>V_image</td>\r\n");
      out.write("<td>V_position</td>\r\n");
      out.write("<td>V_Vote_status</td>\r\n");
      out.write("<!-- <td><center> Action</center></td> -->\r\n");
      out.write("\r\n");
      out.write("</tr>");
 
        String vid = request.getParameter("voter_id");
        System.out.println("=======vid===============vidvid=============vid===================" + vid);
        
try
{
	String id = request.getParameter("id");
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("table came inside");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election_polling","root","admin");
	System.out.println("table con"+con);
	
	Statement st= con.createStatement();
	System.out.println("table stmt"+st);
	
	String sql="select * from m_voters  where V_id_no='"+vid+"'";
	System.out.println("table go inside sql"+sql); 
	ResultSet rs=st.executeQuery(sql);	
	
	System.out.println("table rs"+rs);
	
	while(rs.next())
	{	
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_code") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_id_no") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_name") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_address") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_sex") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_age") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("B_code") );
      out.write("</td>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<td><center><img src=\"/E_onlinevote/Files/images/voters/");
      out.print(rs.getString(8));
      out.write("\" height=\"30\" width=\"30\"></center></td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_position") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("V_Vote_status") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
	
}
	
	con.close();
	System.out.println("con"+con);
}

catch (Exception e) {
e.printStackTrace();
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/Voterlogin\" method=\"post\">\r\n");

	String booth_no=request.getParameter("booth_no");
	String b_location=request.getParameter("b_location");
	String b_ref_no=request.getParameter("b_ref_no");
	System.out.println("booth no="+booth_no);
	System.out.println("Refference no="+b_ref_no);
	System.out.println("location="+b_location);
	if(booth_no==null)
	{
		HttpSession pol=request.getSession(true);
		booth_no=(String)pol.getAttribute("booth_no");
		b_location=(String)pol.getAttribute("b_location");
		b_ref_no=(String)pol.getAttribute("b_ref_no");
	}
	request.getSession().setAttribute("booth_no",booth_no);
	request.getSession().setAttribute("b_location",b_location);
	request.getSession().setAttribute("b_ref_no",b_ref_no);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<div style=\"background-image: url(Files/Images/index/tashboard.png);\r\n");
      out.write("\t\t\twidth:400px;\r\n");
      out.write("\t\t\theight:300px;\r\n");
      out.write("\t\t\twidth:400;\r\n");
      out.write("\t\t\theight:300;\">\r\n");
      out.write("<br>\r\n");
      out.write("<font style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("BOOTH : ");
      out.print(b_ref_no);
      out.write("&emsp;\r\n");
      out.write("LOCATION : ");
      out.print(b_location);
      out.write("<br><br>\t\t\r\n");
      out.write("<img src=\"");
request.getContextPath();
      out.write("Files/Images/index/user.png\" height=\"100\" width=\"100\">\r\n");
      out.write("</font>\r\n");
      out.write("<br><br>\r\n");
      out.write("<table style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><b>VOTER ID</b></td>\r\n");
      out.write("\t\t<td>&emsp;:&emsp;</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"voter_id\" value=\"");
      out.print( vid );
      out.write("\" readonly=\"readonly\" ></input></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table><br>\r\n");
      out.write("<input type=\"image\" name=\"image\" value=\"");
      out.print(booth_no);
      out.write("\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter.png\"\r\n");
      out.write("\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter-click.png'\"\r\n");
      out.write(" \t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/Images/index/enter.png'\">\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
	String status=null;
	status=(String)request.getAttribute("Status");			
	if(status==null)
	{
		
	}
	else
{
      out.write("\r\n");
      out.write("<font style=\"font-family:cambria; font-weight:bold; color:red;\">\r\n");
      out.write("\t");
      out.print(status);
      out.write("\r\n");
      out.write("</font>\r\n");
}
      out.write("\t\r\n");
      out.write("\r\n");
	String Encry=null;
Encry=(String)request.getAttribute("Encry");		
String A_Encry=(String)request.getAttribute("A_Encry");	
String D_Encry=(String)request.getAttribute("D_Encry");	
	if(Encry==null)
	{
		
	}
	else
{
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\talert(\" BEFORE VOTING :");
      out.print(Encry);
      out.write("                              AFTER VOTING :");
      out.print(A_Encry);
      out.write("                                    AFTER ADDING:");
      out.print(D_Encry);
      out.write("\");\r\n");
      out.write("</script>\r\n");
}Encry=null;
      out.write("\r\n");
      out.write("\t\t \t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<font style=\"font-family:cambria; font-weight:bold; color:red;\">\r\n");
      out.write("\t<br><br><br><br><br>\t\r\n");
      out.write("\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/exit.jsp?booth_code=");
      out.print(booth_no);
      out.write("\"><u>EXIT</u></a>\r\n");
      out.write("\t</font>\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
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
