public class Main {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            LPAStudent s = new LPAStudent("PB232" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "12/09/2003","Java Masterclass");
            System.out.println(s);
        }
    }
}
