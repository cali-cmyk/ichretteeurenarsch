package KlausurWiSe2023;

public class Person {
    protected String vorname;
    protected String nachname;
    protected int alter;

    public Person(String vorname, String nachname, int alter) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public void printInfo(){
        System.out.println("Name: " + vorname + " " + nachname + "\n" + "Alter: " + alter);
    }

    public static void main(String[] args) {
        Person p = new Person("daniel", "merdian", 19);
        p.printInfo();
        Student s1 = new Student("asdf98","jobusayo motherfucker","arigato goyshastdunichtgesehen",56);
        s1.printInfo();
    }
}
