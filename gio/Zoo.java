import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animais;


    public void adicionarAnimal (Animal animaladd){
        animais.add(animaladd);
    }

    public void listarAnimais() {
        for (int i = 0; i<animais.size(); i++){
            System.out.print(animais.get(i).toString());
        }
    }

   
    public void buscarAnimal (String especie){
        for(int i=0 ; i<animais.size(); i++){
            if (especie.equals(animais.get(i).getEspecie())){
                animais.get(i).toString();
            }
        }
    }
}