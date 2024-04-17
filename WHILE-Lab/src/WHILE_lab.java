import java.util.Scanner;

public class WHILE_lab {
    public static void main(String[] args) throws Exception {
        String option;
        int personasAyudan = 0;
        int ayudaRecaudada = 0;
        Scanner teclado = new Scanner(System.in);

        // Preguntamos al usuario dentro del bucle
        do {
            System.out.println("Quieres ayudar a una causa benéfica? SI/NO");
            option = teclado.nextLine().toUpperCase();

            if (option.equals("SI")){
                System.out.println("cuanto quieres donar?");
                int cantidad = teclado.nextInt();
                teclado.nextLine();
                personasAyudan++;
                ayudaRecaudada += cantidad;   
            }
            
        } while (option.equals("SI")); // Variable de control
        
        System.out.println("Has recibido ayuda de " + personasAyudan + " recaudando un total de " + ayudaRecaudada );
        teclado.close();
        
    }
    
    @Override
    public String toString() {
        return "WHILE_lab []";
    }
}
