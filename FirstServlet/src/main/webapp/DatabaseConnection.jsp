
<%@ page import ="java.sql.*"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

	
Class.forName("com.mysql.jdbc.Driver");


Connection con = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/practice_db", 
	    "root", "Shiva@123"
	);

if (con != null)
	System.out.println("Connection Successful!");
else
	System.out.println("Failed");

// 3. create statement
Statement st = con.createStatement();
String query = "select * from employees where department = 'IT' AND salary < 60000";		//4. Execute and Processing results
ResultSet rs = st.executeQuery(query);
rs.next();



%>
data : <%= rs.getString(2) %>

</body>
</html>