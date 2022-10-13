package day12.task5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>() {
            {
                add(new Member("Bob", 16));
                add(new Member("Rob", 19));
                add(new Member("Alex", 18));
                add(new Member("Misha", 22));
                add(new Member("Neil", 27));

            }
        };
        ArrayList<Member> members2 = new ArrayList<>() {
            {
                add(new Member("Olga", 48));
                add(new Member("Andrew", 55));
                add(new Member("Igor", 19));
                add(new Member("Ivan", 23));
                add(new Member("Vova", 45));
            }};

        MusicBand LP = new MusicBand("Linkin park", 1999, members);
        MusicBand SOAD = new MusicBand("System of a Down", 1998, members2);

        LP.printMembers();
        SOAD.printMembers();

        MusicBand.transferMembers(LP, SOAD);

        LP.printMembers();
        SOAD.printMembers();
    }
}