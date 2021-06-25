public class Runner {
    public static void main(String[] args) {

        Drucker drucker1 = new Drucker("Bosh", " s/w Drucker mit Netz",1,
                false,false,true, true);
        Drucker drucker2= new Drucker("HP"," s/w Drucker ohne Netz", 2, false,false,
                true, false);
        Drucker drucker3=new Drucker("Leneovo"," s/w Drucker mit Scan- und Kopierfunktion mit Netz",
                3,true, false,true, true);
        Drucker drucker4=new Drucker("Siemens", "s/w Drucker mit Scan- und Kopierfunktion ohne Netz",
                4,true,false,true,false);
        Drucker drucker5=new Drucker("SW", " Farbdrucker mit Netz", 5,false,true,
                true, true);
        Drucker drucker6=new Drucker("AEG"," Farbdrucker ohne Netz",6,false,
                true, true, false);
        Drucker drucker7=new Drucker("Miele", "Farbdrucker mit Scan- und Kopierfunktion mit Netz",
                7,true,true,true,true);
        Drucker drucker8=new Drucker("Yamacha","n Farbdrucker mit Scan- und Kopierfunktion ohne Netz",
                8,true,true,true,false);

        System.out.println();
        System.out.println("Druker1");
        drucker1.SWDruck();
        drucker1.FarbeDruck();
        drucker1.Netzwerk();
        drucker1.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker2");
        drucker2.SWDruck();
        drucker2.FarbeDruck();
        drucker2.Netzwerk();
        drucker2.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker3");
        drucker3.SWDruck();
        drucker3.FarbeDruck();
        drucker3.Netzwerk();
        drucker3.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker4");
        drucker4.SWDruck();
        drucker4.FarbeDruck();
        drucker4.Netzwerk();
        drucker4.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker5");
        drucker5.SWDruck();
        drucker5.FarbeDruck();
        drucker5.Netzwerk();
        drucker5.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker6");
        drucker7.SWDruck();
        drucker7.FarbeDruck();
        drucker7.Netzwerk();
        drucker7.ScannenKopieren();

        System.out.println();
        System.out.println("Drucker8");
        drucker8.SWDruck();
        drucker8.FarbeDruck();
        drucker8.Netzwerk();
        drucker8.ScannenKopieren();
    }
}