package listaPOOMetodos.SessaoCinema;

public class Main {
    public static void main(String[] args) {
        SessaoCinema obj1 = new SessaoCinema();

        obj1.capacidadeTotal = 2;
        obj1.filme = "Todo mundo em pânico";
        obj1.horario = "16:20";

        obj1.exibiInfoSessao();

        obj1.venderIngresso();
        
        obj1.exibiInfoSessao();

        obj1.cancelarIngresso();

        obj1.exibiInfoSessao();

        obj1.alterarHorario("20:40");

        obj1.exibiInfoSessao();

        
    }
}
