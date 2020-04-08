<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit product details</title>
<link rel="stylesheet" type="text/css" href="/css/mystyle6.css">
<script src="/js/myscript2.js"></script>
 
</head>
<body>

<font size="+3"><h2 style="text-align:center">Edit Product Detail Form</h2></font>
<div class="form">
	<form:form name="productForm" method="POST" action="/edit_product_details" 
		modelAttribute="productpojo" onSubmit="return myFunction2()">
              <table id="tab">
			<tr>
				<td><form:label path="product_id">Product Id</form:label></td>
                <form:hidden path="product_id"/>
				<td> ${productpojo.product_id} </td>
			</tr>

			<tr>
				<td><form:label path="product_name" id="product_name" name="product_name" >Product Name</form:label></td>
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
		<br><br><input  type="submit" class="button" value="Edit Product">
	<!--  <input  type="submit" value="Edit Product" />-->
        </form:form>
</div>

</body>
</html>