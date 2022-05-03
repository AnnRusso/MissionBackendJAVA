package practicaMona;

public class Skate extends Octocat{

    public Skate(){
        setId(124);
        setNombre("Skatetocat");
        setVestuario("Patineta y caso");
    }

    @Override
    public void actividad() {
        System.out.println("Patinar es mi pasion!\n");
    }
}
