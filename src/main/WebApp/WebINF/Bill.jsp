<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Calculation Portal</title>
</head>
<body style="background-color:lightgreen">
<div class="container">
<div class="col-md-12">
<h2 style="background-color:dodgerblue"> Please Enter the following details </h2>
<form action="billCalculate">

<div class="form-group">
<label for= "name" >Name </label>
<input type="text" class="form-control" name="name"> <br>
</div>

<div class="form-group">
<label for= "preReading" >Meter Reading for Feb Bill </label>
<input type="number" class="form-control" name="preReading"> <br>
</div>

<div class="form-group">
<label for= "postReading" >Meter Reading for June Bill </label>
<input type="number" class="form-control" name="postReading"> <br>
</div>

<div class="form-group">
<label for= "amountMar" >March Bill Amount </label>
<input type="number" class="form-control" name="amountMar"> <br>
</div>

<div class="form-group">
<label for= "amountApr" >April Bill Amount </label>
<input type="number" class="form-control" name="amountApr"> <br>
</div>

<div class="form-group">
<label for= "amountMay" >May Bill Amount </label>
<input type="number" class="form-control" name="amountMay"> <br>
</div>

<div class="form-group">
<label for= "amountJune" >June Bill Amount </label>
<input type="number" class="form-control" name="amountJune"> <br>
</div>

<button type= "submit" class="btn btn-primary">Submit</button> <br>
</form>
</div>
</div>

</body>
</html>