

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Discos</title>
    </head>
    <body>
        <table>
            <thead>  
            <tr>
                <th>Id de discos</th>
                <th>Titulo</th>
                <th>Fecha</th>
                <th>Tipo genero</th>
                <th>Canciones</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="disco" 
                           items="${disco}">
                    <tr>
                        <td>${disco.idDisco}</td>
                        <td>${disco.titulo}</td>
                        <td>${disco.fecha}</td>
                        <td>${diaco.tipoGenero}</td>
                        <td>${disco.canciones}</td>
                        <td><a href="DiscoController?action=cambiar&idDisco=${disco.idDisco}">Cambiar</a></td>
                        <td><a href="DiscoController?action=borrar&idDiscoe=${disco.idDisco}">Borrar</a></td>
                     </tr>  
                </c:forEach> 
            </tbody>
        </table>
        <p>
            <a href="DiscoController?action=agregar">
                Agregar disco
            </a>
        </p>
    </body>
</html>
