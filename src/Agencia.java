/**
 *
 * @author Vitor de Jesus ❣🚀❣
 * Data: 16/05/2023 
 */

import java.util.Scanner;

public class Agencia {
    
    public static void main(String[] args) {
        
        /** Criar as Boas Vindas A Agencia */
        System.out.println("*** Seja Bem Vindo A nossa Concessionária ***");
        System.out.println("*** Por Favor Nós Informe Seu Nome ***");
        
        Scanner teclado  =  new Scanner(System.in);         // Scanner é uma Lib que permite capturar o valor de entrada
        
        String nome = teclado.nextLine();                          // Coletando dados do usuario 
        System.out.println("Olá "+ nome + " É prazer ter você aqui");
        
        System.out.println("Caro "+ nome + " Você deseja Comprar um Carro ? (Sim / Não)");
        String compra = teclado.nextLine(); 
        
        if (compra.equals("Sim")){
            System.out.println("*** Deseja Comprar um Carro ! ***");
        }
        else {
            System.out.println("*** Não Deseja Comprar um Carro ! ***");
        }
    } 
}
