<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Listing</title>
<link rel="stylesheet" type="text/css" href="/css/mystyle4.css">
</head>
<body>

<div class="new">
	<font size="+2"><b>Navigate:</b></font>&nbsp&nbsp&nbsp&nbsp
	<font size="+2"><a href="/welcome_page">Home</a></font>&nbsp&nbsp&nbsp&nbsp
	<font size="+2"><a href="/">Logout</a></font>
</div>

<br><br><br><br>
	<form:form name="searchproduct" method="POST"
		action="/searchbyproductname" modelAttribute="productpojo">
             <table align="center">
			<tr>
				<td><form:label path="product_name"><font size="+2"><b>Search by Product Name :</b></form:label><font></font></td>
				<td><form:input path="product_name" /></td>
			</tr>
		</table>
	<br><input  type="submit" class="button" value="Search Product">
        </form:form>


<br><br><br><br><br>
	<table align="center" id="products">
		        
		<tr>
			            
			<th>Product ID</th>             
			<th>Product Name</th>  
			<th>Product Expiry</th> 
			<th>Product Price</th> 
			<th>Operations</th>                          
		</tr>
		<c:forEach items="${productpojolist}" var="productpo">
        <tr>
				<td>${productpo.product_id}</td>             
				<td>${productpo.product_name}</td>
				<td>${productpo.product_exp}</td>              
			    <td>${productpo.product_price}</td>
				<td> <a href="/edit_prodlist?product_id=${productpo.product_id}">Edit</a>
					                &nbsp;&nbsp;&nbsp;                   
					 <a	href="/delete_products?product_id=${productpo.product_id}">Delete</a>             
				</td>         
			</tr>
        </c:forEach>
</body>
</html>