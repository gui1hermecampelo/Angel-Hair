package AngelHair;

import java.util.List;
import java.util.Scanner;

public class Clinica implements SubMenu {
	
	private int codClinica;
	private String userNameClinica;
	private String senhaClinica;
	private String razaoSocialClinica;
	private String nomeFantasiaClinica;
	private String cnpjClinica;
	private String telefoneClinica;
	private String emailClinica;
	private Endereco enderecoClinica;
	
	public Clinica(int codClinica, String userNameClinica, String senhaClinica, String razaoSocialClinica, String nomeFantasiaClinica, String cnpjClinica, String telefoneClinica, String emailClinica, Endereco enderecoClinica) {
		this.codClinica = codClinica;
		this.userNameClinica = userNameClinica;
		this.senhaClinica = senhaClinica;
		this.razaoSocialClinica = razaoSocialClinica;
		this.nomeFantasiaClinica = nomeFantasiaClinica;
		this.cnpjClinica = cnpjClinica;
		this.telefoneClinica = telefoneClinica;
		this.emailClinica = emailClinica;
		this.enderecoClinica = enderecoClinica;
	}

	public Clinica() {

	}

	public int getCodClinica() {
		return codClinica;
	}

	public void setCodClinica(int codClinica) {
		this.codClinica = codClinica;
	}

	public String getUserNameClinica() {
		return userNameClinica;
	}

	public void setUserNameClinica(String userNameClinica) {
		this.userNameClinica = userNameClinica;
	}

	public String getSenhaClinica() {
		return senhaClinica;
	}

	public void setSenhaClinica(String senhaClinica) {
		this.senhaClinica = senhaClinica;
	}

	public String getRazaoSocialClinica() {
		return razaoSocialClinica;
	}

	public void setRazaoSocialClinica(String razaoSocialClinica) {
		this.razaoSocialClinica = razaoSocialClinica;
	}

	public String getNomeFantasiaClinica() {
		return nomeFantasiaClinica;
	}

	public void setNomeFantasiaClinica(String nomeFantasiaClinica) {
		this.nomeFantasiaClinica = nomeFantasiaClinica;
	}

	public String getCnpjClinica() {
		return cnpjClinica;
	}

	public void setCnpjClinica(String cnpjClinica) {
		this.cnpjClinica = cnpjClinica;
	}

	public String getTelefoneClinica() {
		return telefoneClinica;
	}

	public void setTelefoneClinica(String telefoneClinica) {
		this.telefoneClinica = telefoneClinica;
	}

	public String getEmailClinica() {
		return emailClinica;
	}

	public void setEmailClinica(String emailClinica) {
		this.emailClinica = emailClinica;
	}

	public Endereco getEnderecoClinica() {
		return enderecoClinica;
	}

	public void setEnderecoClinica(Endereco enderecoClinica) {
		this.enderecoClinica = enderecoClinica;
	}
	
