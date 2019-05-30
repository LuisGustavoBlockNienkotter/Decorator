
package ClassesSanduiche;

public abstract class SanduicheDecorator implements Sanduiche{
    protected Sanduiche sanduicheDecorado;
    public SanduicheDecorator(Sanduiche sanduicheDecorado) {
        this.sanduicheDecorado = sanduicheDecorado;
    }
    
}
