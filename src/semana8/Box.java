/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Box implements ToBeStored {

    double maxWeight;
    int currentThings = 0;
    ArrayList<ToBeStored> content = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored thing) {
        if (thing.weight() + this.weight() > maxWeight) {
            return;
        }

        content.add(thing);
        this.currentThings++;
    }

    @Override
    public String toString() {
        return "Box: "
                + currentThings + " things, "
                + "total weight " + weight() + " kg.";
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored x : content) {
            weight += x.weight();
        }

        return weight;
    }
}
