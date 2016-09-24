/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.disco.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.utng.disco.dao.DiscoDAO;
import mx.edu.utng.disco.dao.DiscoDAOImp;
import mx.edu.utng.disco.model.Disco;
public class DiscoController extends HttpServlet {
   private static final String
           LISTA_DISCO = "/lista_disco.jsp";
   private static final String 
           AGREGAR_O_CAMBIAR = "disco.jsp";
   private DiscoDAO dao;
   
   public DiscoController(){
       dao = new DiscoDAOImp();
   }
/**
 *
 * @author LIILY´S
 */


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("borrar")){
            forward = LISTA_DISCO;
            int idDisco = Integer.parseInt(
                request.getParameter("idDisco"));
            dao.borrarDisco(idDisco);
            request.setAttribute("disco",
                    dao.desplegarDisco());
         }else if(action.equalsIgnoreCase("cambiar")){
             forward = AGREGAR_O_CAMBIAR;
             int idDisco = Integer.parseInt(
                request.getParameter("idDisco"));
             Disco Disco = 
                     dao.elegirDisco(idDisco);
             request.setAttribute("disco", Disco);
         } else if(action.equalsIgnoreCase("agregar")){
             forward = AGREGAR_O_CAMBIAR;
         } else{
             forward = LISTA_DISCO;
             request.setAttribute("disco", 
                     dao.desplegarDisco());
         }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Disco disco = new Disco();
        disco.setTitulo(request.getParameter("titulo"));
        disco.setFecha(request.getParameter("fecha"));
        disco.setTipoGrabacion(request.getParameter("tipoGrabacion"));
        disco.setCanciones(Integer.parseInt(
                request.getParameter("canciones")));
        String idDisco = request.getParameter("idDisco");
        
        if(idDisco==null|| idDisco.isEmpty()||idDisco.trim().equals("")){
            dao.agregarDisco(disco);
        }else{
            disco.setIdDisco(
                    Integer.parseInt(idDisco));
            dao.cambiarDisco(disco);
        }
        RequestDispatcher view = 
                request.getRequestDispatcher(LISTA_DISCO);
        request.setAttribute("disco", 
                dao.desplegarDisco());
        view.forward(request, response);
    }
}
