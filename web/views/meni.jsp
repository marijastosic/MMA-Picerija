<%@page import="dao.PicaDAOImpl"%>
<%@page import="dao.PicaDAO"%>
<%@page import="dao.GenericDAOImpl"%>
<%@page import="dao.GenericDAO"%>
<%@page import="entities.Pica"%>
<%@page import="java.util.List"%>
<%@include file="template/header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div>
<div class="container marketing">

    <div>

        <%
            PicaDAO dao = new PicaDAOImpl();
//            List<Pica> lista = dao.readAll(Pica.class);
            List<Pica> lista = dao.readAllAktivPica();
            for (int i = 0; i < lista.size(); i++) {
                Pica p = lista.get(i);

        %>
        <%if ((i + 3) % 3 == 0) {%>
        <div class="row">
            <% }%>

            <div class="col-lg-4">
                <img class="img-circle" width="140" height="140" src="<%out.print(p.getSlikaUrl());%>"/>
                <h2><% out.print(p.getNaziv()); %></h2>
                <p><% out.print(p.getOpis()); %></p>
                <p>
                    <a class="btn btn-default" href="<c:url value="/views/detalji.jsp"/>" role="button">Vidi detalje&raquo;</a>
                    
                </p>
            </div>
            <%if ((i + 1) % 3 == 0) {%>
        </div>
        <% }%>

        <%}%>


    </div>
</div>
</div>
<%@include file="template/footer.jsp"%>
