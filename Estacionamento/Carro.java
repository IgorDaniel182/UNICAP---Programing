package Estacionamento;
public class Carro{
    private String modelo;
    private String marca;
    private String placa;
    private int anoLanca;
    private String cor;
    private double vel_atual;

    void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    void setMarca(String marca)
    {
        this.marca = marca;
    }
    void setPlaca(String placa)
    {
        this.placa = placa;
    }
    void setAnoLanca(int anoLanca)
    {   
        this.anoLanca = anoLanca;
    }
    void setCor(String cor)
    {
        this.cor = cor;
    }

    void acelerar(double acelerar)
    {
        vel_atual += acelerar;
    }
    void frear(double frear)
    {
        vel_atual -= frear;
    }
    String getPlaca()
    {
        return this.placa;
    }

    public Carro(String modelo, String marca, String placa, int anoLanca, String cor)
    {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anoLanca = anoLanca;
        this.cor = cor;
    }
    public Carro(){}

    void exibirCarro()
    {
        System.out.println("\nMODELO: " + this.modelo + "\nMARCA: " + this.marca + "\nPLACA: " + this.placa + "\nANO LANÇAMENTO: " + anoLanca + "\nCOR: " + this.cor);
    }
}