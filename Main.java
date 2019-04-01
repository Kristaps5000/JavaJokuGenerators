import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Visiem patīk dzirdēt melus, izbaudi dienu!\n");

        Scanner input = new Scanner(System.in);

        boolean mainmenu = false;
        while (mainmenu == false) {
            System.out.println("Izvēlies ko gribi");
            System.out.println("Joki:1 , Komplimenti:2, Citāti:3, Iziet:4");
            String menu = input.nextLine();
            switch (menu) {
                case "1":
                    SliktiJoki.izmetJoku();
                    continue;
                case "2":
                    Komplimenti.izmetKomplimentu();
                    continue;
                case "3":
                    kvouti.izmetQuote();
                    continue;
                case "4":
                    System.out.println("Paldies par piedalīšanos! Uz redzēšanos!");
                    mainmenu = true;
                    break;
                default:
                    System.out.println("Ne to ierakstīji!");
            }
        }


    }
}
//Vai katrai tekstu ievadei būtu nepieciešama sava klase?
//Vai visas 3 izmetX metodes varētu apvienot vienā dinamiskā, ja 99% to koda ir vienādi? Kā to panākt?
//Kā nodrošināt, lai katru reizi, kad jāizvada teksts, neielasītu visu failu?
// Ielasa 1x tikai sākumā konstruktorā un tad ņem random rindu!