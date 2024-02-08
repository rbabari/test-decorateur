package ca.qc.bdeb.a13_decorateur.decorateur;

public class Olive extends Ingredient {
    public Olive(Plat p) {
        sur = p;
    }
    @Override
    public double getPrix() {
        return sur.getPrix() + 0.75;
    }
    @Override
    public String toString() {
        return sur.toString() + "Olive{0.75}";
    }
}
