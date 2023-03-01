package Clientes;

import java.util.Scanner;

//classe principal
public class Principal {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //criação objetos clientes
        Clientes cA = new Cliente_A();
        Clientes cB = new Cliente_B();
        Clientes cC = new Cliente_C();

        //variavel para escolher opção menu
        byte escolhaC = 0;
        byte escolhaP = 0;
        byte escolhaMenu = 0;

        //laço de repetição para o menu principal
        do {

            System.out.println("BEM VINDO AO MENU, SELECIONE SE VOCÊ QUER COMPRAR OU PAGAR: ");
            System.out.println("1 - COMPRAR \n2 - PAGAR \n0 - SAIR");
            escolhaMenu = ler.nextByte();

            if (escolhaMenu == 1) {

                //laço de repetição para o menu de compra
                do {

                    System.out.println("BEM VINDO AO MENU DE COMPRAS, SELECIONE QUAL É SEU TIPO DE CLIENTE: ");
                    System.out.println("1 - CLIENTE A \n2 - CLIENTE B \n3 - CLIENTE C \n0 - SAIR");
                    escolhaC = ler.nextByte();

                    //escolha 1 para cliente A
                    if(escolhaC == 1){

                        System.out.println("POR FAVOR, INSIRA O VALOR DA COMPRA: ");
                        double valorC = ler.nextDouble();
                        cA.comprar(valorC);
                        cA.calcularDesconto(valorC);
                        cA.aumentarLimite(valorC);

                    //escolha 2 para cliente B
                    }else if(escolhaC == 2){

                        System.out.println("POR FAVOR, INSIRA O VALOR DA COMPRA: ");
                        double valorC = ler.nextDouble();
                        cB.comprar(valorC);
                        cB.calcularDesconto(valorC);

                    //escolha 3 para cliente C
                    }else if(escolhaC == 3){

                        System.out.println("POR FAVOR, INSIRA O VALOR DA COMPRA: ");
                        double valorC = ler.nextDouble();
                        cC.comprar(valorC);

                    }

                }while (escolhaC != 0);

                System.out.println("OBRIGADO POR USAR O MENU DE COMPRAS! VOLTE SEMPRE");

            }else if(escolhaMenu == 2){

                //laço de repetição para o menu de pagamento
                do {
                    System.out.println("BEM VINDO AO MENU DE PAGAMENTO, SELECIONE QUAL É SEU TIPO DE CLIENTE: ");
                    System.out.println("1 - CLIENTE A \n2 - CLIENTE B \n3 - CLIENTE C \n0 - SAIR");
                    escolhaP = ler.nextByte();

                    //escolha 1 para cliente A
                    if(escolhaP == 1){

                        System.out.println("POR FAVOR, INSIRA O VALOR QUE DESEJA PAGAR: ");
                        double valorP = ler.nextDouble();
                        cA.pagar(valorP);

                    //escolha 1 para cliente
                    }else if(escolhaP == 2){

                        System.out.println("POR FAVOR, INSIRA O VALOR QUE DESEJA PAGAR: ");
                        double valorP = ler.nextDouble();
                        cB.pagar(valorP);

                    } else if (escolhaP == 3) {

                        System.out.println("POR FAVOR, INSIRA O VALOR QUE DESEJA PAGAR: ");
                        double valorP = ler.nextDouble();
                        cC.pagar(valorP);

                    }

                }while (escolhaP != 0);

                System.out.println("OBRIGADO POR USAR O MENU DE PAGAMENTOS! VOLTE SEMPRE");

            }
        }while (escolhaMenu != 0);

        System.out.println("OBRIGADO POR USAR O SISTENMA DE COMPRAS E PAGAMENTOS! VOLTE SEMPRE");

    }

}

