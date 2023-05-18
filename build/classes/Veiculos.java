/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor de Jesus ❣🚀❣
 */
public class Veiculos {
    
    public String modelo, marca, combustivel, cambio, direcao, freios;
    public int ano
    
    Scanner objScanner = new Scanner(System.in);

    public void cadastroVeiculos() {

        System.out.println("#########################################");
        System.out.println("#                                       #");
        System.out.println("#    AQUI REALIZAREMOS NOVO VEICULO !!  #");
        System.out.println("#      SOLICITAREMOS ALGUNS DADOS !     #");
        System.out.println("#                                       #");
        System.out.println("#########################################");

        System.out.print("Informe o Modelo do Veiculo: ");
        modelo = objScanner.nextLine();
        System.out.println("");

        System.out.print("Informe o Ano do Veiculo: ");
        ano = objScanner.nextInt();
        System.out.println("");

        System.out.println("Informe o Combustivel que o Veiculo Utiliza: ");
        combustivel = objScanner.nextLine();

        System.out.println("Informe se o Cambio do Veiculo é Manual ou Automatico (M x A): ");
        cambio = objScanner.next();

        System.out.println("Informe seu Endereco: ");
        endereco = objScanner.nextLine();

        if ("".equals(nome) || "".equals(CPF) || "".equals(RG) || "".equals(endereco) || "".equals(telefone) ) {

            System.out.println("Preencha todos os dados");

        } else {
            // Criar rotas para inserir dados no Banco (Futuro);
            System.out.println("Obrigado, Cadastro realizado com sucesso !");

        }
    }




    public void listarVeiculos() {

        System.out.println("######### Listar aqui todos os Veiculos Cadastrados - Banco de Dados  ##########");

    }

    
    
}
