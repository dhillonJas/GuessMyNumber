import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Game test = new Game();
        System.out.println("Imagine a number between 1 and 30.\nI will try to guess it. \nPress ENTER");
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        test.number();

    }
}
