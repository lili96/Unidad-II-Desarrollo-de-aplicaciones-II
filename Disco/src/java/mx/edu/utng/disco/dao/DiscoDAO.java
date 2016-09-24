/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.disco.dao;

import java.util.List;
import mx.edu.utng.disco.model.Disco;


/**
 *
 
 */
public interface DiscoDAO {
    void agregarDisco(Disco disco);
    void borrarDisco(int idDisco);
    void cambiarDisco(Disco disco);
    List<Disco> desplegarDisco();
    Disco elegirDisco(int idDisco);

}
