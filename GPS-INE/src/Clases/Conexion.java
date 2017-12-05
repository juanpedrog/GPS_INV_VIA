/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexion {
    
    private static final String usuario = "root";
    private static final String contra = "";
    private Connection con;
    
    public Conexion(){
        con = null;
    }//Constructor Conexion
    
    public Connection getConexion() {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://192.168.1.66:3306/ine",usuario, contra);
            con = DriverManager.getConnection("jdbc:mysql://localhost/Viaticos",usuario, contra);
            System.out.println("Conexion Correcta");
         } catch (SQLException ex) {
           // throw new SQLException(ex);
             JOptionPane.showMessageDialog(null,"No hay conexión a la base de datos","ADVERTENCIA SQL",JOptionPane.WARNING_MESSAGE);
         } catch (ClassNotFoundException ex) {
            //throw new ClassCastException(ex.getMessage());
            JOptionPane.showMessageDialog(null,"No hay conexión a la base de datos","ADVERTENCIA CLASS",JOptionPane.WARNING_MESSAGE);
           
         }finally{
             
             return con;
         }
    }//conexion
    public boolean ejecutar(String sql) {
        try {
            Statement sentencia = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }        return true;
    }
    
    public ArrayList<String> acceder(String sql){
        ArrayList<String> arr=new ArrayList<String>();
        try {
            Statement comando=con.createStatement();
            ResultSet registro = comando.executeQuery(sql);
            /*for(int i=1;i<=registro.getMetaData().getColumnCount();i++){
                arr.add(registro.getString(i));
                System.out.print(registro.getString(i));
            }*/
            while(registro.next()){
                for(int i=1;i<=registro.getMetaData().getColumnCount();i++){
                System.out.print(registro.getString(i));
                arr.add(registro.getString(i));
                }
            }
            comando.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return arr;
    }
    
   public boolean hayConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Viaticos",usuario, contra);
            
            System.out.println("Conexion Correcta");
         } catch (SQLException ex) {
           // throw new SQLException(ex);
             JOptionPane.showMessageDialog(null,"No hay conexión a la base de datos","SQLException",JOptionPane.WARNING_MESSAGE);
             return false;
         } catch (ClassNotFoundException ex) {
            //throw new ClassCastException(ex.getMessage());
            
            return false;
           
         }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return true;
    }
}
