<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  .highlight { 
  	background:red;
  }
 </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>
<title>Welcome</title>
</head>

<script>

$(document).ready(function(){
	  $("#sub").click(function(){
	    alert("Submitted"+$('#hour').val());
	    if(!isNaN($('#hour').val())){
	    	return true;
	    } else {
	    	$('#hour').addClass('highlight');
	    	return false;
	    }
	    
	  });
});

</script>

<body>
<h1>Welcome!!!!</h1>
<form id="welcome" action="add">
<div id="details">
		Name: <input id="name" type="text" name="name"> 
		Desc: <input type="text" name="desc"> 
		Hour: <input id = "hour"type="text" name="hour"> <input id= "sub"type="submit" value="Submit">
		</div>
	</form>

</body>
</html>