package ca.qc.bdeb.a13_decorateur.decorateur;

public class Fromage extends Ingredient {
    public Fromage(Plat p) {
        sur = p;
    }
    @Override
    public double getPrix() {
        return sur.getPrix() + 2.75;
    }

    @Override
    public String toString() {
        return sur.toString() +"Fromage{2.75}";
    }
}
