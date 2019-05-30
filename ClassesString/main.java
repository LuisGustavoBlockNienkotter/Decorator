
package ClassesString;

public class main {
    public static void main(String[] args) {
        StringModificador sm = new AlteraString();
        sm = new CaixaAlta(sm);
        String s = sm.mostrarString("abcdefgh");
        sm = new SeparaCaracteres(sm);
        s = sm.mostrarString(s);
        sm = new Reverter(sm);
        s = sm.mostrarString(s);
        System.out.println(s);
        
    }
}
