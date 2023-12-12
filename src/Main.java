import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int antalscore =0;
        int antal_fel =0;

        
        System.out.println("vad är java?");
        String q1 = scanner.nextLine();
        String svar_q1=("programmeringsspråk");

        if (q1.equals(svar_q1)) {
            System.out.println(svar_q1);
            antalscore++;
        }
        else {
            System.out.println("du skiv men svaret är " +q1);
            antal_fel--;

        }
        System.out.println(svar_q1);
        System.out.println(antal_fel);
        System.out.println(antalscore);


    }
}