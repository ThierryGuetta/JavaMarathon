package day12.task4;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> bandMembers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<String> getBandMembers() {
        return bandMembers;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addMember(String member){
        bandMembers.add(member);
    }

    public void printMembers(){
        System.out.println(name + " " + getBandMembers());
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2){
        musicBand.getBandMembers().addAll(musicBand2.getBandMembers());
    }
}
