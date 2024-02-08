package ca.qc.bdeb.a13_decorateur.decorateur;

/**
 * Ognion
 */
public class Ognion extends Ingredient {
    public Ognion(Plat p) {
        sur = p;
    }
    @Override
    public double getPrix() {
        return sur.getPrix() + 1.50;
    }
    @Override
    public String toString() {
        return sur.toString() + "Ognion{1.50}";
    }
}
