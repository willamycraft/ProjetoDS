
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.RealizarVendas;
import utilitario.Conectar;



public class RealizarVendasDao {
    
    public void salvar(RealizarVendas r) {
    Connection con = Conectar.getconectar();
    String sql = "INSERT into venda (valor_ven ,hora_ven, data_ven, cod_cli, cod_fun,cod_prod,quant_ven) values (?,?,?,?,?,?,?) ";
    
    
     try (PreparedStatement stm = con.prepareStatement(sql); ) {
         stm.setFloat(1, r.getValor_ven());
         stm.setString(2, r.getHora_ven());
         stm.setString(3, r.getData_ven());
         stm.setInt(4, r.getCod_cli());
         stm.setInt(5, r.getCod_fun());
         stm.setInt(6, r.getCod_prod());
         stm.setInt(7, r.getQuant_ven());
          
         stm.execute();
      
         stm.close();
       
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
}
    public List<RealizarVendas> listarTodos(String nome){
   Connection con = Conectar.getconectar();
   List <RealizarVendas> listaVendas  = new ArrayList<>();
   String sql = "Select * from venda";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           RealizarVendas r = new RealizarVendas();
           r.setCod_ven(resultado.getInt("cod_ven"));
           r.setValor_ven(resultado.getFloat("valor_ven"));
           r.setHora_ven(resultado.getString("hora_ven"));
           r.setData_ven(resultado.getString("data_ven"));
           r.setCod_cli(resultado.getInt("cod_cli"));
           r.setCod_fun(resultado.getInt("cod_fun"));
        // r.setQuant_ven(resultado.getInt("quant_ven"));
           listaVendas.add(r);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listaVendas;
  }
    
    public List<RealizarVendas> listaTodosprod(String nome){
   Connection con = Conectar.getconectar();
   List <RealizarVendas> listarVendas  = new ArrayList<>();
   String sql = "Select * from venda";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           RealizarVendas v = new RealizarVendas();
           v.setCod_prod(resultado.getInt("cod_prod"));
           listarVendas.add(v);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listarVendas;
  }
    
}


