package KlausurWiSe2023;

public class Buchung {

    //Attribute
    private int anzTage;
    private int anzPersonen;
    private boolean mitTechnikPaket;
    private boolean mitCatering;

    //Konstruktor

    public Buchung(int anzTage, int anzPersonen, boolean mitTechnikPaket, boolean mitCatering) {
        this.anzTage = anzTage;
        this.anzPersonen = anzPersonen;
        this.mitTechnikPaket = mitTechnikPaket;
        this.mitCatering = mitCatering;
    }

    //Methoden

    public double berechnePreis() {
        double grundPreis = 200.00 * anzTage;
        if (mitTechnikPaket == true) {
            grundPreis = 200 + (50 * anzTage);

        }
        if (mitCatering == true) {
            grundPreis = 200 + (20 *anzTage*anzPersonen);

        }
        return grundPreis;


    }

    public static void main(String[] args) {

    }
}