package Es_DecoratorFacile;

import Es_DecoratorFacile.Concrete.ConcreteDecorator;
import Es_DecoratorFacile.Concrete.ConcreteMessaggio;
import Es_DecoratorFacile.Interface.Messaggio;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto base
        Messaggio componenteBase = new ConcreteMessaggio();

        // Decorazione con il primo decoratore
        Messaggio decorato1 = new ConcreteDecorator(componenteBase);

        // Decorazione con il secondo decoratore
        Messaggio decorato2 = new ConcreteDecorator(decorato1);

        // Utilizzo del componente decorato
        System.out.println("Componente Base:");
        System.out.println(componenteBase.getContenuto());

        System.out.println("\nComponente Decorato 1:");
        System.out.println(decorato1.getContenuto());

        System.out.println("\nComponente Decorato 2:");
        System.out.println(decorato2.getContenuto());
    }
    
}
