package AngelHair;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Clinica> clinicas = new ArrayList<Clinica>();
		List<Cabelo> cabelos = new ArrayList<Cabelo>();
		Cliente cliente = new Cliente();
		Cabelo cabelo = new Cabelo();
		
		Endereco enderecoTeste = new Endereco(1, "Rua da Minha Casa", 12, "sem complemento", "30453-012", "Bairro Que Eu Moro", "BH", "MG");
		Cliente clienteTeste = new Cliente(1, "logincliente", "senhacliente", "nomecliente", "cpfcliente", "telefonecliente", "emailcliente", "datanascimento", enderecoTeste);


		
		/* Dando o "play" ser� poss�vel:
		 * 
		 * Cadastrar cliente com endere�o (objeto separado)
		 * Acessar menu de cliente (algumas op��es est�o implementadas)
		 * Cadastrar clinica com endere�o (objeto separado)
		 * Cadastrar cabelo para cliente
		 * -> ao cadastrar o cabelo, � feita a op��o de venda ou doa��o
		 * -> � poss�vel alterar essa op��o atrav�s do menu cliente "vender cabelo" ou "doar cabelo"
		 * 
		 * Conforme explicado, pela falta de banco de dados, n�o faz muito sentido
		 * criar um monte de objetos, listas globais de objetos, etc, pois, apesar de tornar
		 * o projeto mais interessante, n�o o torna vi�vel, afinal, ningu�m faz um programa
		 * inteiro em console... 
		 * 
		*/
		
		TelasIniciais.menuTelaInicial(cliente, cabelo, clientes, clinicas, cabelos);
		
	}

}
