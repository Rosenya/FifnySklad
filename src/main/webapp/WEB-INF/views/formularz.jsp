<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

    <body>
        <!-- Responsive navbar-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href='<c:url value="/"/>'>Fifny Sklep</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href='<c:url value="/"/>'>Home</a></li>
                        <li class="nav-item"><a class="nav-link" href='<c:url value="/onas"/>'>O nas</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#!">Wszystkie produkty</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#!">Popularne</a></li>
                                <li><a class="dropdown-item" href="#!">Nowości</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <button class="btn btn-outline-dark" type="submit">
                            <i class="bi-cart-fill me-1"></i>
                            Cart
                            <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                        </button>
                    </form>
                </div>
            </div>
        </nav>
        <!-- Page content-->
        <div class="container">
            <div class="text-center mt-5">
                <h1>Realizacja zamówienia</h1>
                <form>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputEmail">Email</label>
                            <input type="email" class="form-control" id="inputEmail" placeholder="Podaj swój Email">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputName">Imię</label>
                            <input type="name" class="form-control" id="inputName" placeholder="Imię">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputsecondName">Nazwisko</label>
                            <input type="secondName" class="form-control" id="inputsecondName" placeholder="Nazwisko">
                        </div>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="inputAddress">Adres</label>
                        <input type="text" class="form-control" id="inputAddress" placeholder="Ulica">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="inputAddress2">Adres 2</label>
                        <input type="text" class="form-control" id="inputAddress2" placeholder="Numer mieszkania/Apartamentu/Budynku">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputCity">Miasto</label>
                            <input type="text" class="form-control" id="inputCity">
                        </div>

                        <div class="form-group col-md-2">
                            <label for="inputZip">Kod pocztowy</label>
                            <input type="text" class="form-control" id="inputZip">
                        </div>
                    </div>

                    <a href='<c:url value="/podsumowanie"/>' class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Przejdź dalej</a>

                </form>

            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
