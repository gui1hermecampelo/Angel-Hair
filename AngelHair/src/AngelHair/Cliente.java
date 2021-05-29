package AngelHair;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente implements SubMenu {
	
	private int codCliente;
	private String login;
	private String senhaCliente;
	private String nomeCompleto;
	private String cpf;
	private String telefoneCliente;
	private String emailCliente;
	private String dataNascimento;
	private Endereco enderecoCliente;
	private boolean vendedor;
	private boolean comprador;
	private boolean doador;
	private boolean receptor;
	private List<Cabelo> listaCabelos = new ArrayList<Cabelo>();
	
	public Cliente(int codCliente, String login, String senhaCliente, String nomeCompleto, String cpf, String telefoneCliente, String emailCliente, String dataNascimento, Endereco enderecoCliente) {
		this.codCliente = codCliente;
		this.login = login;
		this.nomeCompleto = nomeCompleto;
		this.senhaCliente = senhaCliente;
		this.cpf = cpf;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.dataNascimento = dataNascimento;
		this.enderecoCliente = enderecoCliente;
	}
	
	public Cliente() {
		
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(Endereco enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public boolean isVendedor() {
		return vendedor;
	}

	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
	}

	public boolean isComprador() {
		return comprador;
	}

	public void setComprador(boolean comprador) {
		this.comprador = comprador;
	}

	public boolean isDoador() {
		return doador;
	}

	public void setDoador(boolean doador) {
		this.doador = doador;
	}

	public boolean isReceptor() {
		return receptor;
	}

	public void setReceptor(boolean receptor) {
		this.receptor = receptor;
	}

	public List<Cabelo> getListaCabelos() {
		return listaCabelos;
	}

	public void setListaCabelos(List<Cabelo> listaCabelos) {
		this.listaCabelos = listaCabelos;
	}
	
	/*public void adicionarCabelo(Cliente cliente, Cabelo cabelo, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		this.listaCabelos.add(cabelo);
		cabelo.setCodCabelo(listaCabelos.indexOf(cabelo));
		
		cliente.subMenu(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
	}*/

	
	
	@Override
	public void subMenu(Cliente cliente, Cabelo cabelo, Clinica clinica, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		Scanner ler = new Scanner(System.in);
		int entrada;
		boolean menu = true;

		TelasIniciais.limpaTela();

		do {
			System.out.println("--------------------------------------");
			System.out.println("              ANGEL HAIR\n");
			System.out.println("             MENU CLIENTE");
			System.out.println("--------------------------------------");
			System.out.println("  Digite a opção desejada:");
			System.out.println("  1  - Cadastrar cabelo *implementado*");
			System.out.println("  2  - Vender cabelo *implmentado*");
			System.out.println("  3  - Comprar cabelo *semi-implementado, precisaria de uma lista global ou do BD*");
			System.out.println("  4  - Doar cabelo *implementado*");
			System.out.println("  5  - Receber cabelo");
			System.out.println("  6  - Visualizar cabelo");
			System.out.println("  7  - Agendar doação");
			System.out.println("  8  - Convidar amigos");
			System.out.println("  9  - Exibir / editar dados *implementado inclusive editando*");
			System.out.println("  10 - Sair");
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
				cliente.doarCabelo(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
				break;
			case 5:
	
				break;
			case 6:
	
				break;
			case 7:
	
				break;
			case 8:
	
				break;
			case 9:
				System.out.println("Saindo...");
				menu = false;
				break;
			case 10:
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um comando válido do menu.");
			}
		} while (menu);
	}
	
	public void cadastrarCliente(List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> cabelos) {
		
		Scanner ler = new Scanner(System.in);
		String entradaString;
		Cliente clienteNovo = new Cliente();
		Endereco enderecoNovo = new Endereco();
		Cabelo cabeloNovo = new Cabelo();
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("           CADASTRAR CLIENTE");
		System.out.println("--------------------------------------");
		System.out.println("Digite seu login");
		entradaString = ler.nextLine();
		clienteNovo.setLogin(entradaString);
		System.out.println("Digite sua senha");
		entradaString = ler.nextLine();
		clienteNovo.setSenhaCliente(entradaString);
		System.out.println("Digite seu nome completo");
		entradaString = ler.nextLine();
		clienteNovo.setNomeCompleto(entradaString);
		System.out.println("Digite seu CPF");
		entradaString = ler.nextLine();
		clienteNovo.setCpf(entradaString);
		System.out.println("Digite seu telefone");
		entradaString = ler.nextLine();
		clienteNovo.setTelefoneCliente(entradaString);
		System.out.println("Digite seu e-mail");
		entradaString = ler.nextLine();
		clienteNovo.setEmailCliente(entradaString);
		System.out.println("Digite sua data de nascimento");
		entradaString = ler.nextLine();
		clienteNovo.setDataNascimento(entradaString);
		
		enderecoNovo.cadastrarEndereco(clienteNovo);
		
		//cabeloNovo.cadastrarCabelo(4, cabeloNovo, listaClientes, listaClinicas, cabelos);
		
		listaClientes.add(clienteNovo);
		clienteNovo.setCodCliente(listaClientes.indexOf(clienteNovo));
		
		clienteNovo.exibirDadosCliente(clienteNovo, enderecoNovo, cabeloNovo, listaClientes, listaClinicas, cabelos);
		
		clienteNovo.subMenu(clienteNovo, null, null, listaClientes, listaClinicas, cabelos);
	}
	
	public void cadastrarCabelo(Cliente cliente, Cabelo cabelo, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		Scanner ler = new Scanner(System.in);
		Scanner ler2 = new Scanner(System.in);
		String entradaTxt;
		double entradaNum;
		Cabelo cabeloNovo = new Cabelo();
		boolean repeticao = true;
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("           CADASTRAR CABELO");
		System.out.println("--------------------------------------");
		System.out.println("Forneça uma breve descrição do cabelo: ");
		entradaTxt = ler.nextLine();
		cabeloNovo.setDescricaoCabelo(entradaTxt);
		System.out.println("Informe a cor do cabelo: ");
		entradaTxt = ler.nextLine();
		cabeloNovo.setCorCabelo(entradaTxt);
		System.out.println("Informe o tamanho do cabelo (em centímetros): ");
		entradaNum = ler2.nextDouble();
		cabeloNovo.setTamanhoCabelo(entradaNum);
		
		do {
			System.out.println("Este cabelo será para venda ou doação?");
			entradaTxt = ler.next();
			entradaTxt.toLowerCase();
			if(entradaTxt.equals("venda")) {
				cabeloNovo.setVendaCabelo(true);
				System.out.println("Informe o valor de venda do cabelo");
				entradaNum = ler2.nextDouble();
				cabeloNovo.setValorCabelo(entradaNum);
				System.out.println("Muito obrigado!\nEm breve encontraremos um comprador para seu cabelo!");
				repeticao = false;
			}
			else if (entradaTxt.equals("doação") || entradaTxt.equals("doacao") || entradaTxt.equals("doaçao")) {
				cabeloNovo.setDoacaoCabelo(true);
				cabeloNovo.setValorCabelo(0);
				System.out.println("Muito obrigado!\nEm breve encontraremos um receptor para seu cabelo!");
				repeticao = false;
			}
			else {
				System.out.println("Você deve optar venda ou doação!");
			}
		} while (repeticao);
		
		this.listaCabelos.add(cabeloNovo);
		cabeloNovo.setCodCabelo(listaCabelos.indexOf(cabeloNovo));
		
		cliente.subMenu(cliente, cabelo, null, listaClientes, listaClinicas, listaCabelos);
	}
	
	public void venderCabelo(Cliente clienteVenda, Cabelo cabeloVenda, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		//método para colocar o cabelo à venda

		clienteVenda.setVendedor(true);
		cabeloVenda.setVendaCabelo(true);
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("--------------------------------------");
		System.out.println("Seu cabelo agora está à venda!");
		System.out.println("--------------------------------------");
	}
	
	public void comprarCabelo(Cliente clienteVenda, Cabelo cabeloVenda, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		//método para pesquisar e comprar cabelo
		
		clienteVenda.setComprador(true);
		cabeloVenda.setVendaCabelo(true);
		Scanner ler = new Scanner(System.in);
		double entradaDouble = 0;
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("            COMPRAR CABELO");
		System.out.println("--------------------------------------");
		System.out.println("Informe o valor máximo para o cabelo que deseja adquirir");
		entradaDouble = ler.nextDouble();
		
		for (int i = 0; i < listaCabelos.size(); i++) {
			if(listaCabelos.get(i).isVendaCabelo() == true) {
				if(listaCabelos.get(i).getValorCabelo() <= entradaDouble) {
					System.out.println("Vendedor: ");
					System.out.println("Descrição: "+listaCabelos.get(i).getDescricaoCabelo());
					System.out.println("Cor: "+listaCabelos.get(i).getCorCabelo());
					System.out.println("Tamanho do cabelo: "+listaCabelos.get(i).getTamanhoCabelo() +"cm");
					System.out.println("Valor R$: "+listaCabelos.get(i).getValorCabelo());
					
					}
			} 
			else {
				System.out.println("No momento não temos cabelo nessa faixa de preço.");
				clienteVenda.comprarCabelo(clienteVenda, cabeloVenda, listaClientes, listaClinicas, listaCabelos);
			}
		}
		System.out.println("--------------------------------------");

	}
	
	public void doarCabelo(Cliente clienteDoacao, Cabelo cabeloDoacao, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		//método para colocar o cabelo à venda

		clienteDoacao.setDoador(true);
		cabeloDoacao.setDoacaoCabelo(true);
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("--------------------------------------");
		System.out.println("Seu cabelo agora está disponível para doação!");
		System.out.println("--------------------------------------");
	}
	
	public void exibirDadosCliente(Cliente cliente, Endereco endereco, Cabelo cabelo, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		endereco = cliente.getEnderecoCliente();
		Scanner ler = new Scanner(System.in);
		int entradaInt;
		String entradaTxt;
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("        EXIBIR DADOS DO CLIENTE");
		System.out.println("--------------------------------------");
		System.out.println("Login: " + cliente.getLogin());
		System.out.println("Senha: " + cliente.getSenhaCliente());
		System.out.println("Nome: " + cliente.getNomeCompleto());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Telefone: " + cliente.getTelefoneCliente());
		System.out.println("E-mail: " + cliente.getEmailCliente());
		System.out.println("Data de nascimento: " + cliente.getDataNascimento());
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
		/*System.out.println("--------------------------------------");
		System.out.println("               CABELO");
		System.out.println("--------------------------------------");
		System.out.println("Descrição: " + cabelo.getDataNascimento());
		System.out.println("Cor: " + cabelo.getCorCabelo());
		System.out.println("Tamanho: " + cabelo.getTamanhoCabelo());
		if(cabelo.isVendaCabelo()) {
			System.out.println("Valor: " + cabelo.getValorCabelo());
		}
		else {
			System.out.println("Cabelo para doação");
		}*/
		System.out.println("--------------------------------------");
		System.out.println("Gostaria de editar algum dos dados informados?");
		System.out.println("Sim: digite 1");
		System.out.println("Não: digite 2");
		entradaInt = ler.nextInt();
		if(entradaInt == 1) {			
			cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
		}
		else if (entradaInt == 2) {
			System.out.println("Dados confirmados com sucesso.");
		}
	}
	
	public void editarDadosCliente(Cliente cliente, Endereco endereco, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		Scanner ler = new Scanner(System.in);
		String entrada, entradaTxt;
		boolean menu = true;

		TelasIniciais.limpaTela();

		do {
			System.out.println("Digite o nome do dado que deseja editar ou sair caso queira sair");
			entrada = ler.nextLine();
			entrada.toLowerCase();
			
			switch(entrada) {
			case ("login"): 
				System.out.println("Digite seu novo login: ");
				entradaTxt = ler.nextLine();
				cliente.setLogin(entradaTxt);
				System.out.println("Login alterado com sucesso.");
				menu = cliente.confirmacao();
				//cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
				break;
			case ("senha"):
				System.out.println("Digite sua nova senha: ");
				entradaTxt = ler.nextLine();
				cliente.setSenhaCliente(entradaTxt);
				System.out.println("Senha alterado com sucesso.");
				//cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
				break;
			case ("nome"):
				System.out.println("Digite seu novo nome: ");
				entradaTxt = ler.nextLine();
				cliente.setNomeCompleto(entradaTxt);
				System.out.println("Nome alterado com sucesso.");
				//cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
				break;
			case ("cpf"):
				System.out.println("Digite seu novo cpf: ");
				entradaTxt = ler.nextLine();
				cliente.setLogin(entradaTxt);
				System.out.println("Login alterado com sucesso.");
				//cliente.editarDadosCliente(cliente, endereco, listaClientes, listaClinicas, listaCabelos);
				break;
			case ("telefone"):
	
				break;
			case ("e-mail"):
	
				break;
			case ("data de nascimento"):
	
				break;
			case ("logradouro"):
	
				break;
			case ("numero"):
				break;
				
			case ("complemento"):
				break;
			case ("cep"):
				break;
			case ("bairro"):
				break;
			case ("cidade"):
				break;
			case ("estado"):
				break;
			
				
			case "sair":
				System.out.println("Saindo...");
				menu = false;
				break;
			default:
				System.out.println("Digite um nome válido.");
			}
		} while (menu);
	}
	
	public boolean confirmacao() {
		
		Scanner ler = new Scanner(System.in);
		String entrada;
		boolean menu = true;

		System.out.println("Gostaria de alterar mais algun dado?");
		entrada = ler.nextLine();
		entrada.toLowerCase();
		if(entrada.equals("sim")) {
			menu = true;
		}
		else if(entrada.equals("não") || entrada.equals("nao")) {
			System.out.println("Saindo...");
			menu = false;
		}
		 return menu;
	}
}
