package practicaMona;

public class Octocat {
    private int id;
    private String nombre;
    private String vestuario;

    //constructor
    public Octocat(){

    }

    //getters
    public int getId(){  return id;  }
    public String getNombre(){  return nombre;  }
    public String getVestuario(){  return vestuario;  }

    //setters
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setVestuario(String vestuario){
        if(!vestuario.isEmpty()) {
            this.vestuario = vestuario;
            return true;
        } else
            return false;
    }

    //metodo
    public void actividad(){
        System.out.println("Hola soy un lindo Octocat");
    }

    public String showMessage(){
        return "Id: "+id+
                "\nNombre: "+nombre+
                "\nVestuario: "+vestuario;
    }
}
