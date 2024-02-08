package ca.qc.bdeb.a13_decorateur.decorateur;

import javax.swing.*;

public class Oeufs extends Ingredient {
    public Oeufs(Plat p) {
        sur = p;
    }
    @Override
    public double getPrix() {
        return sur.getPrix() + 2.00;
    }

    @Override
    public String toString() {
        return sur.toString() + "Oeufs{2.00}";
    }
}
