package Estacionamento;
import java.util.ArrayList;

public class CadastroCarro {
    ArrayList<Carro> carros;

    public CadastroCarro()
    {
        carros = new ArrayList<>();
    }

    void inserir(Carro carro)
    {
        carros.add(carro);
    }
    void listarCarros()
    {
        for (int i = 0; i < carros.size(); i++) {
            carros.get(i).exibirCarro();
        }
    }
    void removerCarros(String placa)
    {
        for(int i = 0; i < carros.size(); i++)
        {
            if(carros.get(i).getPlaca() == placa){
                carros.remove(i);
            }
            
        }
    }
    void consultarCarro(String placa)
    {
        for(int i = 0; i < carros.size(); i++)
        {
            if(carros.get(i).getPlaca() == placa){
                carros.get(i).exibirCarro();
            }            
        }
    }
    
}
