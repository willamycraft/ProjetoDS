/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Caixa;
import mapeamento.Cliente;
import utilitario.Conectar;
/**
 *
 * @author T-Gamer
 */
public class CaixaDao {
    

    public List<Caixa> receitas(String nome){
   Connection con = Conectar.getconectar();
   List <Caixa> listaReceita  = new ArrayList<>();
   String sql = "select sum(receitas_cai) as Receitas from caixareceitas";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           Caixa c = new Caixa();
           c.setReceitas_cai(resultado.getDouble("Receitas"));     
           listaReceita.add(c);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listaReceita;
  }
    
    


    
}