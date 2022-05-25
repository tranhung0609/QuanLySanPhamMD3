<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 5/24/2022
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProducer()}</td>
            <td></td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
