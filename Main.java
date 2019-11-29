import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Game test = new Game();
        System.out.println("Imagine a number between 1 and 30.\nI will try to guess it.\nPress ENTER to start, Q to quit.");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        while(!start.equalsIgnoreCase("Q"))
        {
            test.number();
            System.out.println("\nImagine a number between 1 and 30.\nI will try to guess it\nPress ENTER to start, Q to quit.");
            sc = new Scanner(System.in);
            start = sc.nextLine();
        }
    }
}
