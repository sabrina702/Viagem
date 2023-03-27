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
public class Teste {
    public static void main(String[] args) {
        Carreta carreta2 = new Carreta("Ford");
        Viagem viagem2 = new Viagem ("São Paulo",4.5,350);
        Caminhoneiro c2 =  new Caminhoneiro("Carlos","456123","123.123.456-85",1.200);
        Cliente cliente2 = new Cliente("Lucas",carreta2,viagem2,c2);
        
        viagem2.calcularViagem();
        cliente2.visualizarViagem();
        
    }
    
}
