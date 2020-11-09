/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento;

/**
 *
 * @author T-Gamer
 */
public class Caixa {
    private int cod_caireceitas;
    private double receitas_cai;
    private String hora_cai, data_cai;

    public String getHora_cai() {
        return hora_cai;
    }

    public void setHora_cai(String hora_cai) {
        this.hora_cai = hora_cai;
    }

    public String getData_cai() {
        return data_cai;
    }

    public void setData_cai(String data_cai) {
        this.data_cai = data_cai;
    }
    
    
    
    
    public int getCod_caireceitas() {
        return cod_caireceitas;
    }

    public void setCod_caireceitas(int cod_caireceitas) {
        this.cod_caireceitas = cod_caireceitas;
    }

    public double getReceitas_cai() {
        return receitas_cai;
    }

    public void setReceitas_cai(double receitas_cai) {
        this.receitas_cai = receitas_cai;
    }
    
    
    
}
