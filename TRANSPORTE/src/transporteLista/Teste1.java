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
public class Teste1 {
    public static void main(String[] args) {
        Carreta1 carreta2 = new Carreta1("Ford");
        Caminhoneiro1 c2 =  new Caminhoneiro1("Carlos","456123","123.123.456-85",1.200);
        
        ArrayList<Viagem1> lista = new ArrayList<>();
        Viagem1 viagem2 = new Viagem1("São Paulo",4.5,350);
        Viagem1 viagem3 = new Viagem1("Minas Gerais",3.0,300);
        lista.add(viagem2);
        lista.add(viagem3);
        
        Cliente1 cliente2 = new Cliente1("Lucas",carreta2,lista,c2);
        
        //viagem2.calcularViagem();
        cliente2.visualizarViagem();
        
    }
}
