package Clientes;

//classe cliente C extendida da classe Clientes (HERANÇA)
public class Cliente_C extends Clientes{

    //construtor do cliente C
    public Cliente_C() {
        nome = "Joãozinho";
        cpf = 1234567;
        limite = 1000.00;
    }

    //metedo comprar sobreescrito da classe Clientes
    @Override
    public double comprar(double valorCompra) {
        if(valorCompra <= limite){
            limite = limite - valorCompra;
            System.out.println("COMPRA EFETUADA NO VALOR DE: " + valorCompra);
            System.out.println("SEU LIMITE DISPONÍVEL: " + limite);
        }else{
            System.out.println("LIMITE PARA COMPRA INDISPONÍVEL. \nSEU LIMITE DISPONÍVEL É: " + limite );
        }
        return valorCompra;
    }

    //metedo pagar sobreescrito da classe Clientes
    @Override
    public void pagar(double valorPagamento) {
        double saldoDevedor = 1000.00 - limite;;
        if (valorPagamento <= limite) {
            limite = limite - valorPagamento;
            limite = limite + valorPagamento;
            System.out.println("PAGAMENTO EFETUADO NO VALOR DE: " + valorPagamento);
            double pago = valorPagamento + limite;
            System.out.println("SEU LIMITE DISPONÍVEL É: " + pago);
        } else {
            System.out.println("VALOR DE PAGAMENTO ACIMA DO VALOR DEVEDOR. \nSEU LIMITE DISPONÍVEL É: " + limite + "\nVALOR DEVEDOR: " + saldoDevedor);
        }
    }

}



