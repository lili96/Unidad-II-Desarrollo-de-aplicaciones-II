<%-- 
    Document   : estudiante
    Created on : 20/09/2016, 12:24:45 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disco</title>
    </head>
    <body>
        <form action="DiscoController" method="post">
            <fieldset>
                <legend>Formulario de registro</legend>
                
                <div>
                <label for="idDisco">Id Disco:</label>
                <input type="text" name="idDisco"
                       value="${disco.idDisco}"
                       readonly="readonly" 
                       placeholder="Id de Disco"/>
                </div>
                
                <div>
                <label for="titulo">Titulo:</label>
                <input type="text" name="titulo"
                       value="${disco.titulo}"
                       placeholder="titulo"/>
                </div>
                 
                <div>
                <label for="fecha">Fecha:</label>
                <input type="text" name="fecha"
                       value="${disco.fecha}"
                       placeholder="fecha"/>
                </div>
                
                <div>
                <label for="tipoGrabacion">Tipo Grabacion:</label>
                <input type="text" name="tipoGrabacion"
                       value="${disco.tipoGrabacion}"
                       placeholder="tipoGrabacion"/>
                </div>
                       
                <div>
                <label for="canciones">Canciones:</label>
                <input type="text" name="canciones"
                       value="${disco.canciones}"
                       placeholder="Canciones"/>
                </div>
                
                 <div>
                     <input type="submit" 
                       value="Guardar" />
                </div>
            </fieldset>
            
        </form>
    </body>
</html>
