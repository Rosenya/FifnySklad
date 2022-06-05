<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

<%@ page contentType="text/html; charset=UTF-8" %>
 <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href='<c:url value="/index"/>'>fiFNY skład</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href='<c:url value="/index"/>'>Strona Główna</a></li>
                        <li class="nav-item"><a class="nav-link" href='<c:url value="/onas"/>'>O nas</a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Produkty</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="http://localhost:8080/products/">Wszystkie produkty</a></li>
                                <li><hr class="dropdown-divider" /></li>
                                <li><a class="dropdown-item" href="#!">Popularne</a></li>
                                <li><a class="dropdown-item" href="#!">Nowości</a></li>
                            </ul>
                        </li>
                    </ul>
                  <%@include file="dynamic/cart.jspf"%>
                </div>
            </div>
        </nav>
        <!-- Footer-->
        <%@include file="dynamic/board.jspf"%>
        <%@include file="dynamic/javaScript.jspf"%>

    </body>
</html>
