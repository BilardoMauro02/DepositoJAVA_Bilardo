import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerBoolean = new Scanner(System.in);

        String password = "";
        int tentativi = 3;
        boolean conferma = false;

        System.out.print("Password: ");

        while (tentativi > 0) {
            password = scannerString.nextLine();
            if (password.equals("java123")) {
                System.out.println("Password corretta");
                break;
            } else {
                tentativi--;
                System.out.println("Password errata. Tentativi rimanenti: " + tentativi);
            }
        }

        if (password.equals("java123")) {
            do {
                System.out.println("Vuoi accedere al sistema?");
                conferma = scannerBoolean.nextBoolean();
                if (conferma) {
                    System.out.println("Accesso al sistema effettuato");
                    break;
                } else if (!conferma) {
                    System.out.println("Accesso annullato");
                    break;
                }
            } while (!conferma);
        }
    }
}