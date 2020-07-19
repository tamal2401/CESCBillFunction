<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
<div class="container">
<h3 style="color:yellow">Dear ${obj.name }</h3>
<p style="color:Green">You have to  Pay total ${obj.totalBillPaid } as per the BillDetails </p>
<p style="color:purple"> If Metre Reading was taken every month then You would need to Pay total ${obj.expectedBillAmount }
<p style="color:Red"> So You are paying extra ${ obj.totalBillPaid - obj.expectedBillAmount} for the lockdown as per the current bill status
</div>
</body>
</html>