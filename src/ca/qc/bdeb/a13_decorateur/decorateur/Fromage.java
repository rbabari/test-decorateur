package ca.qc.bdeb.a13_decorateur.decorateur;

/**
 * Class de Fromage
 */
public class Fromage extends Ingredient {
    public Fromage(Plat p) {
        sur = p;
    }

    /**
     * @return prix
     */
    @Override
    public double getPrix() {
        return sur.getPrix() + 2.75;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return sur.toString() +"Fromage{2.75}";
    }
}
