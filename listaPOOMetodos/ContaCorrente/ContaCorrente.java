package listaPOOMetodos.ContaCorrente;
class ContaCorrente
{
    String nomeTitular;
    String numeroConta;
    double saldo;

    public void depositar(double valor)
    {
        saldo += valor;
    }
    public void sacar(double valor)
    {
        if(valor <= saldo)
        {
            saldo -= valor;
        }
        else
        {
            System.out.println("Valor de saque maior que o saldo!");
            exibirSaldo();
        }
    }
    public void transferir(ContaCorrente destino, double valor)
    {
        if(valor <= saldo)
        {
            saldo -= valor;
            destino.saldo += valor;            
        }
    }
    public void exibirSaldo()
    {
        System.out.println("Saldo da conta de titular: " + nomeTitular + " - R$" + saldo);
    }
}
