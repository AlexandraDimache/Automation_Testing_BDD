// importam librarii externe
import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main( String args[] ) {

        // generam un numar random intre 0 si 2 )
        Random rand = new Random();
        int numar_random = rand.nextInt(2);

        // atribuim piatra, hartie, foarfeca in f de numarul Random
        String computer = "";
        if (numar_random == 0) {
            computer = "piatra";
        }
        if (numar_random == 1) {
            computer = "hartie";
        }
        if (numar_random == 1) {
            computer = "foarfeca";
        }

        // luam optiunea de la utilizator
        Scanner sc = new Scanner(System.in);
        System.out.println("Alege piatra, hartie, foarfeca");
        String utilizator = sc.next();

        // afisam ce a ales computer-ul
        System.out.println("Calculatorul a ales " + computer);

        // evaluam posibilele situatii
        if (computer.equals(utilizator)) {
            System.out.println("Egalitate! Ati ales la fel");
        }
        if (computer.equals("piatra") && utilizator.equals("hartie")) {
            System.out.println("Ai castigat! Hartia infasoara piatra");
        }
        if (computer.equals("piatra") && utilizator.equals("foarfeca")) {
            System.out.println("Ai pierdut! Piatra strica foarfeca");
        }
        if (computer.equals("hartie") && utilizator.equals("piatra")) {
            System.out.println("Ai pierdut! Hartia infasoara piatra");
        }
        if (computer.equals("hartie") && utilizator.equals("foarfeca")) {
            System.out.println("Ai castigat! Foarfeca taie hartia");
        }
        if (computer.equals("foarfeca") && utilizator.equals("piatra")) {
            System.out.println("Ai castigat! Piatra strica foarfeca");
        }
        if (computer.equals("foarfeca") && utilizator.equals("hartie")) {
            System.out.println("Ai pierdut! Foarfeca taie hartia");
        }
    }
}


