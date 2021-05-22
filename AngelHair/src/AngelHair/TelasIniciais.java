package AngelHair;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelasIniciais {
	
	public static void limpaTela() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
	
	public static void menuTelaInicial(Cliente cliente, Cabelo cabelo, List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos) {
		
		Scanner ler = new Scanner(System.in);
		int entrada;
		boolean menu = true;
		
		TelasIniciais.limpaTela();
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("             ANGEL HAIR");
			System.out.println("--------------------------------------");
			System.out.println("  Digite a opção desejada:");
			System.out.println("  1 - Login");
			System.out.println("  2 - Cadastrar usuário *implementado para cliente e clinica*");
			System.out.println("  3 - Sair");
			System.out.println("--------------------------------------");
			entrada = ler.nextInt();
			
			switch(entrada) {
			case 1: 
				TelasIniciais.menuLogin(cliente, cabelo, clientes, clinicas, cabelos);
				break;
			case 2:
				TelasIniciais.menuCadastrarUsuario(clientes, clinicas, cabelos);
				break;
			case 3:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um comando válido do menu.");
			}
		} while (menu);
	}
	
	public static void menuLogin(Cliente cliente, Cabelo cabelo, List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos) {
		
		Scanner ler = new Scanner(System.in);
		int entrada;
		boolean menu = true;
		
		TelasIniciais.limpaTela();

		do {
			System.out.println("--------------------------------------");
			System.out.println("             ANGEL HAIR");
			System.out.println("               LOGIN");
			System.out.println("--------------------------------------");
			System.out.println("  Digite a opção desejada:");
			System.out.println("  1 - Login Cliente");
			System.out.println("  2 - Login Clínica");
			System.out.println("  3 - Voltar");
			System.out.println("  4 - Sair");
			System.out.println("--------------------------------------");
			entrada = ler.nextInt();
			
			switch(entrada) {
			case 1:
				TelasIniciais.loginCliente(cliente, cabelo, clientes, clinicas, cabelos);
				break;
			case 2:
				TelasIniciais.loginClinica(clientes, clinicas);
				break;
			case 3:
				TelasIniciais.menuTelaInicial(cliente, cabelo, clientes, clinicas, cabelos);
				break;
			case 4:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um comando válido do menu.");
			}
		} while (menu);
	}
	
	public static void loginCliente(Cliente cliente, Cabelo cabelo, List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos) {
		Scanner ler = new Scanner(System.in);
		String login, senha;
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("             LOGIN CLIENTE");		
		System.out.println("--------------------------------------");		
		System.out.println("Insira seu login");
		login = ler.nextLine();
		System.out.println("Insira sua senha");
		senha = ler.nextLine();
		
		cliente.subMenu(cliente, cabelo, null, clientes, clinicas, cabelos);
	}
	
	public static void loginClinica(List<Cliente> clientes, List<Clinica> clinicas) {
		Scanner ler = new Scanner(System.in);
		String login, senha;
		
		Clinica clinica = new Clinica();
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("             LOGIN CLÍNICA");		
		System.out.println("--------------------------------------");
		System.out.println("Insira seu login");
		login = ler.nextLine();
		System.out.println("Insira sua senha");
		senha = ler.nextLine();
		
		//clinica.subMenu(clientes, clinicas);
		
	}
	
	public static void menuCadastrarUsuario(List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos) {
		Scanner ler = new Scanner(System.in);
		int entrada;
		boolean menu = true;
		Cliente cliente = new Cliente();
		Clinica clinica = new Clinica();
		
		TelasIniciais.limpaTela();

		do {
			System.out.println("--------------------------------------");
			System.out.println("              ANGEL HAIR\n");
			System.out.println("           CADASTRAR USUÁRIO");
			System.out.println("--------------------------------------");
			System.out.println("  Digite a opção desejada:");
			System.out.println("  1 - Cadastrar Cliente *implementado*");
			System.out.println("  2 - Cadastrar Clínica *implementado*");
			System.out.println("  3 - Sair");
			System.out.println("--------------------------------------");
			entrada = ler.nextInt();
			
			switch(entrada) {
			case 1:
				cliente.cadastrarCliente(clientes, clinicas, cabelos);
				break;
			case 2:
				clinica.cadastrarClinica(clientes, clinicas, cabelos);
				break;
			case 3:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um comando válido do menu.");
			}
		} while (menu);
		
	}
}
