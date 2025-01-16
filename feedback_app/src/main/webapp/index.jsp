<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="comp/links.jsp"%>
  </head>
  <body>
  	<%@include file="header.jsp"%>
  		<div style="height:vh " class="content_container py-4 d-flex flex-clumn justify-content-center align-item-center  ">
  			<a  href="<%=application.getContextPath()%>/feedback.jsp" class="btn nt-5 btn-light">Give Feedback </a>
  			<a href="<%=application.getContextPath()%>/servlet1" class="btn nt-5 btn-light">Go to Servlet 1 </a>
  		  	<a href="<%=application.getContextPath()%>/servlet2" class="btn btn-light">Go to Servlet 2 </a>
  		
  		</div>
    <%@include file="scripts.jsp"%>
  </body>
</html>