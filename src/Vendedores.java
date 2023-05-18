
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor de Jesus ❣🚀❣
 */
public class Vendedores {
    
     public String nome = "", endereco = "", CPF, RG = "";
    //public double telefone = 0, CPF = 0, RG = 0;
    public double telefone = 0;

    public void cadastroVendedores() {

        System.out.println("########### É BOM TER VOCÊ AQUI  ############");
        System.out.println("#                                           #");
        System.out.println("# AQUI REALIZAREMOS O CADASTRO DO VENDEDOR! #");
        System.out.println("#       SOLICITAREMOS ALGUNS DADOS !        #");
        System.out.println("#                                           #");
        System.out.println("#############################################");
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo");
        nome = teclado.nextLine();

        System.out.println("Informe seu CPF: ");
        CPF = teclado.nextLine();

        System.out.println("Informe seu RG: ");
        RG = teclado.nextLine();

        System.out.println("Informe seu Telefone: ");
        telefone = teclado.nextInt();

        System.out.println("Informe seu Endereco: ");
        endereco = teclado.nextLine();

        if ("".equals(nome) || "".equals(CPF) || "".equals(RG) || "".equals(endereco) || "".equals(telefone)) {

            System.out.println("Preencha todos os dados");

        } else {
            // Criar rotas para inserir dados no Banco (Futuro);
            System.out.println("Obrigado, Cadastro realizado com sucesso !");

        }
    }

    public void listarVendedores() {

        System.out.println("######### Listar aqui todos os Vendedores Cadastrados - Banco de Dados  ##########");
    }
    
}
