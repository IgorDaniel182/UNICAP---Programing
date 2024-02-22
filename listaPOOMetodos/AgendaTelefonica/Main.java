public class Main {
    public static void main(String[] args) {
        Contato obj1 = new Contato();

        obj1.email = "igor@gmail.com";
        obj1.nome = "igor";
        obj1.telefone = "(81) 98982-1231";

        obj1.exibirContato();

        obj1.validarEmail();
    }
}
