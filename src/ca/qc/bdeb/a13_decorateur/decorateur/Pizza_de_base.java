package ca.qc.bdeb.a13_decorateur.decorateur;

public class Pizza_de_base implements Plat{
    @Override
    public double getPrix() {
        return 5.00;
    }

    @Override
    public String toString() {
        return "Pizza_de_base{5.00}";
    }
}
