
public class Programa {
	
	public static void main(String[] args) {
		
		ClienteModel cm = new ClienteModel();
		ClienteView cv = new ClienteView();
		
		ClienteControl cc = new ClienteControl(cm , cv);
		
		//Control Cliente
		cc.cadastrarNome("Gustavo Alves");
		cc.cadastrarCpf("000.000.000-00");
		cc.cadastrarRg("00.000.000-0");
		cc.cadastrarEmail("gustavo@hotmail.com");
		
		cc.printar();
		
		//Control Telefone
		TelefoneModel tm = new TelefoneModel();
		TelefoneView tv = new TelefoneView();
		
		TelefoneControl tc = new TelefoneControl(tm , tv);
		
		tc.cadastrarDdd("11");
		tc.cadastrarTelefone("2288-3399");
		
		tc.printar();
		
		//Control Endereco
		EnderecoModel em = new EnderecoModel();
		EnderecoView ev = new EnderecoView();
		
		EnderecoControl ec = new EnderecoControl(em , ev);
		
		ec.cadNumero("112");
		ec.cadRua("Rua Das Margaridas");
		ec.cadBairro("Flores");
		ec.cadComplemento("A");
		ec.cadEstado("SP");
		ec.cadCidade("Sao Paulo");
		
		ec.printar();
	}
}
