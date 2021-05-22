package AngelHair;
import java.util.Scanner;

public class Endereco {
	
	private int codEndereco;
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(int codEndereco, String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String uf) {
		super();
		this.codEndereco = codEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Endereco() {
		super();
	}

	public int getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(int codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public void cadastrarEndereco(Cliente cliente) {
		
		Scanner ler = new Scanner(System.in);
		Scanner ler2 = new Scanner(System.in);
		int entradaInt;
		String entradaString;
		Endereco endereco = new Endereco();
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("           CADASTRAR ENDEREÇO");
		System.out.println("--------------------------------------");
		System.out.println("Digite o logradouro");
		entradaString = ler.nextLine();
		endereco.setLogradouro(entradaString);
		System.out.println("Digite o número");
		entradaInt = ler2.nextInt();
		endereco.setNumero(entradaInt);
		System.out.println("Digite o complemento");
		entradaString = ler.nextLine();
		endereco.setComplemento(entradaString);
		System.out.println("Digite o CEP");
		entradaString = ler.nextLine();
		endereco.setCep(entradaString);
		System.out.println("Digite o bairro");
		entradaString = ler.nextLine();
		endereco.setBairro(entradaString);
		System.out.println("Digite a cidade");
		entradaString = ler.nextLine();
		endereco.setCidade(entradaString);
		System.out.println("Digite a UF");
		entradaString = ler.nextLine();
		endereco.setUf(entradaString);
		
		cliente.setEnderecoCliente(endereco);		
	}
	
	public void cadastrarEndereco(Clinica clinica) {
		
		Scanner ler = new Scanner(System.in);
		Scanner ler2 = new Scanner(System.in);
		int entradaInt;
		String entradaString;
		Endereco endereco = new Endereco();
		
		System.out.println("--------------------------------------");
		System.out.println("              ANGEL HAIR\n");
		System.out.println("           CADASTRAR ENDEREÇO");
		System.out.println("--------------------------------------");
		System.out.println("Digite o logradouro");
		entradaString = ler.nextLine();
		endereco.setLogradouro(entradaString);
		System.out.println("Digite o número");
		entradaInt = ler2.nextInt();
		endereco.setNumero(entradaInt);
		System.out.println("Digite o complemento");
		entradaString = ler.nextLine();
		endereco.setComplemento(entradaString);
		System.out.println("Digite o CEP");
		entradaString = ler.nextLine();
		endereco.setCep(entradaString);
		System.out.println("Digite o bairro");
		entradaString = ler.nextLine();
		endereco.setBairro(entradaString);
		System.out.println("Digite a cidade");
		entradaString = ler.nextLine();
		endereco.setCidade(entradaString);
		System.out.println("Digite a UF");
		entradaString = ler.nextLine();
		endereco.setUf(entradaString);
		
		clinica.setEnderecoClinica(endereco);
	}

}
