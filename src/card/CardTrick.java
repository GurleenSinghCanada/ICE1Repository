/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;



import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        int count=0;
        Card[] magicHand = new Card[7];
        Scanner inp = new Scanner(System.in);
        System.out.println("Please choose the Value and Suit");
        int userValue = inp.nextInt();
        String userSuit = inp.next();

        for (int i = 0; i < magicHand.length; i++) {
            Random rndm = new Random();
            Card c = new Card();
            c.setValue(rndm.nextInt(1, 14));
            c.setSuit(Card.SUITS[rndm.nextInt(0, 4)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue()+" " + magicHand[i].getSuit());
            if (userValue == (magicHand[i].getValue()) && userSuit.equals( magicHand[i].getSuit())) {
                count+=1;
            }
        }
        if (count>0){
        System.out.println("Hurrrraaaay!!!!, You guessed it right!!");}
        else{
        System.out.println("Sorry ,Better Luck next time");

    }
}
}