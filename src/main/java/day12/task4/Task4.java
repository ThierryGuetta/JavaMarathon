package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand LP = new MusicBand("Linkin park", 1999);
        MusicBand SOAD = new MusicBand("System of a Down", 1998);

        LP.addMember("Bob");
        LP.addMember("Rob");
        LP.addMember("Max");
        LP.addMember("Alex");
        LP.addMember("Iven");
        SOAD.addMember("Igor");
        SOAD.addMember("Pasha");
        SOAD.addMember("Oleg");
        SOAD.addMember("Gesha");
        SOAD.addMember("Vova");

        LP.printMembers();
        SOAD.printMembers();

        MusicBand.transferMembers(LP, SOAD);

        LP.printMembers();
    }
}
