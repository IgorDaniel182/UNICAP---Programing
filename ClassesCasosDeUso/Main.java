package ClassesCasosDeUso;
public class Main {
    public static void main(String[] args) {
        
        Usuario user01 = new Usuario("JOSE ERMILHO", "132.123.123-11", "SÃO LORENÇO DA MATA", "RECIFE");

        Motorista driver01 = new Motorista("FERNANDO LUIZ", "123.123.412-11", "HONDA CIVIC", "PREMIUM");

        driver01.travelAccept();

    }
}
