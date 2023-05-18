
/**
 *
 * @author Vitor de Jesus ❣🚀❣
 * Data: 16/05/2023
 */
import java.util.Scanner;

public class Agencia {

    static String nome;
    static int opcao;

    public static void main(String[] args) {
        /**
         * Criar as Boas Vindas A Agencia
         */
        System.out.println("*** Seja Bem Vindo A nossa Concessionária ***");
        System.out.println("*** Por Favor Nós Informe Seu Nome ***");

        // Scanner é uma Lib que permite capturar o valor de entrada
        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();

        System.out.println("CARO " + nome + " ESCOLHA UMA OPÇÃO: ");

        opcao = menu();

        while (opcao < 1 || opcao > 4) {
            System.out.println("*** Escolha um opção Válida ! ***");
            opcao = menu();

        }

        if (opcao == 1) {
            System.out.println("*** Deseja Comprar um Carro ! ***");

            //Instância novo Objeto Vendas
            Vendas objVendas = new Vendas();
            objVendas.newVenda();

        } else if (opcao == 2) {
            System.out.println("*** Deseja Cadastrar um Cliente ! ***");

            //Instância novo Objeto Clientes
            Clientes objCliente = new Clientes();
            objCliente.cadastroClientes();

        } else if (opcao == 3) {
            System.out.println("*** Deseja Cadastrar um Vendedor ! ***");

            //Instância novo Objeto Clientes
            Clientes objCliente = new Clientes();
            objCliente.cadastroClientes();

        } else if (opcao == 4) {
            System.out.println("*** Deseja Cadastrar um Veiculo ! ***");

            //Instância novo Objeto Veiculos
            Veiculos objVeiculos = new Veiculos();
            objVeiculos.cadastroVeiculos();

        } else {
            System.out.println("*** Escolha um opção Válida ! ***");
        }
    }

    private static int menu() {

        System.out.println("1 - Comprar um Carro");
        System.out.println("2 - Cadastrar um Cliente");
        System.out.println("3 - Cadastrar um Vendedor");
        System.out.println("4 - Cadastrar um Veiculo");

        Scanner teclado = new Scanner(System.in);
        opcao = teclado.nextInt();
        return opcao;
    }

}
