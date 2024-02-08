package ca.qc.bdeb.a13_decorateur.decorateur;

public class Pizza_de_base implements Plat{
    /**
     * Methode getPrix pour calculer le prix en fonction ...
     * @return un double qui sera le prix ...
     */
    @Override
    public double getPrix() {
        return 5.00;
    }

    @Override
    public String toString() {
        return "Pizza_de_base{5.00}";
    }
}
