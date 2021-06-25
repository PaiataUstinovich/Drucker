class Drucker implements DruckerMethode {

    public Drucker(String hersteller, String modell, int nummer, boolean skanner, boolean farbe, boolean sw, boolean netz) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.nummer = nummer;
        this.skanner = skanner;
        this.farbe = farbe;
        this.sw = sw;
        this.netz = netz;
    }

    private String hersteller;
    private String modell;
    private int nummer;
    private boolean skanner;
    private boolean farbe;
    private boolean sw;
    private boolean netz;




    @Override
    public void SWDruck() {
        if(sw){
            System.out.println("Druck in schwarz-weiß");
        }
    }

    @Override
    public void FarbeDruck() {
        if (farbe) {
            System.out.println("Druck farblich");
        }
    }



    @Override
    public void ScannenKopieren() {
       if (skanner){
           System.out.println("Scann und mach eine kopie");
        }
    }

    @Override
    public void Netzwerk() {
        if (netz) {
            System.out.println("Drucker war mit der Netz verbunden");
        }
    }

}
