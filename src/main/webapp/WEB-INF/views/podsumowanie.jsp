<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

    <body>
        <!-- Navigation-->
       <%@include file="dynamic/navigationMain.jspf" %>
        <!-- Page content-->
        <div class="container">
            <div class="text-center mt-5">
                <h1>Podsumowanie</h1>
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

                    <button type="submit" class="btn btn-primary">Przejdź dalej</button>
                </form>

            </div>
        </div>
        <%@include file="dynamic/board.jspf"%>
        <%@include file="dynamic/javaScript.jspf"%>

    </body>
</html>
