public class SecondClass {
    public static void main(String[] args) {
        int yearofbirth = 2003;
        readinginput(yearofbirth);
//        int num = System.console().readLIne("Enter a number ");
//        System.out.println(num);
    }

    public static String readinginput(int yearofbirth) {
        String name = System.console().readLine();
//        System.out.println("So, your name is " + name);
        String curryear = System.console().readLine();
        int age = Integer.parseInt(curryear) - yearofbirth;
        System.out.println("Your name is " + name + ", and your age is " + age);
        return "";
    }
}
