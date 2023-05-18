/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor de Jesus ❣🚀❣
 */
import java.util.Scanner;

public class Clientes {

    public String nome = "", endereco = "", CPF, RG = "";
    //public double telefone = 0, CPF = 0, RG = 0;
    public double telefone = 0,

    Scanner objScanner = new Scanner(System.in);

    public void cadastroClientes() {

        System.out.println("######### É BOM TER VOCÊ AQUI  ##########");
        System.out.println("#                                       #");
        System.out.println("# AQUI REALIZAREMOS SEU CADASTRO !!     #");
        System.out.println("# SOLICITAREMOS ALGUNS DADOS !          #");
        System.out.println("#                                       #");
        System.out.println("#########################################");

        System.out.println("Informe seu nome completo");
        nome = objScanner.nextLine();

        System.out.println("Informe seu CPF: ");
        CPF = objScanner.nextLine();

        System.out.println("Informe seu RG: ");
        RG = objScanner.nextLine();

        System.out.println("Informe seu Telefone: ");
        telefone = objScanner.nextInt();

        System.out.println("Informe seu Endereco: ");
        endereco = objScanner.nextLine();

        if ("".equals(nome) || "".equals(CPF) || "".equals(RG) || "".equals(endereco) || "".equals(telefone) ) {

            System.out.println("Preencha todos os dados");

        } else {
            // Criar rotas para inserir dados no Banco (Futuro);
            System.out.println("Obrigado, Cadastro realizado com sucesso !");

        }
    }




    public void listarClientes() {

        System.out.println("######### Listar aqui todos os Clientes Cadastrados - Banco de Dados  ##########");

    }

}
