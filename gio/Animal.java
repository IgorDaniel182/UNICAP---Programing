import java.util.ArrayList;

public class Animal{
        private String nome;
        private String especie;
        private int idade;
        private ArrayList<String> alimentos;
        
    public Animal (String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        alimentos = new ArrayList<>();
    }

    public Animal(String frase){
        alimentos = new ArrayList<>();
        String [] arrayFrase;
        arrayFrase = frase.split(",");
        for(int i = 0; i < arrayFrase.length; i++)
        {
            alimentos.add(arrayFrase[i].trim());
        }
    
    }


/////get e setters
    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }


    public int getIdade(){
        return idade;
    }


    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


///adiciona o alimento ao animal? ISSO!!!! vai adicionar um alimento a lista de alimentos do animal
public void adicionarAlimento (String alimento){
    alimentos.add(alimento);
}

///vai listar alimentos? Ele disse que não precisava listar, só fiz pra tu ver como seria
public void listarAlimento(){
    System.out.println("Alimentos:");
    for (int i = 0; i<alimentos.size(); i++){
        System.out.print(alimentos.get(i)); ///o que exatamente isso faz? alimentos é uma lista, tem as posições, ele vai pegar elemento por elemento e mostrar
         
    }
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + 
        "\nEspécie: " + especie + 
        "\nIdade: " + idade;
    }
}