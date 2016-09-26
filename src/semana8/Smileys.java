/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author julia
 */
public class Smileys {

    public static void printWithSmileys(String characterString) {
        String toSurround = characterString;
        if (characterString.length() % 2 != 0) {
            toSurround += " ";
        }

        for (int i = 0; i < toSurround.length()/2 + 3; i++) {
            System.out.print(":)");
        }
        System.out.println("");

        System.out.println(":)" + " " + toSurround + " " + ":)");

        for (int i = 0; i < toSurround.length()/2 + 3; i++) {
            System.out.print(":)");
        }
        System.out.println("");

    }
}
