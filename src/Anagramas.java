import java.io.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("path-to-file"));
        String line;
        while ((line = reader.readLine())!=null) {
            //Trabajar con line
        }
        reader.close();
    }
}

