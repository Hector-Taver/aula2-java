import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ClientRegistration client = new ClientRegistration();
    Stock material = new Stock();
    Scanner input = new Scanner(System.in);

    System.out.println("Cadastrando clientes...");
    client.registerClient(input);

    System.out.println("Cadastrando roupas...");
    material.clothe.registerClothe(input);

    System.out.println("Atualizando estoque...");
    material.updateStock(input);

    System.out.println("Nome: " + client.name);
  }
}
