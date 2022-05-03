package practicaMona;

public class Personalidad {

    public static void main(String[] args) {
        octobi();
        support();
        scarlett();
        topgun();
        skate();
        terracot();
    }

    public static void octobi(){
        Octocat octobi = new Octobi();

        System.out.println(octobi.showMessage());
        octobi.actividad();

    }

    public static void support(){
        Support support = new Support();

        System.out.println(support.showMessage());
        support.actividad();

    }

    public static void scarlett(){
        Scarlett scarlett = new Scarlett();

        System.out.println(scarlett.showMessage());
        scarlett.actividad();

    }

    public static void topgun(){
        Topgun topgun = new Topgun();

        System.out.println(topgun.showMessage());
        topgun.actividad();

    }

    public static void skate(){
        Skate skate = new Skate();

        System.out.println(skate.showMessage());
        skate.actividad();
    }

    public static void terracot(){
        Terracot terracot = new Terracot();

        System.out.println(terracot.showMessage());
        terracot.actividad();
    }
}
