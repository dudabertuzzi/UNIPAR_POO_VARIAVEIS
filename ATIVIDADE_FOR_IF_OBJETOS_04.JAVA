import java.util.Scanner;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[20];
        int entre0e100 = 0;
        int entre101e200 = 0;
        int maioresDe200 = 0;
        
        // Lendo os 20 números
        System.out.println("Digite os 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Contando quantos estão entre 0 e 100, entre 101 e 200, e maiores de 200
        for (int numero : numeros) {
            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else if (numero > 200) {
                maioresDe200++;
            }
        }
        
        // Exibindo os resultados
        System.out.println("Quantidade de números entre 0 e 100: " + entre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + entre101e200);
        System.out.println("Quantidade de números maiores de 200: " + maioresDe200);
        
        scanner.close();
    }
}
