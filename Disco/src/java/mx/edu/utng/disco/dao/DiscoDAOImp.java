package mx.edu.utng.disco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.edu.utng.disco.model.Disco;

import mx.edu.utng.disco.util.UtilDB;

/**
 *
 * @author LIILY´S
 */

public class DiscoDAOImp implements DiscoDAO {

    private Connection connection;

    public DiscoDAOImp() {
        connection = UtilDB.getConnection();
    }

    @Override
    public void agregarDisco(Disco disco) {
        try {
            String query = "INSERT INTO disco (titulo, fecha, "
                    + " tipoGrabacion, canciones) VALUES (?,?,?,?)";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setString(1, disco.getTitulo());
            ps.setString(2, disco.getFecha());
            ps.setString(3, disco.getTipoGrabacion());
            ps.setInt(4, disco.getCanciones());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarDisco(int idDisco) {
        try {
            String query = "DELETE FROM Disco WHERE id_disco = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setInt(1, idDisco);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarDisco(Disco disco) {
        try {
            String query = "UPDATE estudiantes SET nombre = ?, "
                    + " apellidos= ?, curso=?, anio=? WHERE "
                    + " id_estudiante = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setString(1, disco.getTitulo());
            ps.setString(2, disco.getFecha());
            ps.setString(3, disco.getTipoGrabacion());
            ps.setInt(4, disco.getCanciones());
            ps.setInt(5, disco.getIdDisco());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<Disco> desplegarDisco() {
        List<Disco> disco = new ArrayList<Disco>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM disco");
            while (resultSet.next()) {
                Disco disco1 = new Disco(resultSet.getInt("id_disco"),
                        resultSet.getString("titulo"),
                        resultSet.getString("fecha"),
                        resultSet.getString("tipoGrabacion"),
                        resultSet.getInt("canciones"));
                disco1.add(disco1);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disco;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disco elegirDisco(int idDisco) {
        Disco disco = new Disco();
        try {
            PreparedStatement statement
                    = connection.prepareStatement(
                            "SELECT * FROM disco WHERE "
                            + " id_disco = ?");
            statement.setInt(1, idDisco);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                disco.setIdDisco(
                        resultSet.getInt("id_Disco"));
                disco.setTitulo(
                        resultSet.getString("titulo"));
                disco.setFecha(
                        resultSet.getString("fecha"));
                disco.setTipoGrabacion(
                        resultSet.getString("tipoGrabacion"));
                disco.setCanciones(resultSet.getInt("canciones"));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disco;
    }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
