/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BINGO;

/**
 *
 * @author Administrator
 */
public class Konstruktor {
    String verse0, verse1, verse2; 

    public Konstruktor() {
        verse0 = "\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.";
        verse1 = "(clap)";
        verse2 = "And Bingo was his name-o.";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Konstruktor verse = new Konstruktor();

        for (int i = 0; i <= 5; i++) {
            System.out.println(verse.verse0);
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 5:
                        System.out.print(" " + verse.verse1 + " ");
                    case 4:
                        System.out.print(" " + verse.verse1 + " ");
                    case 3:
                        System.out.print(" " + verse.verse1 + " ");
                    case 2:
                        System.out.print(" " + verse.verse1 + " ");
                    case 1:
                        System.out.print(verse.verse1 + " ");
                }

                switch (i) {
                    case 0:
                        System.out.print("B ");
                    case 1:
                        System.out.print("I ");
                    case 2:
                        System.out.print("N ");
                    case 3:
                        System.out.print("G ");
                    case 4:
                        System.out.print("O ");
                }
                System.out.println(" ");
            }
            System.out.println(verse.verse2);
        }
    }
    
}
