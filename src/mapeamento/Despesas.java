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
public class Despesas {
    private int cod_desp;
    private float valor_desp;
    private int cod_merc_fk;

    public int getCod_desp() {
        return cod_desp;
    }

    public void setCod_desp(int cod_desp) {
        this.cod_desp = cod_desp;
    }

    public float getValor_desp() {
        return valor_desp;
    }

    public void setValor_desp(float valor_desp) {
        this.valor_desp = valor_desp;
    }

    public int getCod_merc_fk() {
        return cod_merc_fk;
    }

    public void setCod_merc_fk(int cod_merc_fk) {
        this.cod_merc_fk = cod_merc_fk;
    }
    
    
}
