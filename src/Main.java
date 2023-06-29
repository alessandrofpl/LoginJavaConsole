// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String user = "alessandrofpl";
        final String pass = "admin";
        String login, senha;
        boolean logado;
        int tentativa =1;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite o usuário: ");
            login = entrada.nextLine();
            System.out.println("Digite a Senha: ");
            senha = entrada.nextLine();
            if (login.equals(user) && senha.equals(pass)) {
                System.out.println("Login Realizado Com Sucesso!");
                logado = true;

            } else {
                System.out.println("Verifique os Parametro!");
                logado = false;
                tentativa++;
            }
        }while (!logado && tentativa <=3);
        if (tentativa>3){
            System.out.println("Conta Bloqueada!");
        }
    }
}