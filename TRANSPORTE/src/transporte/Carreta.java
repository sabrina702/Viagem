/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author 13912471673
 */
public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    Carreta(String modeloCarreta){
        this.modeloCarreta = modeloCarreta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModeloCarreta() {
        return modeloCarreta;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
    
    
}
