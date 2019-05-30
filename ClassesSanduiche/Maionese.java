
package ClassesSanduiche;

public class Maionese extends SanduicheDecorator{

    public Maionese(Sanduiche sanduicheDecorado) {
        super(sanduicheDecorado);
    }
    public String mostrarIgredientes(){
        return sanduicheDecorado.mostrarIgredientes() + addMaionese();
    }
    public String addMaionese(){
        return "Maionese ";
    }
}
