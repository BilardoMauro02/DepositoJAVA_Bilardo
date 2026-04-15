public class LezioneArray {
    public static void main(String[] args) {

        //gli array partono da 0 nel conteggio delle posizioni dei valori
        
        //possiamo creare un array indicando il numero di valori che possono essere presenti senza dargli
        //un valore definito
        int[] numeri = new int[5];// array di dimensione 5

        //una array una volta definiti i valori al suo interno possono solo modificare il valore
        //non possiamo aggiungere un altro dato in più di quanti dichiarati nella sua inizializazione
        int[] valori = {1,2,3,4,5};// array di dimensione 5 con valori definiti

        int[] num_a = {1,2,3};
        
        for (int i : num_a){
            System.out.println(i);
            System.out.println(num_a[i-1]);
        }

        //esistono anche gli array multidimensionali
        int[][] bidimensionale_a ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

    }

}