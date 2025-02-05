package WeitereUebungen;

public class Schrank {
    private String modell;
    private int hoehe;
    private boolean hatLackierung;

    public Schrank(String modell, int hoehe, boolean hatLackierung) {
        this.modell = modell;
        this.hoehe = hoehe;
        this.hatLackierung = hatLackierung;
    }

    public double berechnePreis(){
        double psmolle=49.9;
        double psmutje = 64.80;
        double psmoere = 69.90;

        if(hoehe>180){
            psmolle = psmolle +10.0;
            psmutje = psmutje +10.0;
            psmoere = psmoere + 10.0;

        if(hatLackierung){

            psmolle = psmolle * 1.08;
            psmutje = psmutje * 1.08;
            psmoere = psmoere * 1.08;

        }
        }
        if(modell.equals("Smolle")){
            return psmolle;
        }
        else if (modell.equals("Smutje")) {
            return psmutje;

        } else if (modell.equals("Smoere")) {
            return psmoere;
        }
        return 0.0;


    }

    public static void main(String[] args) {
        Schrank s1 = new Schrank("Smutje",181,false);
        System.out.println(s1.berechnePreis());

    }
}
