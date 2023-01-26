import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(methodToFindAge(scanner.nextInt()));
    }
    public static int methodToFindAge(int scan){
        int myAge = 19;
        int myBirthYear = 2004;
        if(scan != myBirthYear){
            System.out.println("Your age will be: ");
            return scan-myBirthYear;
        } else if (scan == myBirthYear) {
            System.out.println("baby you just burned");
        }else if(scan<myBirthYear){
            System.out.println("Are you kidding me?");
        }
        return 0;
    }
}