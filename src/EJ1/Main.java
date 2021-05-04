package EJ1;

import java.io.File;
import java.util.Arrays;

public class Main {
    //EJERCICIO 1.- Haz un subprograma que liste el contenido del directorio actual, usado File.
    public static void main(String[] args) {
        File jesus = new File("C:\\Users\\jgarcia\\Desktop\\LM");
        System.out.println(Arrays.toString(jesus.list()));
        String[] owo = jesus.list();
        for (int i = 0; i < owo.length; i++){
            System.out.println(owo[i]);
        }
    }
}
