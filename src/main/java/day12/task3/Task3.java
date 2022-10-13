package day12.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb = new MusicBand("Killers", 1955);
        MusicBand mb1 = new MusicBand("Animals", 1965);
        MusicBand mb2 = new MusicBand("Cruels", 1980);
        MusicBand mb3 = new MusicBand("Queen", 1999);
        MusicBand mb4 = new MusicBand("Pink Floyd", 1987);
        MusicBand mb5 = new MusicBand("Linkin Park", 2001);
        MusicBand mb6 = new MusicBand("SOAD", 2003);
        MusicBand mb7 = new MusicBand("Disturbed", 2025);
        MusicBand mb8 = new MusicBand("Hollywood Undead", 1988);
        MusicBand mb9 = new MusicBand("Placebo", 2005);

        ArrayList<MusicBand> mbList = new ArrayList<>() {
            {
                add(mb);
                add(mb1);
                add(mb2);
                add(mb3);
                add(mb4);
                add(mb5);
                add(mb6);
                add(mb7);
                add(mb8);
                add(mb9);
            }
        };
        Collections.shuffle(mbList);

        System.out.println(mbList);
        System.out.println(groupsAfter2000(mbList));
    }

    public static ArrayList<MusicBand> groupsAfter2000(ArrayList<MusicBand> bands) {
        ArrayList<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand e : bands) {
            if (e.getYear() > 2000) groupsAfter2000.add(e);
        }
        return groupsAfter2000;
    }
}

