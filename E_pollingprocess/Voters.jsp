<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="<%=request.getContextPath()%>/Files/Images/index/bg.jpg">

<div id="header">
	<br><br>
	<center>
		<br><br>
		<img src="<%=request.getContextPath()%>/Files/Images/index/logo-3.png"><br>
		<br><br><br><br>
	</center>																	
</div>

<center>


<table style="margin: 100px" border="1" bordercolor="orange">

<tr>
<td>V_code</td>
<td>V_id_no</td>
<td>V_name</td>
<td>V_address</td>
<td>V_sex</td>
<td>V_age</td>
<td>B_code</td>
<td>V_image</td>
<td>V_position</td>
<td>V_Vote_status</td>
<!-- <td><center> Action</center></td> -->

</tr><% 
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
		%>
		
	<tr>
	<td><%=rs.getString("V_code") %></td>
	<td><%=rs.getString("V_id_no") %></td>
	<td><%=rs.getString("V_name") %></td>
	<td><%=rs.getString("V_address") %></td>
	<td><%=rs.getString("V_sex") %></td>
	<td><%=rs.getString("V_age") %></td>
	<td><%=rs.getString("B_code") %></td>
	<%-- <td><%=rs.getString("V_image") %></td> --%>
	<td><center><img src="/E_onlinevote/Files/images/voters/<%=rs.getString(8)%>" height="30" width="30"></center></td>
	<td><%=rs.getString("V_position") %></td>
	<td><%=rs.getString("V_Vote_status") %></td>
	</tr>
	<%	
}
	
	con.close();
	System.out.println("con"+con);
}

catch (Exception e) {
e.printStackTrace();
}
%>



</table>
</center>


<form action="<%=request.getContextPath()%>/Voterlogin" method="post">
<%
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
%>

<center>
<div style="background-image: url(Files/Images/index/tashboard.png);
			width:400px;
			height:300px;
			width:400;
			height:300;">
<br>
<font style="font-family: cambria; font-weight: bold;">
BOOTH : <%=b_ref_no%>&emsp;
LOCATION : <%=b_location%><br><br>		
<img src="<%request.getContextPath();%>Files/Images/index/user.png" height="100" width="100">
</font>
<br><br>
<table style="font-family: cambria; font-weight: bold;">
	<tr>
		<td><b>VOTER ID</b></td>
		<td>&emsp;:&emsp;</td>
		<td><input type="text" name="voter_id" value="<%= vid %>" readonly="readonly" ></input></td>
	</tr>
</table><br>
<input type="image" name="image" value="<%=booth_no%>" src="<%=request.getContextPath()%>/Files/Images/index/enter.png"
		onmouseover="this.src='<%=request.getContextPath()%>/Files/Images/index/enter-click.png'"
 		onmouseout="this.src='<%=request.getContextPath()%>/Files/Images/index/enter.png'">
<br>

<%-- JAVA CODE FOR ALERT MESSAGE --%>

<%-- CHECK VOTER ID --%>

<%	String status=null;
	status=(String)request.getAttribute("Status");			
	if(status==null)
	{
		
	}
	else
{%>
<font style="font-family:cambria; font-weight:bold; color:red;">
	<%=status%>
</font>
<%}%>	

<%	String Encry=null;
Encry=(String)request.getAttribute("Encry");		
String A_Encry=(String)request.getAttribute("A_Encry");	
String D_Encry=(String)request.getAttribute("D_Encry");	
	if(Encry==null)
	{
		
	}
	else
{%>
<script type="text/javascript">
	alert(" BEFORE VOTING :<%=Encry%>                              AFTER VOTING :<%=A_Encry%>                                    AFTER ADDING:<%=D_Encry%>");
</script>
<%}Encry=null;%>
		 			
</div>
<font style="font-family:cambria; font-weight:bold; color:red;">
	<br><br><br><br><br>	
	<a href="<%=request.getContextPath()%>/Files/JSP/exit.jsp?booth_code=<%=booth_no%>"><u>EXIT</u></a>
	</font>
</center>
</form>
</body>
</html>