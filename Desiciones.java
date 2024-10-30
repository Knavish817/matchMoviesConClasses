public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan=false;
        double notaDeLaPelicula=8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("peliculas mas populares ");
        }else {
            System.out.println("Peliculas retro que vale la pena ver ");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){//operadores logicos ejemplo
            System.out.println("disfrute de su pelicula ");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }

}
