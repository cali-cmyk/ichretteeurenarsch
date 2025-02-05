package WeitereUebungen;

public class Song extends Medium {
    private String artist;

    public Song(String titel, String artist) {
        super(titel);
        this.artist = artist;
    }

    public void ausgeben(){
        System.out.println("Titel: " + titel + "\n" + "Artist: " + artist);
    }

    public static void main(String[] args) {
        Song s1 = new Song("ich höre keine musik", "rihanna");
        s1.ausgeben();
    }
}
