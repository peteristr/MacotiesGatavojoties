import java.util.Random;

public class UzdevumsRandom {

    public static void main(String[] args) {
        Random random = new Random();

        //ģenerēs skaitli no 1 līdz 10
        int skaitlis1 = random.nextInt(10) + 1;
        int skaitlis2 = random.nextInt(20) + 10;
        int skaitlis3 = random.nextInt(30) + 20;
        System.out.println(skaitlis1);
        System.out.println(skaitlis2);
        System.out.println(skaitlis3);
    }


}
