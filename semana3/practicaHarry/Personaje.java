package practicaHarry;

public class Personaje {
    private String nombre;
    private String genero;
    private String casa;
    private String boggart;
    private String patronus;

    //constructor
    public Personaje(){

    }

    public Personaje(String nombre, String genero, String casa, String boggart, String patronus){
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //getters
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getBoggart(){ return boggart;  }
    public String getPatronus(){  return patronus;  }

    //setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setBoggert(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "Nombre: "+nombre+
                        "\nGenero: "+genero+
                        "\nCasa: "+casa+
                        "\nBoggart: "+boggart+
                        "\nPatronus: "+patronus+"\n";

    }
}
