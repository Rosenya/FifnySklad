<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pl">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Bare - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="/resources/productorders/css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Responsive navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Fifny Skład</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Link</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Dropdown</a>
                            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Page content-->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Lista klientów</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table action-panel table-bordered" id="customerTable" cellspacing="0">
                        <thead>
                        <tr>
                            <th>Imię</th>
                            <th>Nazwisko</th>
                            <th>Email</th>
                            <th>Adres</th>
                            <th>Telefon</th>
                            <th>Edycja</th>

                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Imię</th>
                            <th>Nazwisko</th>
                            <th>Email</th>
                            <th>Adres</th>
                            <th>Telefon</th>
                            <th>Edycja</th>

                        </tr>
                        </tfoot>
                        <tbody>

                        <c:forEach items="${Klient}" var="title">
                        <tr>
                            <td>${title.firstname}</td>
                            <td>${title.secondName}</td>
                            <td>${title.email}</td>
                            <td>${title.adress}</td>
                            <td>${title.phoneNumber}</td>
                            <td><a href='<c:url value="/editClient/${title.id}"/>'
                                   class="btn-right btn btn-primary" role="button">Edytuj</a>
                            </td>
<%--&lt;%&ndash;                            <td><a href='<c:url value="/editStudent/${title.id}"/>'&ndash;%&gt;--%>
<%--                                   class="btn-right btn btn-primary" role="button">Edytuj zamównienie</a>--%>
<%--                            </td>--%>
                        </tr>

                        </c:forEach>
                        </table>



                    <div class="card-header py-3">

                        <a href='<c:url value="/formularz"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
                            <span class="text">Dodaj</span>
                        </a>

                    </div>


        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
