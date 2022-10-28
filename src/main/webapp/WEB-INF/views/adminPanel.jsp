<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

    <body>
        <!-- Navigation-->
        <%@include file="dynamic/navigationMain.jspf" %>
         <!-- Page content-->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h1 class="m-0 font-weight-bold text-primary">Edycja</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table action-panel table-bordered" id="customerTable" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Nazwa</th>
                                    <th>Kategoria</th>
                                    <th>Cena</th>
                                    <th>Indeks</th>
                                    <th>Obraz</th>
                                    <th>Opis</th>
                                </tr>
                                </thead>
                                <tfoot>

                                </tfoot>
                                <tbody>

                                <c:forEach items="${Product}" var="title">
                                <tr>
                                    <td>${title.name}</td>
                                    <td>${title.categories}</td>
                                    <td>${title.prize}</td>
                                    <td>${title.index}</td>
                                    <td>${title.photo}</td>
                                    <td>${title.description}</td>
                                    <td><a href='<c:url value="/editProduct/${title.id}"/>'
                                           class="btn-right btn btn-primary" role="button">Edytuj</a>
                                    </td>
        <%--&lt;%&ndash;                            <td><a href='<c:url value="/editProduct/${title.id}"/>'&ndash;%&gt;--%>
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

        <!-- Footer-->
        <%@include file="dynamic/board.jspf"%>
        <%@include file="dynamic/javaScript.jspf"%>

    </body>
</html>
