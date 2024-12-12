import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        //System.out.println(esBalanceado("{([()])}"));
    }
    /* public static boolean esBalanceado(String cadena){
        boolean balanceado = false;
        char character;
        char ultimo;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            //Si son apertura los pongo en la pila
            character = cadena.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                pila.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                ultimo = pila.pop();
                //Saco de la pila y compruebo si es '['. Si no es, acabo con false
                if (ultimo != '('){
                    return false;
                }
            } //else if () {
                
            }

        }


        return true;
    }*/
}
