package practicaHarry;

public class Estudiantes {
    public static void main(String[] args) {
        harry();
        hermione();
        naville();
        cho();
        cedric();
    }

    public static void harry(){
        Personaje harry = new Personaje();

        harry.setNombre("Harry");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggert("Dementor");
        harry.setPatronus("ciervo");
        System.out.println(harry.showMessage());
    }

    public static void hermione(){
        Personaje hermione = new Personaje("Hermione", "Femenino", "Gryffindor", "Fracaso", "Nutria");
        System.out.println(hermione.showMessage());
    }

    public static void naville(){
        Personaje naville = new Personaje();

        naville.setNombre("Naville");
        naville.setGenero("Masculino");
        naville.setCasa("Gryffindor");
        naville.setBoggert("Severus");
        naville.setPatronus("No corporeo");
        System.out.println(naville.showMessage());
    }

    public static void cho(){
        Personaje cho = new Personaje("Cho Chang", "Femenino", "Ravenclaw", "Ninguno", "Cisne");
        System.out.println(cho.showMessage());
    }

    public static void cedric(){
        Personaje cedric = new Personaje("Cedric", "Masculino", "Hufflepuff", "Ninguno", "Ninguno");

        System.out.println(cedric.showMessage());
    }

}
