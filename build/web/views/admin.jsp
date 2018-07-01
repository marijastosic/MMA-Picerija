<%-- 
    Document   : index
    Created on : Jun 12, 2018, 1:02:16 PM
    Author     : Marija
--%>
<%@include file="template/header.jsp"%>
<%@page import="dao.PicaDAOImpl"%>
<%@page import="dao.PicaDAO"%>
<%@page import="entities.Pica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Picerija</title>
        <link rel="stylesheet" href="../css/style.css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
    <center>
        <h1 class="naslov">MMA Picerija</h1>
        <% PicaDAO dao = new PicaDAOImpl();
            if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("action").equalsIgnoreCase("sacuvaj")) {
                Pica p = new Pica();
                if (request.getParameter("id") != null) {
                    p.setId(Integer.parseInt(request.getParameter("id")));
                }
                p.setNaziv(request.getParameter("naziv"));
                p.setOpis(request.getParameter("opis"));
                p.setSastojci(request.getParameter("sastojci"));
                p.setCena(Double.parseDouble(request.getParameter("cena")));
                p.setTezina(Double.parseDouble(request.getParameter("tezina")));
                p.setOcena(Double.parseDouble(request.getParameter("ocena")));
                p.setAktivna(Boolean.getBoolean(request.getParameter("aktivna")));
                
                dao.saveOrUpdate(p);
            } else if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("action").equalsIgnoreCase("obrisi")) {
                dao.deletePicaByID(Integer.parseInt(request.getParameter("id").trim()));
            }
        %>

        <%
            if (request.getMethod().equalsIgnoreCase("POST") && request.getParameter("action").equalsIgnoreCase("izmeni")) {
        %>
        <!--        popunjavanje forme za izmeni-->
        
        <form action="admin.jsp?action=sacuvaj"method="post"style="width: 20%" >
            <input type="hidden" name="id" value="<% out.print(request.getParameter("id"));%>" /><br/><br/>
            <div class="form-group">
                <input type="text" name="naziv" value="<% out.print(request.getParameter("naziv"));%>"required class="form-control"/><br/><br/>
            </div>
            
            <div class="form-group">
                <textarea rows="4" cols="20" name="opis" placeholder="Unesite opis pice" required="true" class="form-control"><% out.print(request.getParameter("opis"));%></textarea><br/><br/>
            </div>
            <div class="form-group">
                <input type="text" name="sastojci" value="<% out.print(request.getParameter("sastojci"));%>"required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="number" name="cena" value="<% out.print(request.getParameter("cena"));%>"required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="number" name="tezina" value="<% out.print(request.getParameter("tezina"));%>"required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="text" name="ocena" value="<% out.print(request.getParameter("ocena"));%>"required class="form-control"/><br/><br/>
            </div>
            
            <div class="form-group">
                <label for="aktivna" class="form-control"style="color: grey">Aktivna:</label>
                <% if(request.getParameter("aktivna").equals("true")) {
                %>
                
                <input type="checkbox" name="aktivna" checked class="form-control"/><br/><br/>
                <%
                } else {
                %>
                <input type="checkbox" name="aktivna" class="form-control"/><br/><br/>
                <%
                }    
                %>
                
            </div>
                <div class="form-group">
                <input type="text" name="slika_url" value="<% out.print(request.getParameter("slika_url"));%>"required class="form-control"/><br/><br/>
            </div>
           
            <div class="form-group">
                <input type="submit" value="Izmeni" onclick="myFunction1()" class="btn btn-success"/> 
            </div>
            <hr/>
        </form>

        <% } else { %>
        <form name = "sacuvaj" action="admin.jsp?action=sacuvaj" method="post" style="width: 20%">
            <div class="form-group">
                <input type="text" name="naziv" placeholder="Unesite naziv pice" required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <textarea rows="4" cols="20" name="opis" placeholder="Unesite opis pice" required="true" class="form-control"></textarea><br/><br/>
            </div>
            <div class="form-group">
               <input type="text" name="naziv" placeholder="Unesite sastojke pice" required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="number" name="cena" placeholder="Unesite cenu pice" step="0.001" required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="number" name="tezina" placeholder="Unesite tezinu pice"step="0.001" required class="form-control"/><br/><br/>
            </div>
            <div class="form-group">
                <input type="number" name="ocena" placeholder="Unesite ocenu pice"step="0.001" required class="form-control"/><br/><br/> 
            </div>
            <div class="form-group">
                <label for="aktivna"class="form-control"style="color: grey">Aktivna: </label>
                <input type="checkbox" name="aktivna" class="form-control"/><br/><br/> 
                
            </div>
            <div class="form-group">
               <input type="text" name="slika_url" placeholder="Unesite url slike" required class="form-control"/><br/><br/>
            </div>
            
            <div class="form-group">
                <input type="submit" value="Sacuvaj" onclick="myFunction()"class="btn btn-success btn-lg dugme"/> 
            </div>
            <hr/>
        </form>
    </center>
    <%}%>

    <table class="table table-hover table-bordered bg-success">
        <thead>
            <tr>
                <th>Naziv pice</th>
                <th>Opis</th>
                <th>Sastojci</th>
                <th>Cena</th>
                <th>Tezina</th>
                <th>Ocena</th>
                <th>Aktivna</th>
            </tr>
        </thead>
        <tbody>
            <% for (Pica p : dao.readAll(Pica.class)) {%>
            <tr>
                <td><% out.print(p.getNaziv()); %></td>
                <td><% out.print(p.getOpis()); %></td>
                <td><% out.print(p.getSastojci()); %></td>
                <td><% out.print(p.getCena()); %></td>
                <td><% out.print(p.getTezina()); %></td>
                <td><% out.print(p.getOcena()); %></td>
                <td><% out.print(p.getAktivna()); %></td>
                
                <td>
                    <form action="admin.jsp?action=izmeni"method="post">
                        <input type="hidden" name="id" value="<%out.print(p.getId());%>" />
                        <input type="hidden" name="naziv" value="<%out.print(p.getNaziv());%>" />
                        <input type="hidden" name="opis" value="<%out.print(p.getOpis());%>" />
                        <input type="hidden" name="sastojci" value="<%out.print(p.getSastojci());%>" />
                        <input type="hidden" name="cena" value="<%out.print(p.getCena());%>" />
                        <input type="hidden" name="tezina" value="<%out.print(p.getTezina());%>" />
                        <input type="hidden" name="ocena" value="<%out.print(p.getOcena());%>"/>
                        <input type="hidden" name="aktivna" value="<%out.print(p.getAktivna());%>" />
                        <button type="submit"  class="btn btn-default btn-sm">
                            <span class="glyphicon glyphicon-pencil"></span>
                            Izmeni
                        </button>
                    </form>
                </td>
                <td>
                    <form action="admin.jsp?action=obrisi" method="post">
                        <input type="hidden" name="id" value="<%out.print(p.getId());%>"/>
                        <button type="submit" class="btn btn-danger btn-sm" onclick="myFunction2()">
                            <span class="glyphicon glyphicon-remove"></span>
                            Obrisi
                        </button>
                    </form>
                </td> 
            </tr>
            <%}%>

        </tbody>
    </table>
<!--    <button onclick="myFunction()">Try it</button>-->

<!--    <p id="demo"></p>-->

    <script>
        function myFunction() {
            var txt;
            if (confirm("Zelite da sacuvate picu?")) {
                txt = "You pressed OK!";
            } else {
                txt = "You pressed Cancel!";
            }
            //document.getElementById("demo").innerHTML = txt;
        }
    </script>   
    
<!--    <p id="demo"></p>-->

    <script>
        function myFunction1() {
            var txt;
            if (confirm("Zelite da izmenite picu?")) {
                txt = "You pressed OK!";
            } else {
                txt = "You pressed Cancel!";
            }
            //document.getElementById("demo").innerHTML = txt;
        }
    </script>   
    
<!--    <p id="demo"></p>-->

    <script>
        function myFunction2() {
            var txt;
            if (confirm("Zelite da obrisete picu?")) {
                txt = "You pressed OK!";
            } else {
                txt = "You pressed Cancel!";
            }
            //document.getElementById("demo").innerHTML = txt;
        }
    </script>   
    
</body>
</html>
<%@include file="template/footer.jsp"%>