	@Override
	public void subMenu(Cliente cliente, Cabelo cabelo, Clinica clinica, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		Scanner ler = new Scanner(System.in);
		int entrada;
		boolean menu = true;

		TelasIniciais.limpaTela();

		do {
			System.out.println("--------------------------------------");
			System.out.println("              ANGEL HAIR\n");
			System.out.println("             MENU CLÍNICA");
			System.out.println("--------------------------------------");
			System.out.println("  Digite a opção desejada:");
			System.out.println("  1  - Agendar implante");
			System.out.println("  2  - Agendar coleta de cabelo");
			System.out.println("  3  - Comprar cabelo");
			System.out.println("  4  - Doar peruca");
			System.out.println("  5  - Vender peruca");
			System.out.println("  6  - Interagir com a comunidade");
			System.out.println("  7  - Exibir / editar dados *exibir está implementado, editar não*");
			System.out.println("  8 - Sair");
			System.out.println("--------------------------------------");
			entrada = ler.nextInt();
			
			switch(entrada) {
			case 1: 
				cliente.cadastrarCabelo(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
				break;
			case 2:
				cliente.venderCabelo(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
				break;
			case 3:
				cliente.comprarCabelo(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
				break;
			case 4:
	
				break;
			case 5:
	
				break;
			case 6:
	
				break;
			case 7:
	
				break;
			case 8:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um comando válido do menu.");
			}
		} while (menu);
	}
	
	public void cadastrarClinica(List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> cabelos) {
		
		Scanner ler = new Scanner(System.in);
		String entradaString;
		Clinica clinicaNovo = new Clinica();
		Endereco enderecoNovo = new Endereco();
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("           CADASTRAR CLÍNICA");
		System.out.println("--------------------------------------");
		System.out.println("Digite seu login");
		entradaString = ler.nextLine();
		clinicaNovo.setUserNameClinica(entradaString);
		System.out.println("Digite sua senha");
		entradaString = ler.nextLine();
		clinicaNovo.setSenhaClinica(entradaString);
		System.out.println("Digite a razão social");
		entradaString = ler.nextLine();
		clinicaNovo.setRazaoSocialClinica(entradaString);
		System.out.println("Digite o nome fantasia");
		entradaString = ler.nextLine();
		clinicaNovo.setNomeFantasiaClinica(entradaString);
		System.out.println("Digite o CNPJ");
		entradaString = ler.nextLine();
		clinicaNovo.setCnpjClinica(entradaString);
		System.out.println("Digite o telefone");
		entradaString = ler.nextLine();
		clinicaNovo.setTelefoneClinica(entradaString);
		System.out.println("Digite o e-mail");
		entradaString = ler.nextLine();
		clinicaNovo.setEmailClinica(entradaString);
		
		enderecoNovo.cadastrarEndereco(clinicaNovo);
		
		listaClinicas.add(clinicaNovo);
		clinicaNovo.setCodClinica(listaClinicas.indexOf(clinicaNovo));
		
		//clienteNovo.exibirDadosCliente(clienteNovo, enderecoNovo, listaClientes, listaClinicas, cabelos);
		
		clinicaNovo.exibirDadosClinica(clinicaNovo, enderecoNovo);
		
		clinicaNovo.subMenu(null, null, clinicaNovo, listaClientes, listaClinicas, cabelos);
	}
	
	public void agendarImplante() {
		
	}
	
	public void agendarColetaCabelo() {
		
	}
	
	public void comprarCabelo() {
		
	}
	
	public void doarPeruca() {
		
	}
	
	public void venderPeruca() {
		
	}
	
	public void interagirComunidade() {
		
	}
	
	public void exibirDadosClinica(Clinica clinica, Endereco endereco) {
		
		endereco = clinica.getEnderecoClinica();
		Scanner ler = new Scanner(System.in);
		int entradaInt;
		String entradaTxt;
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("        EXIBIR DADOS DA CLINICA");
		System.out.println("--------------------------------------");
		System.out.println("Login: " + clinica.getUserNameClinica());
		System.out.println("Senha: " + clinica.getSenhaClinica());
		System.out.println("Razão Social: " + clinica.getRazaoSocialClinica());
		System.out.println("Nome Fantasia: " + clinica.getNomeFantasiaClinica());
		System.out.println("CNPJ: " + clinica.getCnpjClinica());
		System.out.println("Telefone: " + clinica.getTelefoneClinica());
		System.out.println("E-mail: " + clinica.getEmailClinica());
		System.out.println("--------------------------------------");
		System.out.println("              ENDEREÇO");
		System.out.println("--------------------------------------");
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Número: " + endereco.getNumero());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("CEP: " + endereco.getCep());
		System.out.println("Beirro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: "+ endereco.getUf());
		System.out.println("--------------------------------------");
		/*System.out.println("Gostaria de editar algum dos dados informados?");
		System.out.println("Sim: digite 1");
		System.out.println("Não: digite 2");
		entradaInt = ler.nextInt();
		if(entradaInt == 1) {			
			cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
		}
		else if (entradaInt == 2) {
			System.out.println("Dados confirmados com sucesso.");
		}*/
	}
	
}
