
package ClassesSanduiche;

public class Queijo extends SanduicheDecorator{

    public Queijo(Sanduiche sanduicheDecorado) {
        super(sanduicheDecorado);
    }
    public String mostrarIgredientes(){
        return sanduicheDecorado.mostrarIgredientes() + addQueijo();
    }
    public String addQueijo(){
        return "Queijo ";
    }
}
