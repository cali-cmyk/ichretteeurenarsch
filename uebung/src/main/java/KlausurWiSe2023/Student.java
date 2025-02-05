package KlausurWiSe2023;

public class Student extends Person {
    private String matrikelNr;

    public Student(String matrikelNr, String vorname, String nachname, int alter) {
        super(vorname, nachname,alter);
        this.matrikelNr = matrikelNr;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("MatrikelNr: " + matrikelNr);
    }

    public static void main(String[] args) {
    }

}
