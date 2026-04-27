package Scuola;

import java.util.ArrayList;
import java.util.Scanner;

public class GestioneScuola {
    public static void main(String[] args) {

        ArrayList<Docente> listaDocenti = new ArrayList<>();
        ArrayList<Studente> listaStudenti = new ArrayList<>();

        Scanner myIntScanner = new Scanner(System.in);
        Scanner myStringScanner = new Scanner(System.in);
        int menuSelezione = 0;
        boolean menu = true;

        System.out.println("Benvenuto alla gestione Scuola");
        do {
            System.out.println(
                    "Cosa vuoi fare? \n1)inserisci docente \n2)studente \n3)assegna voto \n4)visualizza voti \n5) esci ");
            menuSelezione = myIntScanner.nextInt();

            switch (menuSelezione) {
                case 1:
                    //Inserimento nella lista del professore
                    System.out.print("inserisci nome del docente: ");
                    String nomeDocente = myStringScanner.nextLine();
                    System.out.print("inserisci eta del docente: ");
                    int etaDocente = myIntScanner.nextInt();
                    System.out.print("Che materia insegna?: ");
                    String materiaInsegnata = myStringScanner.nextLine();
                    Docente docente = new Docente(nomeDocente, etaDocente, materiaInsegnata);
                    listaDocenti.add(docente);
                    System.out.println("Docente inserito nel registro");
                    break;
                case 2:
                    //inserimento nella lista di uno studente
                    System.out.print("inserisci nome dello studente: ");
                    String nomeStudente = myStringScanner.nextLine();
                    System.out.print("inserisci eta dello studente ");
                    int etaStudente = myIntScanner.nextInt();
                    System.out.print("Che corso frequenta?: ");
                    String Corso = myStringScanner.nextLine();
                    System.out.println("Che anno di corso?: ");
                    int anno = myIntScanner.nextInt();
                    Studente studente = new Studente(nomeStudente, etaStudente, Corso, anno);
                    listaStudenti.add(studente);
                    System.out.println("Studente inserito nel registro");
                    break;
                case 3:
                    System.out.println("Quale professore deve inserire i voti?");
                    // STAMPA SOLO I NOMI DI PROFESSORI
                    for (Docente d : listaDocenti) {
                        System.out.println("- " + d.getNome());
                    }
                    String selezionaDocente = myStringScanner.nextLine();
                    Docente d = null;
                    for (Persona p : listaDocenti) {
                        if (p.getNome().equalsIgnoreCase(selezionaDocente)) {
                            // UNA VOLTA TROVATO IL DOCENTE LO SALVA IN UNA VARIABILE TEMPORANEA USANDO IL PARSING
                            d = (Docente) p;
                            break;
                        }
                    }

                    if (d == null) {
                        System.out.println("docente non trovato");
                    } else {
                        //STAMPA SOLO I NOMI DEGLI ALUNNI INERENTI AL SUO CORSO/MATERIA
                        System.out.println("a chi devi inserire il voto?");
                        for (Studente s : listaStudenti) {
                            if (s.getCorso().equalsIgnoreCase(d.getMateria())) {
                                System.out.println("- " + s.getNome());
                            }
                        }
                        String selezionaStudente = myStringScanner.nextLine();
                        Studente s = null;
                        for (Studente p : listaStudenti) {
                            if (p.getNome().equalsIgnoreCase(selezionaStudente)) {
                                s = (Studente) p;
                                break;
                            }
                        }

                        if (s == null) {
                            System.out.println("Studente non trovato");
                        } else {
                            //INSERISCE IL VOTO NELLA LISTA DI VOTI DELLO STUDENTE
                            System.out.println("Inserisci il voto: ");
                            int voto = myIntScanner.nextInt();
                            s.addVoto(voto);
                        }
                    }
                    break;
                case 4:
                    //STAMPA SOLO I NOMI DEI DOCENTI
                    System.out.println("Chi deve Vedere i voti?");
                    for (Docente dVoti : listaDocenti) {
                        System.out.println("- " + dVoti.getNome());
                    }
                    String selezionaDocenteVoti = myStringScanner.nextLine();
                    Docente dVoti = null;
                    for (Persona p : listaDocenti) {
                        if (p.getNome().equalsIgnoreCase(selezionaDocenteVoti)) {
                            dVoti = (Docente) p;
                            break;
                        }
                    }

                    if (dVoti == null) {
                        System.out.println("docente non trovato");
                    } else {
                        //STAMPA I VOTI DEGLI STUDENTI PRESENTI NEL SUO CORSO
                        for (Studente studente2 : listaStudenti) {
                            if (studente2.getCorso().equalsIgnoreCase(dVoti.getMateria())) {
                                System.out.println(studente2.getNome() + studente2.getVoti());
                            }
                        }
                    }

                    break;
                case 5:
                    System.out.println("Arrivedereci");
                    menu = false;
                default:
                    System.out.println("Opzione non valida");
                    break;
            }

        } while (menu);

        myIntScanner.close();
        myStringScanner.close();
    }
}
