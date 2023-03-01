package Clientes;

//classe cliente B extendida da classe Clientes (HERANÇA)
public class Cliente_B extends Clientes{

    //atributo de desconto
    private double desconto;

    //construtor do cliente B
    public Cliente_B() {
        nome = "João Benitez";
        cpf = 123456;
        this.desconto = 0.05;
        limite = 5000.00;
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

    //metedo calcularDesconto sobreescrito da classe Clientes
    @Override
    public void calcularDesconto(double valorCompra) {
        double descontoAplicadoB = 0;
        if(valorCompra >= 1000.00) {
            descontoAplicadoB = valorCompra * desconto;
            System.out.println("CLIENTE B - PELA COMPRA ACIMA DE R$ 1000.00, VOCÊ RECEBEU O DESCONTO DE 5%. VALOR DO DESCONTO: " + descontoAplicadoB);
            double limiteFinal = descontoAplicadoB + limite;
            System.out.println("SEU LIMITE DISPONÍVEL: " + limiteFinal);
        }else{
            System.out.println("VOCÊ NÃO POSSUI DESCONTO NESSA COMPRA.");
        }
    }

    //metedo pagar sobreescrito da classe Clientes
    @Override
    public void pagar(double valorPagamento) {
        double saldoDevedor = 5000.00 - limite;;
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


