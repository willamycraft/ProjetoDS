
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Mercadorias;
import utilitario.Conectar;

public class MercadoriasDao {
    public void salvar(Mercadorias d) {
    Connection con = Conectar.getconectar();
String sql = "INSERT into Mercadorias (data_merc,hora_merc, cod_prod_fk,cod_fun_fk) values (?,?,?,?) ";
    
     try (PreparedStatement stm = con.prepareStatement(sql)) {

         stm.setString(1, d.getData_merc());
         stm.setString(2, d.getHora_merc());
         stm.setInt(3, d.getCod_prod_fk());
         stm.setInt(4, d.getCod_fun_fk());
         stm.execute();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
}
    
     public void atualizar(Mercadorias d){
    Connection con = Conectar.getconectar();
    String sql = "update Mercadorias set data_merc,hora_merc, cod_prod_fk,cod_fun_fk where cod_merc=?";
     try (PreparedStatement stm = con.prepareStatement(sql)) {
         stm.setString(1, d.getData_merc());
         stm.setString(2, d.getHora_merc());
         stm.setInt(3, d.getCod_prod_fk());
         stm.setInt(4, d.getCod_fun_fk());
         stm.setInt(5, d.getCod_merc());

      
         stm.executeUpdate();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
    
}
     public void deletar(Mercadorias d){
    Connection con = Conectar.getconectar();
    String sql = "delete from Mercadorias where cod_merc=?";
        int op = JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR "+ d.getCod_merc()+ " ?", "EXCLUSÃO", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, d.getCod_merc()); 
                stm.executeLargeUpdate();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                stm.close();
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
            }
        }
            
}
      public List<Mercadorias> listarTodos(String nome){
   Connection con = Conectar.getconectar();
   List <Mercadorias> listaMercadorias  = new ArrayList<>();
   String sql = "Select * from Mercadorias";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           Mercadorias d = new Mercadorias();
           d.setCod_merc(resultado.getInt("cod_merc"));
           d.setData_merc(resultado.getString("data_merc"));
           d.setHora_merc(resultado.getString("cod_merc"));
                         d.setCod_prod_fk(resultado.getInt("cod_prod_fk"));
              d.setCod_fun_fk(resultado.getInt("cod_fun_fk"));
           listaMercadorias.add(d);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listaMercadorias;
  }
      
      
      public List<Mercadorias> listaTodosprod(String nome){
   Connection con = Conectar.getconectar();
   List <Mercadorias> listarMercadorias  = new ArrayList<>();
   String sql = "Select * from produto";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           Mercadorias v = new Mercadorias();
           v.setCod_prod_fk(resultado.getInt("cod_prod_fk"));
           listarMercadorias.add(v);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listarMercadorias;
  }
    
}
