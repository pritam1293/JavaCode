public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("12345",100,"Pritam Behera",
                "beherapritam2003@gmail.com","8658535505");
        bobsAccount.depositFunds(120);
        bobsAccount.withdrawFunds(100);
    }
}
