import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class FilerTest {

    public static void main(String[] args) throws FileNotFoundException {
        FilerTest filerTest = new FilerTest();
        Color color1 = Color.BLUE;
        Color color2 = Color.RED;
        Color color3 = Color.YELLOW;

        int[] array1 = {1,2,3,4};
        ArrayList<Integer> arrayliste = new ArrayList<>();
        arrayliste.add(1);
        arrayliste.add(2);
        arrayliste.add(3);

        //1;2;3;4
        //char index0 = (char)array1[0];
        //char index1 = (char)array1[1];
        //char index2 = (char)array1[2];

        String str = "" + array1[0]+";" + array1[1]+";" + array1[2]+";" + array1[3];
        System.out.println(str);

        String indexx = String.valueOf(array1[0]);
        String indexxx = String.valueOf(array1[1]);
        String indexxxx = String.valueOf(array1[2]);


        int indexint0 = array1[0];
        char index01 = Character.forDigit(array1[0],10);
        char index11 = Character.forDigit(array1[1],10);
        char index21 = Character.forDigit(array1[2],10);

        PrintStream out = new PrintStream("filtest.csv"); //opretter fil første gang

        System.out.println(Arrays.toString(array1));

        out.print("hej");
        out.print(";");
        out.print(color1);
        out.print(";");
        out.print(str);
        out.print(";");
        out.print(color2);
        out.print(";");
        out.print(color3);
        out.print("\n");

        //load fil:
        Scanner filescanner = new Scanner("filtest.csv");
        while (filescanner.hasNextLine()){
            String line = filescanner.nextLine();
            Scanner tokenScanner = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);

            String enumtext = tokenScanner.next();
            System.out.println(enumtext);
            String ert = tokenScanner.next();
            System.out.println(ert);


            int[] array2 = new int[4];

            String index0 = tokenScanner.next();

            array2[0] = Integer.parseInt(index0);
            int index1 = tokenScanner.nextInt();
            array2[1] = index1;
            int index2 = tokenScanner.nextInt();
            array2[2] = index2;
            int index3 = tokenScanner.nextInt();
            array2[3] = index3;
            String hej = tokenScanner.nextLine();

            System.out.println(Arrays.toString(array2));

            //array2 = filerTest.createArrayFromFile(arrayText);

            int[] array3 = array1;
            System.out.println(Arrays.toString(array3));
        }
    }
    //public int[] createArrayFromFile(String arrayText){}

}
