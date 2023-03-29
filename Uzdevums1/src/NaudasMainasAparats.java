import java.util.Scanner;

public class NaudasMainasAparats {

    public static void main(String[] args) {
        Scanner mainasAparats = new Scanner(System.in);

        System.out.println("Ludzu ievadiet summu kuru velieties izmainit: ");

        int monetasPalika = mainasAparats.nextInt();

        System.out.println("Jusu monetas daudzums ir: " + monetasPalika);
        System.out.println("Jus iegusiet: ");

        int divuEuroMoneta = monetasPalika / 200;
        monetasPalika = monetasPalika % 200;

        if (divuEuroMoneta > 0){
            System.out.println(divuEuroMoneta + " <=== 2 euro moneta(s)");
        }

        int vienEuroMoneta = monetasPalika / 100;
        monetasPalika = monetasPalika % 100;
        if (vienEuroMoneta > 0){
            System.out.println(vienEuroMoneta + " <=== 1 euro moneta(s)");
        }
        int piecdesmitCentuoMoneta = monetasPalika / 50;
        monetasPalika = monetasPalika % 50;
        if (piecdesmitCentuoMoneta > 0){
            System.out.println(piecdesmitCentuoMoneta + " <=== 50 centu moneta(s)");
        }
        int divdesmitCentuMoneta = monetasPalika / 20;
        monetasPalika = monetasPalika % 20;
        if (divuEuroMoneta > 0){
            System.out.println(divdesmitCentuMoneta + " <=== 20 centu moneta(s)");
        }
        int desmitCentuoMoneta = monetasPalika / 10;
        desmitCentuoMoneta = monetasPalika % 10;
        if (desmitCentuoMoneta > 0){
            System.out.println(desmitCentuoMoneta + " <=== 10 centu moneta(s)");
        }
        int piecuCentuoMoneta = monetasPalika / 5;
        piecuCentuoMoneta = monetasPalika % 5;
        if (piecuCentuoMoneta > 0){
            System.out.println(piecuCentuoMoneta + " <=== 5 centu moneta(s)");
        }
        int divuCentuoMoneta = monetasPalika / 2;
        divuCentuoMoneta = monetasPalika % 2;
        if (desmitCentuoMoneta > 0){
            System.out.println(divuCentuoMoneta + " <=== 2 centu moneta(s)");
        }
        int vienaCentuoMoneta = monetasPalika / 1;
        vienaCentuoMoneta = monetasPalika % 10;
        if (vienEuroMoneta > 0){
            System.out.println(vienaCentuoMoneta + " <=== 1 centu moneta(s)");
        }


    }




}
