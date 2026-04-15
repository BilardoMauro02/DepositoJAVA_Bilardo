import java.util.Scanner;

public class EsArray {
    public static void main(String[] args) {

        Scanner myStringS = new Scanner(System.in);
        Scanner myIntS = new Scanner(System.in);
        
        // array per dolci e per prezzo dei dolci (difficoltà nel convertire dall'array il prezzo per renderlo un int e effettuare le somme)
        String[][] dolci = {
                { "Torta", "3.50" },
                { "Cannolo", "2.00" },
                { "Gelato", "1.80" },
                { "Brioche con gelato", "3.00" }
        };

        // dolci ordinati dal cliente inizializato a 0
        int nDolciDiversi = 0;


        do {
            System.out.println("quanti dolci diversi vuoi ordinare? (max 3)");
            nDolciDiversi = myIntS.nextInt();

            //se i dolci sono un numero superiore a 0 allora su porcede nelle scelte
            if (nDolciDiversi > 0) {

                //creazione degli array per conservare il nome dei dolci e inserisco 2 per indicare il numero di colonne presenti nell'array
                //per inserire la quantita per ogni dolce
                String[][] dolci_a = new String[nDolciDiversi][2];

                System.out.println("Menu dei dolci completo");

                //Ho cercato un metodo per scorrere un array bidimensionale e ho visto che si poteva fare n foreach annidato per recuperare gli elementi della seconda colonna  
                for (String[] dolce : dolci) {
                    for (String descrizione : dolce){
                        System.out.print(descrizione + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < nDolciDiversi; i++) {

                    // creo delle variabili per memorizzare il dolce scelto e la quantita, poi uso un boolean per un confronto nel menu dei dolci
                    String scelta;
                    int quantita;
                    boolean trovato = false;
                    do{
                        System.out.println("seleziona un dolce: ");
                        scelta = myStringS.nextLine();
                        

                        //uso .length per verificare che la stringa non sia vuota e procedere nel confronto
                        if (scelta.length() > 0) {
                            for (String[] riga: dolci){
                                if (riga[0].equalsIgnoreCase(scelta)) {
                                    trovato = true;
                                    //interrompo il ciclo in caso di un riscontro positivo nel menù
                                    break;
                                }
                            }
                        }else{
                            //se la stringa risulta vuota
                            System.out.println("inserisci un dolce");
                        }
                        if (!trovato) {
                            //se la stringa non trova una corrispondenza
                            System.out.println("Dolce non presente nel menu");
                        }
                    }while (!trovato);
                    //memorizzo il dolce nella prima colonna nel suo indice
                    dolci_a[i][0] = scelta;

                    System.out.println("quanti ne vuoi di " + dolci_a[i][0] + "? (max 10)");

                    // uso il ciclo do per gestire la selezione di quantità
                    do{
                        quantita = myIntS.nextInt();
                        if (quantita < 1 || quantita > 10) {
                            System.out.println("massimo 10 pezzi");
                        }    
                    }while (quantita < 1 || quantita > 10);
                    //uso un metodo delle stringe per recuperare il valore di quantità in modo da poterlo salvare nell'array della stringa (altrimenti darebbe errore)
                    dolci_a[i][1] = String.valueOf(quantita);
                }

                //unica stampa per i dolci selezionati e la loro quantità
                for(String[] riga : dolci_a){
                    System.out.println("dolce: " + riga[0] + " Quantità: " + riga[1]);
                }

            } else {
                System.out.println("devi ordinare almeno 1 dolce");
            }


        } while (nDolciDiversi < 0);
        //NON SONO RIUSCITO A INSERIRE UNA STAMPA PER IL RIEPILOGO ORDINE COMPLETO
        myIntS.close();
        myStringS.close();
    }
    
}