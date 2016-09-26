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
public class Calculator {

    Reader reader = new Reader();

    public void start() {
        int calculations = 0;
        while (true) {
            String command = reader.readString("Command: ");
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            }
        }
        statistics(calculations);
    }

    private void sum() {
        int value1 = reader.readInteger("Value 1: ");
        int value2 = reader.readInteger("Value 2: ");

        System.out.println("Sum of the two values: " + (value1 + value2));
        
    }

    private void product() {
        int value1 = reader.readInteger("Value 1: ");
        int value2 = reader.readInteger("Value 2: ");

        System.out.println("Product of the two values: " + (value1 * value2));
    }

    private void difference() {

        int value1 = reader.readInteger("Value 1: ");
        int value2 = reader.readInteger("Value 2: ");
        System.out.println("Difference of the two values: " + (value1 - value2));
    }

    private void statistics(int calculations) {
        System.out.println("Calculations done: "+calculations);
    }
}
