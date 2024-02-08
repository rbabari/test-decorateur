package ca.qc.bdeb.a13_decorateur.decorateur;

public class Olive extends Ingredient {

    /**
     * @param p est un plat qu'on rajoute a la pizza ou a l'ingredient ...
     */
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
