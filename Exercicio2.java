package Lista3;
import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {

static String nome;
static String endereco;
static String telefone;



public Pessoa(String nome, String endereco, String telefone) {
    Pessoa.nome = nome;
    Pessoa.endereco = endereco;
    Pessoa.telefone = telefone;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    Pessoa.nome = nome;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    Pessoa.endereco = endereco;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    Pessoa.telefone = telefone;
}

@Override
public String toString() {
    return "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone;
}

public void remove() {
	// TODO Auto-generated method stub
	
}}

		class Operacoes extends Pessoa {

		public Operacoes() {
				super(nome, endereco, telefone);
				// TODO Auto-generated constructor stub
			}

		public ArrayList<Pessoa> listaPessoa = new ArrayList<>();

		public void inserePessoa(Pessoa usuario) {
		    listaPessoa.add(usuario);
		}

		public String consultaPessoa() {
		    for (@SuppressWarnings("unused") Pessoa c: this.listaPessoa) {
		        System.out.println(listaPessoa.get(0));
		    }
		    return "oi";
		}

		public String deletaPessoa(String alvo) {
		    for (Pessoa c: this.listaPessoa) {
		       if (c.getNome().equals(alvo)) c.remove();
		    }
			return alvo;}
		}
		    public class Exercicio2 {
				public static void main(String[] args) {

				    Scanner entrada = new Scanner(System.in);
				    Operacoes acao = new Operacoes();

				    int op;

				    do {
				        System.out.println("[1] Inserir");
				        System.out.println("[2] Consultar");
				        System.out.println("[3] Remover");
				        System.out.println("[4] Sair");
				        System.out.print("Opção desejada: ");
				        op = entrada.nextInt();
				        switch (op) {
				            case 1:
				                Pessoa usuario = new Pessoa(null, null, null);
				                entrada.nextLine();
				                System.out.print("Nome: ");
				                usuario.setNome(entrada.nextLine());
				                System.out.print("Endereço: ");
				                usuario.setEndereco(entrada.nextLine());
				                System.out.print("Telefone: ");
				                usuario.setTelefone(entrada.nextLine());
				                acao.inserePessoa(usuario);
				                System.out.println(usuario);
				                break;
				            case 2:
				                acao.consultaPessoa();
				                break;
				            case 3:
				                break;
				        }
				    } while (op != 4);
				
				entrada.close();
				}}

		