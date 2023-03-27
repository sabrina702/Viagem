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
public class Cliente {
    private String nome;
    private String cpf;
    private String rg;
    Carreta Carreta1;
    Viagem Viagem1;
    Caminhoneiro c1;

    Cliente(String nome, Carreta Carreta1,Viagem Viagem1,Caminhoneiro c1) {
        this.Carreta1 = Carreta1;
        this.Viagem1 = Viagem1;
        this.c1 = c1;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void visualizarViagem(){
        System.out.println("Nome Cliente: "+getNome());
        System.out.println("Caminhoneiro: "+c1.getNome());
        System.out.println("Veículo: "+Carreta1.getModeloCarreta());
        System.out.println("Destino: "+Viagem1.getDestino());
        System.out.println("Valor Km: "+Viagem1.getValorKM()+ " Distância: "+Viagem1.getDistancia());
        System.out.println("Valor Total da Viagem: "+Viagem1.getValorViagem());
    }
}
