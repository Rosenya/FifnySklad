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
                            <h6 class="m-0 font-weight-bold text-primary">Zamówione Produkty</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table action-panel table-bordered" id="customerTable" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Numer zamówienia</th>
                                        <th>Nazwa produktu</th>
                                        <th>Cena</th>
                                        <th>Ilość</th>

                                    </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                        <th>Numer zamówienia</th>
                                        <th>Nazwa produktu</th>
                                        <th>Cena</th>
                                        <th>Ilość</th>
                                    </tr>
                                    </tfoot>

                                    <c:forEach items="${products}" var="title">
                                    <tr>
                                        <td>${title.SKU}</td>
                                        <td>${title.name}</td>
                                        <td>${title.price}</td>
                                        <td>${title.quantity}</td>
                                        <td><a href='<c:url value="/editProduct/${title.id}"/>'
                                               class="btn-right btn btn-primary" role="button">Edytuj</a>
                                        </td>
                                            <%--&lt;%&ndash;                            <td><a href='<c:url value="/editStudent/${title.id}"/>'&ndash;%&gt;--%>
                                            <%--                                   class="btn-right btn btn-primary" role="button">Edytuj zamównienie</a>--%>
                                            <%--                            </td>--%>
                                    </tr>


                                    <td>
                                    <button type="button" id="usun" class="btn btn-danger" data-toggle="modal" data-target="myModal">
                                        Usuń
                                    </button>
                                    </td>

                                    </td>
                                    </c:forEach>
                                </table>

                                <div class="modal" id="myModal">
                                    <div class="modal-dialog">
                                        <div class="modal-content">

                                            <!-- Modal Header -->
                                            <div class="modal-header">
                                                <h4 class="modal-title">Czy na pewno chcesz usunąć produkt ?</h4>
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            </div>

                                            <!-- Modal body -->
                                            <div class="modal-body">
                                                Jeżeli usuniesz to już nie będzie odwrotu
                                            </div>

                                            <!-- Modal footer -->
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-primary" data-dismiss="modal">Anuluj</button>
<%--                                                <form method="post" action='<c:url value="/zamowienieProduktow/${products.id}"/>'>--%>
                                                    <input type="submit" class="btn btn-danger pull-left" value="Tak"/>
                                                </form>
                                            </div>

                                        </div>
                                    </div>
                                </div>

<%--                                <button id="myBtn">Open Modal</button>--%>

                                <!-- The Modal -->
<%--                                <div id="myModal" class="modal">--%>

<%--                                    <!-- Modal content -->--%>
<%--                                    <div class="modal-content">--%>
<%--                                        <span class="close">&times;</span>--%>
<%--                                        <p>Some text in the Modal..</p>--%>
<%--                                    </div>--%>

<%--                                </div>--%>

                                <script>
                                    // Get the modal
                                    var modal = document.getElementById("myModal");

                                    // Get the button that opens the modal
                                    var btn = document.getElementById("usun");

                                    // Get the <span> element that closes the modal
                                    var span = document.getElementsByClassName("close")[0];

                                    // When the user clicks the button, open the modal
                                    btn.onclick = function() {
                                        modal.style.display = "block";
                                    }

                                    // When the user clicks on <span> (x), close the modal
                                    span.onclick = function() {
                                        modal.style.display = "none";
                                    }

                                    // When the user clicks anywhere outside of the modal, close it
                                    window.onclick = function(event) {
                                        if (event.target == modal) {
                                            modal.style.display = "none";
                                        }
                                    }
                                </script>



                                <div class="card-header py-3">

                                    <a href='<c:url value="/nowyProdukt"/>' class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
                                        <span class="text">Dodaj</span>
                                    </a>
                                </div>
                                </div>


        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
