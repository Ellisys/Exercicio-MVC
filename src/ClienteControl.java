
public class ClienteControl {
	
	ClienteView view;
	ClienteModel model;
	
	public ClienteControl(ClienteModel model , ClienteView view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void cadastrarNome(String nome) {
		model.setNome(nome);
	}
	public void cadastrarCpf(String cpf) {
		model.setCpf(cpf);
	}
	public void cadastrarRg(String rg) {
		model.setRg(rg);
	}
	public void cadastrarEmail(String email) {
		model.setEmail(email);
	}
	
	public void printar() {
		view.printClienteDetails(model.getNome(),model.getCpf(),model.getRg(),model.getEmail());
	}
	
	
}
