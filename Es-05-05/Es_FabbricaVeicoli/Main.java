import java.util.Scanner;

import View.*;
import Model.*;
import Controller.*;

public class Main {

    public static void main(String[] args) {
        //ERRORE NEI CASI 4 E 5 (NON RIUSCENDO A RECUPERARE L'OGGETTO COME AUTO O MOTO PER VIA DEL DECORATOR APPLICATO IL CONTROLLO DEL METODO FALLISCE NEL RICONOSCERE I CASI DI STAMPA
        Scanner myIntSc = new Scanner(System.in);
        Scanner myStrSc = new Scanner(System.in);

        //CREAZIONE DI UNA VIEW PER LA GESTIONE DELLE STAMPE IN CONSOLE E AGGIUNTA DELL'OBSERVER AD ESSA
        ConsoleView console = new ConsoleView();
        Fabbrica.getInstance().addObserver(console);

        boolean loop = true;

        do {
            System.out.println("1. Aggiungi Auto \n 2. Aggiungi Moto \n 3. visualizza veicoli \n 4. visualizza Auto \n 5. visualizza Moto \n 0. Esci");
            System.out.println("Scelta: ");
            int scelta = myIntSc.nextInt();

            switch (scelta) {
                //AGGIUNTA AUTO
                case 1:
                    System.out.println("Motore: ");
                    String motore = myStrSc.nextLine();
                    System.out.println("Marca: ");
                    String marca = myStrSc.nextLine();
                    System.out.println("Modello: ");
                    String modello = myStrSc.nextLine();
                    System.out.println("Ruote: ");
                    int ruote = myIntSc.nextInt();

                    //CREAZIONE DEL VEICOLO MOTO, CREAZIONE DELLA VIEW E AGGIUNTA DEL CONTROLLER
                    Veicolo auto = new Auto(motore, marca, modello, ruote);
                    AutoView autoView = new AutoView();
                    AutoController autoC = new AutoController((Auto) auto, autoView);
                    autoC.aggiornaVista();

                    //SLEZIONE DEI DECORATOR
                    System.out.println(
                            "Seleziona un optional: \n 1. Navigatore \n 2. Verniciatura sportiva \n 3. Sistema di sicurezza avanzato \n 0. Nessuno");
                    int optional = myIntSc.nextInt();
                    switch (optional) {
                        case 1:
                            auto = new NavigatoreDecorator(auto);
                            break;
                        case 2:
                            auto = new VerniciaturaDecorator(auto);
                            break;
                        case 3:
                            auto = new SicurezzaDecorator(auto);
                            break;
                        case 0:
                            System.out.println("Nessun optional Aggiunto");
                            break;
                        default:
                            System.out.println("Selezione non valida, Optional non aggiunto");
                            break;
                    }
                    Fabbrica.getInstance().addVeicolo(auto);

                    break;

                //AGGIUNTA MOTO
                case 2:
                    System.out.println("Motore: ");
                    String motoreMoto = myStrSc.nextLine();
                    System.out.println("Marca: ");
                    String marcaMoto = myStrSc.nextLine();
                    System.out.println("Modello: ");
                    String modelloMoto = myStrSc.nextLine();
                    System.out.println("Ruote: ");
                    int ruoteMoto = myIntSc.nextInt();
                    //CREAZIONE DEL VEICOLO MOTO, CREAZIONE DELLA VIEW E AGGIUNTA DEL CONTROLLER
                    Veicolo moto = new Moto(motoreMoto, marcaMoto, modelloMoto, ruoteMoto);
                    MotoView motoView = new MotoView();
                    MotoController motoC = new MotoController((Moto) moto, motoView);
                    motoC.aggiornaVista();

                    //SELEZIONE DEI DECORATOR PER MOTO
                    System.out.println(
                            "Seleziona un optional: \n 1. Navigatore \n 2. Verniciatura sportiva \n 3. Sistema di sicurezza avanzato \n 0. Nessuno");
                    int optionalMoto = myIntSc.nextInt();
                    switch (optionalMoto) {
                        case 1:
                            moto = new NavigatoreDecorator(moto);
                            break;
                        case 2:
                            moto = new VerniciaturaDecorator(moto);
                            break;
                        case 3:
                            moto = new SicurezzaDecorator(moto);
                            break;
                        case 0:
                            System.out.println("Nessun optional Aggiunto");
                            break;
                        default:
                            System.out.println("Selezione non valida, Optional non aggiunto");
                            break;
                    }
                    Fabbrica.getInstance().addVeicolo(moto);
                    break;
                //STAMPA DI TUTTI I VEICOLI
                case 3:
                    console.mostraLista();
                    break;
                case 4:
                //STAMPA SOLO DELLE AUTO
                    console.mostraSoloAuto();
                    break;
                case 5:
                //STAMPA SOLO DELLE MOTO
                    console.mostraSoloMoto();
                    break;
                case 0:
                    System.out.println("ARRIVEDERCI");
                    loop = false;
                    break;
                default:
                    System.out.println("Inserimento non valido");
                    break;
            }
        } while (loop);

        myStrSc.close();
        myIntSc.close();
    }

}