<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>

    <body>
        <!-- Navigation-->
        <%@include file="dynamic/navigationMain.jspf" %>
        <!-- Header-->
        <header class="bg-fifny py-5">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-fifny">
                    <h1 class="display-4 fw-bolder">O NAS</h1>
                    <p class="lead fw-normal text-fifny-50 mb-0" text-align: center;>Cześć Witamy Cię na naszym profilu.
                    FiFNY skład to my, Kasia i Agata - dwie kreatywne fiFNE dziewczyny, które tworzą dla Was pudełka
                    pełne dobroci Jest namniezmiernie miło, że jesteś tu z nami. Jeśli chcesz sprawić prezent sobie lub
                     komuś zachęcamy do złożenia zamówienia
                     </br>Ściskamy ciepło
                     </br>K&A</p>
                </div>
                </br>
                <div>
                </div>
            </div>
        </header>
        <!-- Footer-->
        <%@include file="dynamic/board.jspf"%>
        <%@include file="dynamic/javaScript.jspf"%>

    </body>
</html>
