package utilitario;
import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conectar {
private static final String url = "jdbc:mysql://localhost/Bbras_willamy_alessandro_willian"; //não alterável
    private static final String nome = "root";
    private static final String senha ="root";
    
    public static Connection getconectar( ){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con =  DriverManager.getConnection(url,nome,senha);
       //  JOptionPane.showMessageDialog(null, "CONECTADOR");
    }
    catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "FALHA NA CONEXÃO"+ex.getMessage());
        }
    return con;
    }
}