package com.terminal;

import java.io.IOException;
import java.util.Scanner;


public class Home {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int flag = 1;

        System.out.println("---* Wel-Come to MyGames *---");
       while (flag > 0){
           System.out.println();
           System.out.println("Choose the Game, you want to play.");
           System.out.println("\t1. Chor-Chitthi");
           System.out.println("\t2. Snake");
           System.out.println("\t3. TicTacToe");
           System.out.print("Your choice(any +ve number): ");
           flag = in.nextInt();

           switch (flag) {
               case 1 -> new ChorChitthi().play();
               case 2 -> new SnakeFrame();
               case 3 -> new TicTacToe().play();
               default -> System.out.println("Invalid choice!");
           }
           System.out.printf("+------------------------------------------+");
       }

    }
}
