
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.RealizarVendas;
import utilitario.Conectar;
import mapeamento.VendaProduto;


public class RealizarVendasDao {
    
    public void salvar(RealizarVendas r) {
    Connection con = Conectar.getconectar();
    String sql = "INSERT into venda (valor_ven ,hora_ven, data_ven, cod_cli, cod_fun,cod_prod) values (?,?,?,?,?,?) ";

    
     try (PreparedStatement stm = con.prepareStatement(sql); ) {
         stm.setFloat(1, r.getValor_ven());
         stm.setString(2, r.getHora_ven());
         stm.setString(3, r.getData_ven());
         stm.setInt(4, r.getCod_cli());
         stm.setInt(5, r.getCod_fun());
         stm.setInt(6, r.getCod_prod());
  
          
         stm.execute();
      
         stm.close();
       
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
}
    
    public void atualizar(RealizarVendas r, VendaProduto v){
    Connection con = Conectar.getconectar();
    String sql = "update  venda set valor_ven=?, hora_ven=?, data_ven=?, cod_cli=?, cod_fun=? where cod_ven=?";
    String sqla = "update  venda_produto set teste_prod=? where cod_venpro=?";
     try (PreparedStatement stm = con.prepareStatement(sql); PreparedStatement stm2 = con.prepareStatement(sqla)) {
         stm.setFloat(1, r.getValor_ven());
         stm.setString(2, r.getHora_ven());
         stm.setString(3, r.getData_ven());
         stm.setInt(4, r.getCod_cli());
         stm.setInt(5, r.getCod_fun());
         stm.setInt(6, r.getCod_ven());
         stm2.setInt(1, v.getTeste_prod());
         stm.executeUpdate();
         stm2.executeUpdate();
         stm.close();
         stm2.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
    
}
    public void deletar(RealizarVendas r, VendaProduto v){
    Connection con = Conectar.getconectar();
    String sql = "delete from venda where cod_ven=?";
     String sqla = "delete from venda_produto where cod_venpro=?";
        int op = JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR "+ r.getCod_ven() +" e o " + v.getCod_venpro()+ " ?", "EXCLUSÃO", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql); PreparedStatement stm2 = con.prepareStatement(sqla)) {
                stm.setInt(1, r.getCod_ven()); 
                stm2.setInt(2, v.getCod_venpro()); 
                stm.executeLargeUpdate();
                stm2.executeLargeUpdate();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                stm.close();
                stm2.close();
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
            }
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
           listaVendas.add(r);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listaVendas;
  }
    
    public List<VendaProduto> listaTodosprod(String nome){
   Connection con = Conectar.getconectar();
   List <VendaProduto> listarVendas  = new ArrayList<>();
   String sql = "Select * from venda_produto";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           VendaProduto v = new VendaProduto();
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


