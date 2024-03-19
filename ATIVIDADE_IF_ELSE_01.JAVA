import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        double idade = 0.0;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Digite sua idade: ");
        idade = scanner.nextDouble();
        
        if (idade >= 18) {
            System.out.println("Voce e maior de idade");
        } else if (idade < 18 && idade > 0) {
            System.out.println("Voce e menor de idade");
    }
}
}
