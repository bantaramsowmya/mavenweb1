<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="sptags"%>
<%@ include file="adminheader.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Horizontal form</h2>
		<sptags:form class="form-horizontal" action="addProduct" method="post"
			commandName="pro" enctype="multipart/form-data">
			<div class="form-group">
				<label class="control-label col-sm-2" for="productName">productName:</label>
				<div class="col-sm-10">
					<sptags:input path="productName" class="form-control"
						placeholder="Enter productName" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="productCategory">productCategory:</label>
				<div class="col-sm-10">




					<sptags:select path="productCategory" class="form-control">
						<jscore:forEach items="${categoryInfo}" var="c">
							<option value="${c.categoryName}">${c.categoryName}</option>

						</jscore:forEach>
					</sptags:select>

				</div>

			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="productPrice">productPrice:</label>
				<div class="col-sm-10">
					<sptags:input path="productPrice" class="form-control"
						placeholder="Enter productPrice" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="productDescription">productDescription:</label>
				<div class="col-sm-10">
					<sptags:input path="productDescription" class="form-control"
						placeholder="Enter productDescription" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="productSupplierName">productSupplierName:</label>
				<div class="col-sm-10">
					<sptags:select path="productSupplierName" class="form-control">
						<jscore:forEach items="${supplierInfo}" var="sup">
							<option value="${sup.supplierName }">${sup.supplierName }</option>

						</jscore:forEach>
					</sptags:select>

					
				</div>
			</div>
			<sptags:input type="file" path="productImg" />
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">saveProduct</button>
				</div>
			</div>
		</sptags:form>
	</div>

	<div class="container">

		<table class="table table-bordered table-sm">
			<thead class="thead-dark">
				<tr>
					<th>productId</th>
					<th>productName</th>
					<th>productPrice</th>
					<th>productDescription</th>
					<th>productCategory</th>
					<th>productSupplierName</th>
					<th>image</th>
					<th>Edit</th>
					<th>Delete</th>

				</tr>
			</thead>
			<tbody>
				<jscore:forEach items="${productInfo }" var="p">
					<tr class="table-primary">

						<td>${p.productId }</td>
						<td>${p.productName }</td>
						<td>${p.productPrice }</td>
						<td>${p.productDescription }</td>
						<td>${p.productCategory }</td>
						<td>${p.productSupplierName }</td>
						<td><img src="resources/${p.productId }.jpg" alt="abc"
							style="width: 100px; height: 100px;"></td>
	<td><a href="editpro?proid=${p.productId }">edit</a></td>
	<td><a href="deletepro?proid=${p.productId}">delete</a></td>
	</tr>
	</jscore:forEach>
	</tbody>
	</table>
	</div>



</body>
</html>
