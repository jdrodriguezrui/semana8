/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Reader {
    Scanner reader = new Scanner(System.in);
    
    public String readString(String question)
    {
        System.out.println(question);
        return reader.nextLine();
    }
    
    public int readInteger(String question){
        System.out.println(question);
        int number = Integer.parseInt(reader.nextLine());
        return number;
    }
}
