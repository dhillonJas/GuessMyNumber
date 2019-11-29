import java.util.Scanner;

public class Game
{
    private int[] card1;
    private int[] card2;
    private int[] card3;
    private int[] card4;
    private int[] card5;

    public Game()
    {
        card1 = new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
        card2 = new int[]{2,3,6,7,10,11,14,15,18,19,22,23,26,27,30};
        card3 = new int[]{4,5,6,7,12,13,14,15,20,21,22,23,28,29,30};
        card4 = new int[]{8,9,10,11,12,13,14,15,24,25,26,27,28,29,30};
        card5 = new int[]{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    }

    public void number()
    {
        int number = 0;
        boolean c1 = check(card1);
        boolean c2 = check(card2);
        boolean c3 = check(card3);
        boolean c4 = check(card4);
        boolean c5 = check(card5);
        if(c1) number += card1[0];
        if(c2) number += card2[0];
        if(c3) number += card3[0];
        if(c4) number += card4[0];
        if(c5) number += card5[0];
        if(c1 && c2 && c3 && c4 && c5 || !c1 && !c2 && !c3 && !c4 && !c5)
        {
            System.out.println("Do you even maths bruh??");
        }
        else
        System.out.println("Your number is: " + number);
    }


    public boolean check(int[] card)
    {
        display(card);
        System.out.println("Is your number in this line?\n(Type Yes or No)");
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        if(r.equalsIgnoreCase("yes"))
            return true;
        else if(r.equalsIgnoreCase("no"))
            return false;
        else
        {
            System.out.println("Not valid!!");
            return check(card);
        }
    }

    public void display(int[] card)
    {
        System.out.println();
        for (int i = 0; i < card.length; i++)
        {
            System.out.print(card[i] + " ");
        }
        System.out.println();
    }
}
