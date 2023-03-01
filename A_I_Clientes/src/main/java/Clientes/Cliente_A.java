package Clientes;

//classe cliente A extendida da classe Clientes (HERANÇA)
public class Cliente_A extends Clientes {

    //atributo de desconto
    private double desconto;

    //construtor do cliente A
    public Cliente_A() {
        nome = "João";
        cpf = 12345;
        this.desconto = 0.1;
        limite = 10000.00;
    }

    //metedo aumentarLimite sobreescrito da classe Clientes
    @Override
    public void aumentarLimite(double valorCompra) {
        if(valorCompra >= 5000.00) {
            limite = limite + 500;
            System.out.println("CLIENTE A - PELA COMPRA ACIMA DE R$ 5000.00, VOCÊ GANHOU R$ 500.00 DE LIMITE. LIMITE ATUAL: " + limite);
        }
    }


    //metedo comprar sobreescrito da classe Clientes
    public double comprar(double valorCompra){
        if(valorCompra <= limite){
            limite = limite - valorCompra;
            System.out.println("COMPRA EFETUADA NO VALOR DE: " + valorCompra);
            System.out.println("SEU LIMITE DISPONÍVEL: " +  limite);
        }else{
            System.out.println("LIMITE PARA COMPRA INDISPONÍVEL. \nSEU LIMITE ATUAL É: " + limite);
        }
        return valorCompra;
    }

    //metedo calcularDesconto sobreescrito da classe Clientes
    @Override
    public void calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        double valorCompraDesconto;
        if(valorCompra >= 2000.00){
            descontoAplicado = valorCompra * desconto;
            valorCompraDesconto = valorCompra - descontoAplicado;
            System.out.println("CLIENTE A - PELA COMPRA ACIMA DE R$ 2000.00, VOCÊ RECEBEU O DESCONTO DE 10%. VALOR DO DESCONTO: " + descontoAplicado);
            double limiteMaisDesconto = descontoAplicado + limite;
            System.out.println("CLIENTE A - VALOR FINAL DA COMPRA: " + valorCompraDesconto);
            System.out.println("CLIENTE A - LIMITE ATUAL: " + limiteMaisDesconto);

        }
    }

    //metedo pagar sobreescrito da classe Clientes
    @Override
    public void pagar(double valorPagamento) {
        double saldoDevedor = 10000.00 - limite;;
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
