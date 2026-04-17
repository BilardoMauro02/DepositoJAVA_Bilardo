import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        String utenteLoggato = "";

        int tentativi = 4;

        ArrayList<String> listaUtenti = new ArrayList<>();
        
        boolean menu = true;
        
        do {
            int opzione = 0;
            while (menu) {
                System.out.println("1: Login \n2: Registrazione \n3: Esci");
                opzione = intScanner.nextInt();
                switch (opzione) {
                    case 1:
                        System.out.println("Inserisci Username");
                        String uLogin = stringScanner.nextLine();
                        utenteLoggato = loginUtente(uLogin, listaUtenti);
                        menu = false;
                        break;
                    case 2:
                        System.out.println("Inserisci un Username");
                        String uRegistrazione = stringScanner.nextLine();
                        utenteLoggato = registraUtente(uRegistrazione, listaUtenti);
                        menu = false;
                        break;
                    case 3:
                        System.out.println("Arrivedereci");
                        menu = false;
                        break;
                    default:
                        System.out.println("opzione non valida");
                        break;
                }
                opzione = 0;
            }

            if (!utenteLoggato.isEmpty()) {
                System.out.println("Benvenuto " + utenteLoggato);
                menu = true;
            }

            while (menu && tentativi != 0) {
                System.out.println(
                        "1: Somma \n2: Sottrazione \n3: Moltiplicazione \n4: Divisione \n5: Potenza \n6: Esci");
                opzione = intScanner.nextInt();
                switch (opzione) {

                    case 1:
                        System.out.println("Quanti numeri vuoi inserire? ");
                        int nSomma = intScanner.nextInt();
                        ArrayList<Integer> numSomma = new ArrayList<>();
                        for (int i = 0; i < nSomma; i++) {
                            int numero = intScanner.nextInt();
                            numSomma.add(numero);
                        }
                        System.out.println(somma(numSomma));
                        tentativi--;
                        break;
                    case 2:
                        System.out.println("Quanti numeri vuoi inserire?");
                        int nSottrazione = intScanner.nextInt();
                        ArrayList<Integer> numSottrazione = new ArrayList<>();
                        for (int i = 0; i < nSottrazione; i++) {
                            int numero = intScanner.nextInt();
                            numSottrazione.add(numero);
                        }
                        System.out.println(sottrazione(numSottrazione));
                        tentativi--;
                        break;
                    case 3:
                        System.out.println("Quanti numeri vuoi inserire?");
                        int nMoltiplicazione = intScanner.nextInt();
                        ArrayList<Integer> numMoltiplicazione = new ArrayList<>();
                        for (int i = 0; i < nMoltiplicazione; i++) {
                            int numero = intScanner.nextInt();
                            numMoltiplicazione.add(numero);
                        }
                        System.out.println(moltiplicazione(numMoltiplicazione));
                        break;
                    case 4:
                        System.out.println("Quanti numeri vuoi inserire?");
                        int nDivisione = intScanner.nextInt();
                        ArrayList<Integer> numDivisione = new ArrayList<>();
                        for (int i = 0; i < nDivisione; i++) {
                            int numero = intScanner.nextInt();
                            numDivisione.add(numero);
                            tentativi--;
                        }
                        System.out.println(sottrazione(numDivisione));
                        break;
                    case 5:
                        System.out.println("Inserisci un numero: ");
                        int nPotenza = intScanner.nextInt();
                        System.out.println("inserisci la potenza");
                        int p = intScanner.nextInt();
                        System.out.println(potenza(nPotenza, p));
                        tentativi--;
                        break;
                    case 6:
                        System.out.println("Logout effettuato");
                        menu = false;
                        break;
                    default:
                        break;
                }
            }

            if (tentativi == 0) {
                utenteLoggato = "";
                tentativi = 4;
                menu = true;
            }

        } while (tentativi != 0);
    }

    static String registraUtente(String u, ArrayList<String> lista) {
        if (u.isEmpty()) {
            System.out.println("nessun nome utente inserito");
        } else {
            if (lista.contains(u)) {
                System.out.println("utente già presente");
                return null;
            } else {
                lista.add(u);
                System.out.println("utente inserito " + u);
            }
        }
        return u;
    }

    static String loginUtente(String u, ArrayList<String> lista) {
        if (u.isEmpty()) {
            System.out.println("nessun nome utente inserito");
        } else {
            if (lista.contains(u)) {
                System.out.println("Login Effettuato");
                return u;
            } else {
                System.out.println("nome utente non valido");
            }
        }
        return null;
    }

    static int somma(ArrayList<Integer> numeri) {
        int risultato = 0;
        for (int n : numeri) {
            risultato += n;
        }
        return risultato;
    }

    static int sottrazione(ArrayList<Integer> numeri) {
        int risultato = 1;
        for (int n : numeri) {
            risultato -= n;
        }
        return risultato;
    }

    static int moltiplicazione(ArrayList<Integer> numeri) {
        int risultato = 1;
        for (int n : numeri) {
            risultato *= n;
        }
        return risultato;
    }

    static int divizione(ArrayList<Integer> numeri) {
        int risultato = 1;
        {
            for (Integer n : numeri) {
                risultato /= n;
            }
            return risultato;
        }
    }

    static int potenza(int n, int p) {
        int risutltato = 1;
        for (int i = 1; i < p; i++) {
            risutltato *= n;
        }
        return risutltato;
    }

}
