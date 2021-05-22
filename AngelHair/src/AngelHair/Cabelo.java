package AngelHair;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabelo extends Cliente {
	
	private int codCabelo;
	private String descricaoCabelo;
	private String corCabelo;
	private double tamanhoCabelo;
	private boolean doacaoCabelo;
	private boolean vendaCabelo;
	private double valorCabelo;
	private Cliente cliente;
	
	public Cabelo(int codCabelo, String descricaoCabelo, String corCabelo, double tamanhoCabelo, boolean doacaoCabelo, boolean vendaCabelo, double valorCabelo, Cliente cliente) {
		super();
		this.codCabelo = codCabelo;
		this.descricaoCabelo = descricaoCabelo;
		this.corCabelo = corCabelo;
		this.tamanhoCabelo = tamanhoCabelo;
		this.doacaoCabelo = doacaoCabelo;
		this.vendaCabelo = vendaCabelo;
		this.valorCabelo = valorCabelo;
		this.cliente = cliente;
	}

	public Cabelo() {
		super();
	}

	public int getCodCabelo() {
		return codCabelo;
	}

	public void setCodCabelo(int codCabelo) {
		this.codCabelo = codCabelo;
	}

	public String getDescricaoCabelo() {
		return descricaoCabelo;
	}

	public void setDescricaoCabelo(String descricaoCabelo) {
		this.descricaoCabelo = descricaoCabelo;
	}

	public String getCorCabelo() {
		return corCabelo;
	}

	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}

	public double getTamanhoCabelo() {
		return tamanhoCabelo;
	}

	public void setTamanhoCabelo(double tamanhoCabelo) {
		this.tamanhoCabelo = tamanhoCabelo;
	}

	public boolean isDoacaoCabelo() {
		return doacaoCabelo;
	}

	public void setDoacaoCabelo(boolean doacaoCabelo) {
		this.doacaoCabelo = doacaoCabelo;
	}

	public boolean isVendaCabelo() {
		return vendaCabelo;
	}

	public void setVendaCabelo(boolean vendaCabelo) {
		this.vendaCabelo = vendaCabelo;
	}

	public double getValorCabelo() {
		return valorCabelo;
	}

	public void setValorCabelo(double valorCabelo) {
		this.valorCabelo = valorCabelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/*public void cadastrarCabelo(Cliente cliente, Cabelo cabelo, List<Cliente> listaClientes, List<Clinica> listaClinicas, List<Cabelo> listaCabelos) {
		
		Scanner ler = new Scanner(System.in);
		String entradaTxt;
		double entradaNum;
		Cabelo cabeloNovo = new Cabelo();
		
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
		entradaNum = ler.nextDouble();
		cabeloNovo.setTamanhoCabelo(entradaNum);
		System.out.println("Este cabelo será para venda ou doação?");
		entradaTxt = ler.nextLine();
		entradaTxt.toLowerCase();
		if(entradaTxt == "venda") {
			cabeloNovo.setVendaCabelo(true);
			System.out.println("Informe o valor de venda do cabelo");
			entradaNum = ler.nextDouble();
			cabeloNovo.setValorCabelo(entradaNum);
		}
		else if (entradaTxt == "doação" || entradaTxt == "doacao" || entradaTxt == "doaçao") {
			cabeloNovo.setDoacaoCabelo(true);
			cabeloNovo.setValorCabelo(0);
			System.out.println("Muito obrigado!\nEm breve encontraremos um receptor para seu cabelo!");
		}
		else {
			System.out.println("Você deve optar venda ou doação!");
			cliente.subMenu(cliente, cabelo, listaClientes, listaClinicas, listaCabelos);
		}
		
		cliente.adicionarCabelo(cliente, cabeloNovo, listaClientes, listaClinicas, listaCabelos);

	}*/
}
