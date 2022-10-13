package day12.task5;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<Member> bandMembers;

    public void setBandMembers(ArrayList<Member> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public ArrayList<Member> getBandMembers() {
        return bandMembers;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void printMembers(){
        System.out.println(name + " " + getBandMembers());
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2){
        musicBand.getBandMembers().addAll(musicBand2.getBandMembers());
    }
}
