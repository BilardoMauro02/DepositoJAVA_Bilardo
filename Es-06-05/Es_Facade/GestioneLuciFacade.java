package Es_Facade;

class GestioneLuciFacade {
    private LuceCamera camera = new LuceCamera();
    private LuceCucina cucina = new LuceCucina();

    public void accendiTutte(){
        camera.accendi();
        cucina.accendi();
    }
}
