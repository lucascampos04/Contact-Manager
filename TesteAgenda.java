import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bem-vindo à Agenda de Contatos!");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("E-mail: ");
            String email = scanner.nextLine();

            Contato novoContato = new Contato(nome, sobrenome, telefone, email);
            agenda.adicionarContato(novoContato);

            System.out.println("Contato adicionado com sucesso!");

            agenda.listarContatos();

        }
        finally {
            scanner.close();
        }
    }
}