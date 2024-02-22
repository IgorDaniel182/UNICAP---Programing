package listaPOOMetodos.SessaoCinema;

class SessaoCinema
{   
    String filme;
    String horario;
    int capacidadeTotal;
    int ingressosVendidos;
    String novoHorario;
    
    public void venderIngresso()
    {
        if (capacidadeTotal > ingressosVendidos)
        {
            ingressosVendidos += 1;
            capacidadeTotal -= 1;
        }
    } 
    public void cancelarIngresso()
    {
        ingressosVendidos -= 1;
        capacidadeTotal += 1;
    }
    public void exibiInfoSessao()
    {
        System.out.println("O filme " + filme + " vai passar as " + horario + "hrs " + " tem " + capacidadeTotal + " cadeiras disponíveis.");
    }
    public void alterarHorario(String novoHorario)
    {
        horario = novoHorario;
    }   
}