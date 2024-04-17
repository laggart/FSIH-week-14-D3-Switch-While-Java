import java.util.Scanner;

public class SWITCH_WHILE {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        byte opcion;

        do {
            System.out.println("Elige que sonido quieres escuchar");
            System.out.println("1. Cuatro venezolano");
            System.out.println("2. Tren");
            System.out.println("3. Reloj");
            System.out.println("4. Cohete");
            System.out.println("5. Trompeta");
            System.out.println("6. Salir");
            opcion = teclado.nextByte();

            // No nos olvidemos de limpiar el buffer
            teclado.nextLine();

            // Casos
            switch (opcion) {
                case 1:
                    System.out.println("cambur pintón");
                    break;
                case 2:
                    System.out.println("chu chu...");
                    break;
                case 3:
                    System.out.println("Tic Tac...");
                    break;
                case 4:
                    System.out.println("Ziuuummmm");
                    break;
                case 5:
                    System.out.println("Tuuuut Tuuuut");
                    break;
                case 6:
                    System.out.println("Vamos al menú principal");
                    break;
            
                default:
                    System.out.println("Elije una de las opciones del 1 al 6");
                    break;
            }

            if (opcion != 6) {
                System.out.println("quieres escuchar otro sonido? Si/No");
                String seguir = teclado.nextLine().toLowerCase();
                if (!seguir.equals("si")){
                    break;
                }
            }
        } while (opcion != 6);

        System.out.println("Gracias por participar");

       teclado.close(); 
    }
}
