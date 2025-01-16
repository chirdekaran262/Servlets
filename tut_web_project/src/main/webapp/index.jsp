<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Welcome</title>
    <link rel="stylesheet" href="<%=application.getContextPath() %>/css/style.css">
</head>
<body>
	<div class="container">
	<%@include file="menu.jsp" %>
   
        <h1>Welcome to Your Website</h1>
    
        <p>This is your main content area.</p>
        <form action="<%=application.getContextPath() %>/third" method="post">
        	<input name="massage" type="text" placeholder="Enter text here"/>
        	<button type="submit">Submit</button>
        </form>
    
</div>
<script src="<%=application.getContextPath() %>/js/script.js"></script>
</body>
</html>
