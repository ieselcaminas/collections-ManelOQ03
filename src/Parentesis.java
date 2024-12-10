import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("{([()])}"));
    }
    public static boolean esBalanceado(String cadena){
        boolean balanceado = false;
        char character;
        char ultimo;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            //Si son apertura los pongo en la pila
            character = cadena.charAt(i);
        }


        return true;
    }
}
