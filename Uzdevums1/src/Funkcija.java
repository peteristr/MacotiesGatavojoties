public class Funkcija {

    public static void main(String[] args) {

        //Uztaisa jaunu objektu
        BankasDati bankasDati = new BankasDati();
        //Izprintē konsole bankName mainiģo no BankasDati objekta
        System.out.println(bankasDati.bankName);
        //Izprintē konsole bankName mainiģo no BankasDati objekta bez vērtības
        System.out.println(bankasDati.bankName2);
        System.out.println(bankasDati.cardNumber);
        System.out.println(bankasDati.paymentProcessor);
        System.out.println(bankasDati.secirityNumber);


        //Izsaukt metodi getBalance on BankasDati klases

        bankasDati.getBalance();
        bankasDati.depositFunds();
        bankasDati.withdrawLidzeklu();





    }



}
//metodes rakstišāna  - public int sum(int a, int b) { int result = a+b; return = result
//Public ir piekļuves veids kad var izsaukt metodi no jebkura koda gabala
//Private ir piekļuves veikds, kad var strādāt tajā pašā klasē ar metodi

//void (a