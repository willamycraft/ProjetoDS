
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Despesas;
import utilitario.Conectar;

public class DespesasDao {
    public void salvar(Despesas d) {
    Connection con = Conectar.getconectar();
String sql = "INSERT into Despesas (valor_desp, cod_merc_fk) values (?,?) ";
    
     try (PreparedStatement stm = con.prepareStatement(sql)) {
         stm.setFloat(1, d.getValor_desp());
         stm.setInt(2, d.getCod_merc_fk());
         stm.execute();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
}
    
     public void atualizar(Despesas d){
    Connection con = Conectar.getconectar();
    String sql = "update Despesas set valor_desp, cod_merc_fk where cod_desp=?";
     try (PreparedStatement stm = con.prepareStatement(sql)) {
          stm.setFloat(1, d.getValor_desp());
         stm.setInt(2, d.getCod_merc_fk());
         stm.setInt(3, d.getCod_desp());
      
         stm.executeUpdate();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "error"+ex.getMessage());
     }
    
}
     public void deletar(Despesas d){
    Connection con = Conectar.getconectar();
    String sql = "delete from Despesas where cod_desp=?";
        int op = JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR "+ d.getCod_desp()+ " ?", "EXCLUSÃO", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, d.getCod_desp()); 
                stm.executeLargeUpdate();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                stm.close();
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
            }
        }
            
}
      public List<Despesas> listarTodos(String nome){
   Connection con = Conectar.getconectar();
   List <Despesas> listaDespesas  = new ArrayList<>();
   String sql = "Select * from Despesas";
   try(PreparedStatement stm = con.prepareStatement(sql)){
       ResultSet resultado = stm.executeQuery();
       while (resultado.next()) {
           Despesas d = new Despesas();
           d.setCod_desp(resultado.getInt("cod_desp"));
           d.setValor_desp(resultado.getFloat("valor_desp"));
           d.setCod_merc_fk(resultado.getInt("cod_merc_fk"));
           listaDespesas.add(d);
       }
          stm.close();
          con.close();
      
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
  }
   return listaDespesas;
  }
}
