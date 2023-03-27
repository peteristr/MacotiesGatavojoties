public class Skalums {
    public static void main(String[] args) {
        int skalums = 100;
        if (skalums < 40) {
            System.out.println("Vajs");
        }
        else if (skalums>39 && skalums <70){
            System.out.println("Merens");
        }
        else if (skalums>69 && skalums <100){
            System.out.println("Skals");
        }
        else if (skalums>99 && skalums <130){
            System.out.println("Loti skals");
        }
        else if (skalums>129 ){
            System.out.println("Sapigi");
        }



    }
}
