import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Digite o primeiro numero inteiro: ");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(); 
    
    System.out.print("Digite o segundo numero inteiro: ");
    int n2 = sc.nextInt();
    int soma = n1 + n2;
    
    System.out.println("A soma dos numeros é: " + soma);
    sc.close();
  }
}