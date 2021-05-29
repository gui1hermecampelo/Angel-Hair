package AngelHair;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CabeloTest {

	@Test
	void testCabeloIntStringStringDoubleBooleanBooleanDoubleCliente() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
	}

	@Test
	void testCabelo() {
		Cabelo cabelo1 = new Cabelo();
	}

	@Test
	void testGetCodCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		int resposta = cabelo01.getCodCabelo();
		int espCod = 1;
		assertEquals(espCod, resposta);		
	}

	@Test
	void testSetCodCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setCodCabelo(51);
		int espCod = 51;
		assertEquals(espCod, cabelo01.getCodCabelo());
	}

	@Test
	void testGetDescricaoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		String resposta = cabelo01.getDescricaoCabelo();
		String espCod = "descrição do cabelo";
		assertEquals(espCod, resposta);
	}

	@Test
	void testSetDescricaoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setDescricaoCabelo("bonito");
		String espCod = "bonito";
		assertEquals(espCod, cabelo01.getDescricaoCabelo());
	}

	@Test
	void testGetCorCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		String resposta = cabelo01.getCorCabelo();
		String espCod = "cor do cabelo";
		assertEquals(espCod, resposta);	
	}

	@Test
	void testSetCorCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setCorCabelo("preto");
		String espCod = "preto";
		assertEquals(espCod, cabelo01.getCorCabelo());
	}

	@Test
	void testGetTamanhoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		double resposta = cabelo01.getTamanhoCabelo();
		double espCod = 25;
		assertEquals(espCod, resposta);	
	}

	@Test
	void testSetTamanhoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setTamanhoCabelo(89);
		double espCod = 89;
		assertEquals(espCod, cabelo01.getTamanhoCabelo());
	}

	@Test
	void testIsDoacaoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		boolean resposta = cabelo01.isDoacaoCabelo();
		boolean espCod = true;
		assertEquals(espCod, resposta);		
	}

	@Test
	void testSetDoacaoCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setDoacaoCabelo(false);
		boolean espCod = false;
		assertEquals(espCod, cabelo01.isDoacaoCabelo());		
	}

	@Test
	void testIsVendaCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		boolean resposta = cabelo01.isVendaCabelo();
		boolean espCod = true;
		assertEquals(espCod, resposta);	
	}

	@Test
	void testSetVendaCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setVendaCabelo(false);
		boolean espCod = false;
		assertEquals(espCod, cabelo01.isVendaCabelo());		
	}

	@Test
	void testGetValorCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		double resposta = cabelo01.getValorCabelo();
		double espCod = 70;
		assertEquals(espCod, resposta);	
	}

	@Test
	void testSetValorCabelo() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
		cabelo01.setValorCabelo(200);
		double espCod = 200;
		assertEquals(espCod, cabelo01.getValorCabelo());	
	}

	@Test
	void testGetCliente() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);		
	}

	@Test
	void testSetCliente() {
		Cliente cliente = new Cliente();
		Cabelo cabelo01 = new Cabelo(1, "descrição do cabelo", "cor do cabelo", 25, true, true, 70, cliente);
	}

}
