import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();
        numeros.add("58975");
        numeros.add("25894");
        numeros.add("52985");
        numeros.add("98598");
    }
    /*public static Map<String, Integer > terminaciones(ArrayList<String> numeros) {
        Map<String, Integer> mapa = new HashMap<>();
        Character ultimo;
        Integer cont;
        for (String numero : numeros) {
            if (cont == null) {
                ultimo = numero.charAt(mapa.get(numero.length()-1));
                cont = mapa.put(ultimo, 1);
            }else {

            }

        }


        return mapa;
    }*/
}
