import java.util.Scanner;

public class ClientRegistration {
  int accountNumber;
  String name;
  String legalId;
  String phoneNumber;

  public void registerClient(Scanner input) {
    System.out.println("Nome: ");
    name = input.nextLine();
  }
}
