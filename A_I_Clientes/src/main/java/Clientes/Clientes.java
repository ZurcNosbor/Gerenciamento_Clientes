package Clientes;

public class Clientes {

    //atributos da classe clientes
    protected String nome;
    protected int cpf;
    protected double limite;

    //metodo para comprar
    public double comprar(double valorCompra){
        limite = limite - valorCompra;
        System.out.println("COMPRA EFETUADA NO VALOR DE: " + valorCompra + "\n" + "SEU LIMITE ATUAL É: " + limite );
        return valorCompra;
    }

    //metedo para calcular o desconto
    public void calcularDesconto(double valorCompra) {
        System.out.println("Desconto Aplicado: ");

    }

    //metodo para aumentar o limite
    public void aumentarLimite(double valorCompra) {

        System.out.println("LIMITE AUMENTADO: ");
    }

    //metodo para pagar
    public void pagar(double valorPagamento){
        System.out.println("VALOR PAGO: ");
    }

}
