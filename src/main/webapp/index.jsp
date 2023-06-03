<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
          crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
  <h1 style="text-align: center">List Students</h1>
  <div class="row">
    <div class="col-lg-2">
      <a class="btn btn-primary" style="text-decoration: none; color: white" href="/students?action=create">Create
        new student</a>
    </div>
    <div class="col-lg-7">
      <a class="btn btn-primary" style="text-decoration: none; color: white" href="/classes">Home Classes</a>
    </div>
    <div class="col-lg-3">
      <form action="/students?action=search" method="post">
        <input type="text" name="search">
        <button class="btn btn-info" type="submit">Search</button>
      </form>
    </div>
  </div>
</div>
</body>
</html>