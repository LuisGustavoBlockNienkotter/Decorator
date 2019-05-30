
package ClassesSanduiche;

public class main {
    public static void main(String[] args) {
        Sanduiche s = new Maionese(new Tomate(new SanduichePersonalizado()));
        s = new Queijo(s);
        System.out.println(s.mostrarIgredientes());
        
    }
}
