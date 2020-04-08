<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle5.css">
<script src="/js/myscript2.js"></script>

<meta charset="ISO-8859-1">
<title>Product From</title>
</head>
<body>
<font size="+3"><h2 style="text-align:center">Product Form</h2></font> 
		
		<br>
		<div style="text-align:center">
		<font size="+2"><a href="/welcome_page">Home</a></font> &nbsp&nbsp&nbsp&nbsp
		<font size="+2"><a href="/">Logout</a></font> &nbsp&nbsp&nbsp&nbsp
		<font size="+2"><a href="/list_product">List Product</a></font> 
		</div>
<br><br>
	<div class="form">
		<form:form name="productForm" method="POST" 
			action="/register_product" modelAttribute="productpojo" onSubmit="return myFunction2()">
             <table id="tab">
				<tr>
					<td><form:label path="product_id">Product Id</form:label></td>
					<td><form:input path="product_id" /></td>
					
				</tr>
				<tr>
					<td><form:label path="product_name"  id="product_name" name="product_name" >Product Name</form:label></td>
					<td><form:input path="product_name" placeholder="Product name"/></td>
				</tr>
				<tr>
					<td><form:label path="product_exp" id="product_exp" name="product_exp" >Product Expiry</form:label></td>
					<td><form:input path="product_exp" placeholder="dd-mm-yyyy"/></td>
				</tr>
				<tr>
				<td><form:label path="product_price" id="product_price" name="product_price" >Product price</form:label></td>
				<td><form:input path="product_price" placeholder="Product price"/></td>
			</tr>
			</table>
		<input  type="submit" class="button" value="Add Product">
        </form:form>
		</div>
	


</body>
</html>