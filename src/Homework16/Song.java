package Homework16;

import java.util.Objects;

public class Song {
    public static void main(String[] args){
        Song song1 = new Song("Set fire to the rain","Adele",4);
        Song song2 = new Song("Set fire to the rain","Adele",4);
        System.out.println("Song 1 equals Song 2: " + song1.equals(song2));
        System.out.println("Hashcodes are equal (Song 1 and Song 2): " + (song1.hashCode() == song2.hashCode()));
    }

    private String title;
    private String artist;
    private int length;

    public Song(String title,String artist,int length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Song))
            return false;
        Song song = (Song) o;
        return Objects.equals(this.title,song.title) && Objects.equals(this.artist, song.artist) ;
    }



    @Override

    public int hashCode(){
        return Objects.hash(title,artist);
    }
}
