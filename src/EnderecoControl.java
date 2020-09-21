public class EnderecoControl {
	
	EnderecoModel model;
	EnderecoView view;
	
	public EnderecoControl(EnderecoModel model , EnderecoView view) {
		
		this.model = model;
		this.view = view;
		
	}
	
	public void cadNumero(String numero) {
		model.setNumero(numero);
	}
	
	public void cadRua(String rua) {
		model.setRua(rua);
	}
	
	public void cadBairro(String bairro) {
		model.setBairro(bairro);
	}
	public void cadComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	public void cadCidade(String cidade) {
		model.setCidade(cidade);
	}
	public void cadEstado(String estado) {
		model.setEstado(estado);
	}
	
	
	public void printar() {
		view.printEnderecoDetails(model.getNumero(), model.getRua(), model.getBairro(), model.getComplemento(), model.getCidade(), model.getEstado());
	}
}