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
public class Caminhoneiro {
    private String nome;
    private String Cnpj;
    private String Cpf;

    Caminhoneiro(String nome, String Cnpj, String Cpf, double salario) {
        this.nome = nome;
        this.Cnpj = Cnpj;
        this.Cpf = Cpf;
        this.salario = salario;
    }
    private double salario; 
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
