/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor de Jesus ❣🚀❣
 */
import java.util.Scanner;

public class Veiculos {
    
    public String modelo, marca, combustivel, cambio, direcao;
    public int ano;
    
    Scanner teclado = new Scanner(System.in);

    public void cadastroVeiculos() {

        System.out.println("#########################################");
        System.out.println("#                                       #");
        System.out.println("#    AQUI REALIZAREMOS NOVO VEICULO !!  #");
        System.out.println("#      SOLICITAREMOS ALGUNS DADOS !     #");
        System.out.println("#                                       #");
        System.out.println("#########################################");

        System.out.print("Informe o Modelo do Veiculo: ");
        modelo = teclado.nextLine();
        System.out.println("");

        System.out.print("Informe o Ano do Veiculo: ");
        ano = teclado.nextInt();
        System.out.println("");

        System.out.println("Informe o Combustivel que o Veiculo Utiliza: ");
        combustivel = teclado.nextLine();

        System.out.println("Informe se o Cambio do Veiculo é Manual ou Automatico (M x A): ");
        cambio = teclado.next();

        System.out.println("Informe como é a Direção do Veiculo Hidraulico ou Eletrica (H x E): ");
        direcao = teclado.nextLine();

        if ("".equals(modelo) || "".equals(ano) || "".equals(combustivel) || "".equals(cambio) || "".equals(direcao) ) {

            System.out.println("Preencha todos os dados");

        } else {
            // Criar rotas para inserir dados no Banco (Futuro);
            System.out.println("Obrigado, Veiculo cadastro com sucesso !");

        }
    }




    public void listarVeiculos() {

        System.out.println("######### Listar aqui todos os Veiculos Cadastrados - Banco de Dados  ##########");

    }

    
    
}
