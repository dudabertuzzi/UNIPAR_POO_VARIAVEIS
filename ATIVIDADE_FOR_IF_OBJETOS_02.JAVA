import java.util.Scanner;

public class PatinhosXuxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número inicial de patinhos: ");
        int n = scanner.nextInt();
        
        System.out.println();
        while (n > 0) {
            if (n == 1) {
                System.out.println("1 patinho foi passear");
            } else {
                System.out.println(n + " patinhos foram passear");
            }
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println();
            
            n--;
            
            if (n > 0) {
                if (n == 1) {
                    System.out.println("Mas só 1 patinho voltou de lá");
                } else {
                    System.out.println("Mas só " + n + " patinhos voltaram de lá");
                }
                System.out.println();
            } else {
                System.out.println("A mamãe patinha foi procurar");
                System.out.println("Além das montanhas");
                System.out.println("Na beira do mar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("E todos os patinhos voltaram de lá.");
            }
        }
        
        scanner.close();
    }
}
