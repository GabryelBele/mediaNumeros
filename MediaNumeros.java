import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MediaNumeros {
    public static void main(String[] args) {
        String fileName = "numeros.txt";
        List<Integer> numeros = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numeros.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!numeros.isEmpty()) {
            int soma = 0;
            for (int numero : numeros) {
                soma += numero;
            }
            double media = (double) soma / numeros.size();
            System.out.println("A média dos números é: " + media);
        } else {
            System.out.println("A lista de números está vazia.");
        }
    }
}
