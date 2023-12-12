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
            antalscore++;
        }
        else {
            antal_fel--;

        }
        System.out.println(svar_q1);


        System.out.println("vad är c++?");
        String q2 = scanner.nextLine();
        String svar_q2=("programmeringsspråk");

        if (q2.equals(svar_q2)) {
            antalscore++;
        }
        else {
            antal_fel--;

        }


        System.out.println(" ");
        String q3 = scanner.nextLine();
        String svar_q3=(" ");

        if (q3.equals(svar_q3)) {
            antalscore++;
        }
        else {
            antal_fel--;

        }
        System.out.println(" ");
        String q4 = scanner.nextLine();
        String svar_q4=(" ");

        if (q4.equals(svar_q4)) {
            antalscore++;
        }
        else {
            antal_fel--;

        }



        System.out.println(svar_q1);
        System.out.println("antal_fel  "+antal_fel);
        System.out.println("antal_rätt"+ antalscore);


    }
}