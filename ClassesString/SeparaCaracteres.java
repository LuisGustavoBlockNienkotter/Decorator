
package ClassesString;

public class SeparaCaracteres extends AlteraStringDecorator{

    public SeparaCaracteres(StringModificador sm) {
        super(sm);
    }
    public String mostrarString(String string){
        return separa(string);
    }
    public String separa(String string){
        String[] s = string.split("");
        String result="";
        for (String s1 : s) {
            result+=s1+" ";
        }
        return result;
    }
}
