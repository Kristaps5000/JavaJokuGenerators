import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SliktiJoki {
    public static void izmetJoku() {
        System.out.println("Tava diena noteikti nav tik slikta, kā šie joki\n");

            List<String> saraksts = new ArrayList<String>();
            Scanner input = new Scanner(System.in);
            try {
                BufferedReader br = new BufferedReader(new FileReader("jokes.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    saraksts.add(line);
                }
            } catch (IOException e) {
                System.out.println("Neizdevās ielasīt failu! " + e.getMessage());
            }

            boolean chosen = false;
            int kkas;
            while (chosen == false) {
                Collections.shuffle(saraksts);
                System.out.println(saraksts.get(1));
                System.out.println("Vai saņemt vēl jokus?"); // aiziet uz sākuma izvēli
                System.out.println("1) Jā");
                System.out.println("2) Nē");
                System.out.print("Ievade:");
                kkas = input.nextInt();
                if (kkas == 2) {
                    chosen = true;
                }
            }
    }
}

