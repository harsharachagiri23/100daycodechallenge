package Arrays;

import java.util.Arrays;
public class Dvdarray {

    public String name;
    public String Director;

    public int releaseYear;

    public Dvdarray(String name,String Director, int releaseYear ){

        this.name = name;
        this.Director = Director;
        this.releaseYear = releaseYear;

    }

    public String toString(){

        return this.name + ", directed by " + this.Director + ", released in " + this.releaseYear;

    }

    public static void main(String[] args){

        Dvdarray[] dvdstore = new Dvdarray[10];
        dvdstore[0] = new Dvdarray("Harrypotter1", "Chris Columbus", 1998);
        dvdstore[1] = new Dvdarray("Avtar", "JamesCameron", 1998);
        dvdstore[2] = new Dvdarray("Titanic", "JamesCameron", 1998);

        for(Dvdarray dvd: dvdstore){
            if(dvd != null){
                System.out.println(dvd.toString());
            }
        }

    }
}






