import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("En que estación del año estamos?");
        System.out.println("1- Primavera");
        System.out.println("2- Verano");
        System.out.println("3- Otoño");
        System.out.println("4- Invierno");
        System.out.println("0- SALIR");
        
        byte opcion = teclado.nextByte();

        teclado.close();

        switch (opcion) {
            case 1:
            System.out.println("primavera la sangre altera");
                break;

            case 2:
            System.out.println("veraneando se va el tiempo volando");
                break;
            
            case 3:
            System.out.println("Otoño lluvioso año copioso");
                break;

            case 4:
            System.out.println("A Invierno malechor, Primavera peor");

            default:
                break;
        }


       
    }
}
