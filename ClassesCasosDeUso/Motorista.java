package ClassesCasosDeUso;
public class Motorista {
    private String id;
    private String name;
    private String cpf;
    private String vehicle;
    private String typeVehicle;
    private boolean travelAccept = false;
    private float rating;

    void setTravelAccept(boolean response)
    {
        if(response)
        {
            this.travelAccept = true;
            System.out.println(this.travelAccept);
        }else
        {
            this.travelAccept = false;
            System.out.println(this.travelAccept);
        }
    }
    void setId(Usuario user)
    {
        this.id = user.getId();
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    void setVehicle(String vehicle)
    {
        this.vehicle = vehicle;
    }
    void setTypeVehicle(String typeVehicle)
    {
        this.typeVehicle = typeVehicle;
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
    String getVehicle()
    {
        return vehicle;
    }
    String getTypeVehicle()
    {
        return typeVehicle;
    }


    Motorista(String name, String cpf, String vehicle, String typeVehicle)
    {
        this.setName(name);
        this.setCpf(cpf);
        this.setVehicle(typeVehicle);
        this.setTypeVehicle(typeVehicle);
    }

    void travelAccept()
    {
        this.setTravelAccept(true);
    }


}
