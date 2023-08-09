import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contato.add(contato);
    }

    public void listarContatos(){
        for (Contato contato : contatos){
            System.out.println(contato.getNome() + " " + contato.getSobrenome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("E-mail: " + contato.getEmail());
            System.out.println("----------------------------------");
        }
    }

    public void removerContato(Contato contato){
        contatos.remove(contato);
    }



}
