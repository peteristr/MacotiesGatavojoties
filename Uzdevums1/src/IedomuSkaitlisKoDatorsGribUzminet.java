import java.util.Random;
import java.util.Scanner;

public class IedomuSkaitlisKoDatorsGribUzminet {

    public static void main(String[] args) {
        Scanner skaitlaIevade = new Scanner(System.in);
        Random brivsSkaitlis = new Random();

        int maksimalaisSkaitlis = 100;
        int minimalaisSkaitlis = 1;
        int datoraMinejums;
        int speletajaAtbilde;

        System.out.println("Iedomajies skaitli no " + minimalaisSkaitlis + " lidz " + maksimalaisSkaitlis);
        System.out.println("Ievadi '1' ja skaitlis ir mazaks par datora minejumu. ");
        System.out.println("Ievadi '2' ja skaitlis ir lielaks par datora minejumu. ");
        System.out.println("Ievadi '0' ja skaitlis ir vienads par datora minejumu. ");

        do {
            datoraMinejums = brivsSkaitlis.nextInt(maksimalaisSkaitlis - minimalaisSkaitlis + 1) + minimalaisSkaitlis;
            System.out.println("Ir " + datoraMinejums + " vai pareizs skailis? ");
            speletajaAtbilde = skaitlaIevade.nextInt();
            if (speletajaAtbilde == 1) {
                maksimalaisSkaitlis = datoraMinejums - 1;
            }
            if (speletajaAtbilde == 2) {
                minimalaisSkaitlis = datoraMinejums + 1;

            }
        }while (speletajaAtbilde != 0);
            {


            System.out.println("Jums taisniba! Pareizā atbilde bija: " + datoraMinejums);
        }


    }



}

//Izveidot minēšanas spēli, kurā, jūs iedomājieties skaitli, dators mēģina to uzminēt. Konsolē jābūt iespējai ievadi't 0-dators ir uzminējis skaitli 1- iedomatais skaitlis ir lielaks 2-iedomatais skaitlis ir mazaks