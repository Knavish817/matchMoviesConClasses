
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bienvenido a screen match ");
        System.out.println("Pelicula:matrix");

        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan=true;
        double notaDeLaPelicula=8.2;
        double media= (8.2+6.9);
        int prueba = 5;
        System.out.println();
        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio 
                Fue lanzada en: """ + fechaDeLanzamiento; //uso de text block para producir la sinosis

        String menu= """
                MENU:
                1.Matrix 
                2.Spiderman
                3.Batman 
                4.Sherk 
                """;
        System.out.println(sinopsis);
        System.out.println(menu);
        int clasificacion = (int) (media / 2);
        System.out.println("clasificacion:"+ clasificacion);
        float prueba2= (float) (prueba+0.76);
        System.out.println(prueba2);
    }
}