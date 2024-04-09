
import java.util.Scanner;


public class ContaBancaria {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int opcao = 0;
        String nome = "Yuri M.";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************");

        String menu = """
                ** \nDigite sua opcao **
                1 - Consultar saldo
                2 - Transferencia de valor
                3 - Receber valor
                4 - Sair
                """;
        
        while (opcao != 4) {
            System.out.println(menu);
            opcao = scan.nextInt();
            

            if (opcao == 1) {
                System.out.println();
                System.out.println("\nO saldo atualizado e " + saldo);
                
            } else if (opcao == 2) {
            
                System.out.println("\nQual o valor que deseja transferir ");
                double valor = scan.nextDouble();
                if (valor > saldo) {
                    System.out.println("\nNao ha saldo para realizar transferencia ");
                } else {
                    saldo -=  valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
                
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = scan.nextDouble();
                saldo += valor;
                
            }  else if (opcao != 4) {
                System.out.println("\nOpcao invalida");
                
            }
        } 
       

    }
     
}