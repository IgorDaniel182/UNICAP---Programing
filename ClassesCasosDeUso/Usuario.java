package ClassesCasosDeUso;
class Usuario
{

    private String id;
    private String name;
    private String cpf;
    private String placeOrigin;
    private String placeDestiny;
    private boolean payment;

    void setId(String id)
    {
        this.id = id;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    void setPlaceOrigin(String placeOrigin)
    {
        this.placeOrigin = placeOrigin;
    }
    void setPlaceDestiny(String placeDestiny)
    {
        this.placeOrigin = placeDestiny;
    }

    String getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    String getCpf()
    {
        return cpf;
    }
    String getPlaceOrigin()
    {
        return placeOrigin;
    }
    String getPlaceDestiny()
    {
        return placeDestiny;
    }

    Usuario(String name, String cpf, String placeOrigin)
    {
        this.setName(name);
        this.setCpf(cpf);
        this.setPlaceOrigin(placeOrigin);
    }

    // void exibir()
    // {
    //     System.out.println(this.getActualLocate() + this.getCpf() + this.getName() + this.getId());
    // }

    void solicitarViagem(String placeOrigin, String placeDestiny)
    {
        //To do: id vai ser incrementado a cada objeto criado;
        setId("0001");
        setPlaceOrigin(placeOrigin);
        setPlaceDestiny(placeDestiny);
    }
    void cancelarViagem()
    {
        setId("0000");
    }

    // void pagar()
    // {
    //     this.payment = true;
    // }
}