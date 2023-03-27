/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteLista;

import java.util.ArrayList;

/**
 *
 * @author 13912471673
 */
public class Cliente1 {
    private String nome;
    private String cpf;
    private String rg;
    Carreta1 Carreta1;
    ArrayList<Viagem1> viagem = new ArrayList<>();
    Caminhoneiro1 c1;

    Cliente1(String nome, Carreta1 Carreta1,ArrayList viagem,Caminhoneiro1 c1) {
        this.Carreta1 = Carreta1;
        this.viagem = viagem;
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
        for(int i=0; i < viagem.size();i++){
        System.out.println("Nome Cliente: "+getNome());
        System.out.println("Caminhoneiro: "+c1.getNome());
        System.out.println("Veículo: "+Carreta1.getModeloCarreta());
        System.out.println("Destino: "+viagem.get(i).getDestino());
        System.out.println("Valor Km: "+viagem.get(i).getValorKM()+ " Distância: "+viagem.get(i).getDistancia());
        System.out.println("Valor Total da Viagem: "+viagem.get(i).getValorViagem());
        System.out.println("_______________________________________________");
        }
    }
}
