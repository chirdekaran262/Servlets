<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Demo</title>
    <%@include file="comp/links.jsp"%>
  </head>
  <body>
    <%@include file="header.jsp"%>
    <div class="container py-4">
      <div class="content_container d-flex flex-column justify-content-center align-items-center">
        <h3 class="text-white">Fill the Feedback Form:</h3>

        <form  action="<%=application.getContextPath() %>/feedback" method="post" class="mt-3 text-white">
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input 
              placeholder="Enter email" 
              name="email" 
              type="email" 
              class="form-control" 
              id="exampleInputEmail1" 
              aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text text-white">
              We'll never share your email with anyone else.
            </div>
          </div>
          <div class="mb-3">
            <label for="phoneInput" class="form-label">Phone No.</label>
            <input 
              name="phone"
              placeholder="Enter here" 
              type="text" 
              class="form-control" 
              id="phoneInput">
          </div>
          <div class="mb-3">
            <label for="feedbackMessage" class="form-label">Your Feedback Message:</label>
            <textarea name="feedback_message"
              rows="10" 
              placeholder="Enter here" 
              class="form-control" 
              id="feedbackMessage"></textarea>
          </div>
          <div class="container text-center">
            <button type="submit" class="btn btn-warning">Submit</button>
            <button type="reset" class="btn btn-light">Reset</button>
          </div>
        </form>
      </div>
    </div>
    <%@include file="scripts.jsp"%>
  </body>
</html>
