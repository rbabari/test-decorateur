package ca.qc.bdeb.a13_decorateur.test_decorateur;
import ca.qc.bdeb.a13_decorateur.decorateur.*;

/**
 *Class Main
 */
public class Main {

    /**
     * @param args liste des parametre lors de l'execution avec console
     */
    public static void main(String[] args) {

// interface plat getPrix()
// pizza de base implements Plat getPrix(){return 5.00; }
// abstract class Ingrdient implements Plat  : protected Plat sur;
// Oeufs extends Ingredient ::: sur = paramatre donnée au contructeur

        Plat p1 =new Pizza_de_base();
        System.out.println(p1.toString() + p1.getPrix());

        Plat p2 = new Oeufs(new Fromage(new Ognion(new Pizza_de_base())));
        System.out.println(p2.toString() + p2.getPrix());

        Plat p3 = new Oeufs(new Oeufs(new Olive(new Fromage(new Pizza_de_base()))));
        System.out.println(p3.toString() + p3.getPrix());
    }
}
