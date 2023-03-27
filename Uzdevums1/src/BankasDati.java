public class BankasDati {
    public String bankName = "Citadele Banka";
    public String bankName2;
    public String paymentProcessor = "Master Card";
    public long cardNumber = 655656556;
    public int secirityNumber = 111;

    public void getBalance(){
        System.out.println("Bilance ir 1 milj");
    }

    public void depositFunds(){
        System.out.println("Ir iemaksats papildus miljons");
    }

    public void withdrawLidzeklu(){
        System.out.println("Jūs esiet Izmaksājis");

    }

}
//Strings ir references tipa un tas ir jāraksta ar lielo burtu