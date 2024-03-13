package Estacionamento;
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Compacto", "Fiat", "01239-123123", 2000, "azul");
        Carro c2 = new Carro("Compacto", "Ford", "13231-323123", 2000, "azul");
        CadastroCarro cc1 = new CadastroCarro();
        cc1.inserir(c1);
        cc1.inserir(c2);
        
        cc1.consultarCarro("01239-123123");
    }
}
