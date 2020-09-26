
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Fornecedor;
import mapeamento.VendaProduto;
import utilitario.Conectar;



public class VendaProdutoDao {
    
    public void salvar(VendaProduto v) {
    Connection con = Conectar.getconectar();
    String sql = "INSERT into venda_produto (cod_prod) values (?) ";
    
    try (PreparedStatement stm = con.prepareStatement(sql)) {
         stm.setInt(1, v.getCod_prod());
         stm.execute();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
}
    
    public List<VendaProduto> listarTodos(String nome){
   Connection con = Conectar.getconectar();
   List <VendaProduto> listavendprod  = new ArrayList<>();
   String sql = "Select cod_prod from venda_produto";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           VendaProduto v = new VendaProduto();
           v.setCod_prod(resultado.getInt("cod_prod"));
           listavendprod.add(v);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listavendprod;
  }
}
