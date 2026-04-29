public class Singleton {
    
    //instanza privata statica
    private static Singleton instance;

    //construttore privato per impedire l'instanziazione esterna
    private Singleton() {}

    //metodo pubblico statico per ottenere l'istanza singleton
    public static Singleton getInstance() {
        //se l'instanza non è stata ancora creata, la crea
        if (instance == null) {
            instance = new Singleton();
        }
        //restituisce l'istanza singleton
        return instance;
    }

    //metodo di esempio che può essere chiamato sull'istanza singleton
    public void doSomething() {
        System.out.println("Singleton: doSomething() called");
    }
}