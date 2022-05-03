package practicaMona;

public class Topgun extends Octocat{

    public Topgun(){
        setId(111);
        setNombre("Topguntocat");
        setVestuario("Casco y traje de aviacion");
    }

    public void actividad(){
        System.out.println("Listo para pilotear jet, capitan\n");
    }
}
