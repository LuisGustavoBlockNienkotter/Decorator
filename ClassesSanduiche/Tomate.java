
package ClassesSanduiche;

public class Tomate extends SanduicheDecorator{

    public Tomate(Sanduiche sanduicheDecorado) {
        super(sanduicheDecorado);
    }
    public String mostrarIgredientes(){
        return sanduicheDecorado.mostrarIgredientes() + addTomate();
    }
    public String addTomate(){
        return "Tomate ";
    }
}
