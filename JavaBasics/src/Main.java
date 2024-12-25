import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }
        catch(NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi , What's your name? ");
        System.out.println("Hi " + name + ", Thank you for the help.");
        String yearOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(yearOfBirth);
        System.out.println("So you are " + age + " years old");
        System.out.println("It was nice to meet you , Have a good day!");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi , What's your name? ");
        System.out.println("Hi what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thank you for the help.");

//        String yearOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter the year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }
            catch(NumberFormatException badUserData) {
                System.out.println("Characters are not allowed!!! Try again.");
            }
//            String yearOfBirth = scanner.nextLine();
//            age = currentYear - Integer.parseInt(yearOfBirth);
        } while(!validDOB);

//        int age = currentYear - Integer.parseInt(yearOfBirth);

        System.out.println("So you are " + age + " years old;");
//        System.out.println("It was nice to meet you , Have a good day!");
        return "";
    }

    public static int checkData(int currentYear , String yearOfBirth) {
        int dob = Integer.parseInt(yearOfBirth);
        int minimumYear = currentYear - 125;
        if(dob < minimumYear || dob > currentYear)  return -1;
        return currentYear - dob;
    }
}
