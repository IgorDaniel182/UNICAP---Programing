public class Contato {
    String nome;
    String telefone;
    String email;
    String novoTelefone;
    String novoEmail;

    public void alterarTelefone(String novoTelefone)
    {
        telefone = novoTelefone;
    }
    public void alterarEmail(String novoEmail)
    {
        email = novoEmail;
    }
    public void exibirContato()
    {
        System.out.println("Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email);
    }
    public void validarEmail()
    {
        boolean achou = false;

        for(int i = 0; i < email.length(); i++)
        {
            char letra = email.charAt(i);

            if(letra == '@')
            {   
                achou = true;
                break;

            }
            else
            {
                achou = false;
            }
        }

        if(achou)
        {
            System.out.println("Email válido!");       
        }
        else
        {
            System.out.println("Email inválido!");
        }
    }
}
