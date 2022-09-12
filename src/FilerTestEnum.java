import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class FilerTestEnum {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("enum.cvs");

        out.print(Color.RED);
        out.print(";");
        out.print(Color.BLUE);
        out.print(";");
        out.print(Color.YELLOW);
        out.print("\n");

        Scanner filescanner = new Scanner("enum.cvs");
        while (filescanner.hasNextLine()){
            String line = filescanner.nextLine();
            Scanner tokenScanner = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);

            String enumtext1 = tokenScanner.next();
            String enumtext2 = tokenScanner.next();
            String enumtext3 = tokenScanner.next();

            System.out.println(enumtext1);
            System.out.println(enumtext2);
            System.out.println(enumtext3);
        }
    }
}
