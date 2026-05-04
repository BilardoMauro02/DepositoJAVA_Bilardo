Elementi usati: Singleton/Observer/Decorator

Es_DecoratorDifficile/
│
├── Main.java
│
├── Singleton/
│   └── NotificationManager.java // Singleton che gestisce UtenteLoggato e lista di Observer 
│
├── Observer/
│   |── Observer.java // Interfaccia per stabilire la funzione upDate delle classi che implementeranno l'Interfaccia
|
│
├── Model/
│   └── Utente.java // modello di utente che implementa l'observer
│
└── Decorator/
    ├── UserDecorator.java // Classe Astratta del decoratore base
    └── Concrete/
        ├── TimeStampD.java // decoratore per utente con TimeStamp
        ├── UpperCaseD.java // decoratore per utente in uppercase
        ├── PrefixD.java // decoratore per utente con prefisso
        └── EmojiD.java // decoratore per utente con emoji


Menu esposti nel terminale
1) Crea nuovo utente
2) Login
3) Logout
4) Registrati alle notifiche
5) Deregistrati dalle notifiche
6) Invia notifica
0) Esci
