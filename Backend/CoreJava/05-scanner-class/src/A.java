import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int newVariable = scanner.nextInt();
        scanner.nextLine();
        // scanner.close();
        System.out.println("Enter a sentence:");
        String newWord = scanner.nextLine();
        scanner.close();
        System.out.println("Number you entered:");
        System.out.println(newVariable);
        System.out.println("String you entered:");
        System.out.println(newWord);
    }
}