package AngelHair;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testClienteIntStringStringStringStringStringStringStringEndereco() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testCliente() {
		Cliente cliente = new Cliente();
	}

	@Test
	void testGetCodCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		int resposta = cliente.getCodCliente();
		int codEsp = 1;
		assertEquals(codEsp, resposta);
	}

	@Test
	void testSetCodCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setCodCliente(55);
		int espCod = 55;
		assertEquals(espCod, cliente.getCodCliente());
	}

	@Test
	void testGetLogin() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getLogin();
		String codEsp = "Login do cliente";
		assertEquals(codEsp, resposta);
	}

	@Test
	void testSetLogin() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setLogin("Novo login");
		String espCod = "Novo login";
		assertEquals(espCod, cliente.getLogin());
	}

	@Test
	void testGetSenhaCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getSenhaCliente();
		String codEsp = "Senha do cliente";
		assertEquals(codEsp, resposta);
	}

	@Test
	void testSetSenhaCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setSenhaCliente("Nova senha");
		String espCod = "Nova senha";
		assertEquals(espCod, cliente.getSenhaCliente());
	}

	@Test
	void testGetNomeCompleto() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getNomeCompleto();
		String codEsp = "Nome do cliente";
		assertEquals(codEsp, resposta);	
	}

	@Test
	void testSetNomeCompleto() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setNomeCompleto("Novo nome");
		String espCod = "Novo nome";
		assertEquals(espCod, cliente.getNomeCompleto());
	}

	@Test
	void testGetCpf() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getCpf();
		String codEsp = "CPF do cliente";
		assertEquals(codEsp, resposta);	
	}

	@Test
	void testSetCpf() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setCpf("Novo CPF");
		String espCod = "Novo CPF";
		assertEquals(espCod, cliente.getCpf());
	}

	@Test
	void testGetTelefoneCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getTelefoneCliente();
		String codEsp = "Telefone do cliente";
		assertEquals(codEsp, resposta);	
	}

	@Test
	void testSetTelefoneCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setCpf("Novo Telefone");
		String espCod = "Novo Telefone";
		assertEquals(espCod, cliente.getTelefoneCliente());
	}

	@Test
	void testGetEmailCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getEmailCliente();
		String codEsp = "E-mail do cliente";
		assertEquals(codEsp, resposta);	
	}

	@Test
	void testSetEmailCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setEmailCliente("Novo e-mail");
		String espCod = "Novo e-mail";
		assertEquals(espCod, cliente.getEmailCliente());
	}

	@Test
	void testGetDataNascimento() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		String resposta = cliente.getDataNascimento();
		String codEsp = "Data de nascimento";
		assertEquals(codEsp, resposta);	
	}

	@Test
	void testSetDataNascimento() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
		cliente.setDataNascimento("Nova data nascimento");
		String espCod = "Nova data nascimento";
		assertEquals(espCod, cliente.getDataNascimento());
	}

	@Test
	void testGetEnderecoCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetEnderecoCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testIsVendedor() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetVendedor() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testIsComprador() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetComprador() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testIsDoador() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetDoador() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testIsReceptor() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetReceptor() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testGetListaCabelos() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSetListaCabelos() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testSubMenu() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testCadastrarCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testCadastrarCabelo() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testVenderCabelo() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testComprarCabelo() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testDoarCabelo() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testExibirDadosCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testEditarDadosCliente() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

	@Test
	void testConfirmacao() {
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente(1, "Login do cliente", "Senha do cliente", "Nome do cliente", "CPF do cliente", "Telefone do cliente", "E-mail do cliente", "Data de nascimento", endereco);
	}

}
