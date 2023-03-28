public class MasivuPiemers {

    public static void main(String[] args) {
        int[] masivs = {12, 42, 31, 43, -19, 105};

        /*   int sum = 0;

        for (int i=0; i< masivs.length; i++){
            System.out.println("Summa ir" + sum);
            System.out.println("Masiva elements" +  i + "ar vertibu" + masivs[i]);
            sum= sum+masivs[i]; //tas pats kas rakstot sum=sum+masivs [i];

            if (sum>20){
                break;
            }


        }
      // ir noteikta cilpa un šis gadijums ir saskaitits katrs elements ar nosacijumu lidz sasniedz 20
    */
        int min = masivs[0];
/*šeit nosaku ar for kad zinām cik tieši reizes ir jāizpilda ir jālieto kods for.
       int i = 0 nosaka ar kuru masīvs sākas elementu
       i <masivs.length nosaka nosacījumu, kurš jāpārbauda
       i++ nosaka ,ka masīva elements pieaug par vienu reizi*/
        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Masiva elements " + i + "ar vertibu" + masivs[i]);
            if (min > masivs[i]){
                min = masivs[i];

            }
            System.out.println("Musu minimalais skaitliis ir " + min);
        }
//Šajā masīvā tiek meklēts minimālais skaitlis no masīva



    }
}

