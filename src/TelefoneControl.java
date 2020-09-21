
public class TelefoneControl {
	
	TelefoneModel model;
	TelefoneView view;
	
	public TelefoneControl(TelefoneModel model , TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void cadastrarDdd(String ddd) {
		model.setDdd(ddd);
	}
	public void cadastrarTelefone(String numero) {
		model.setNumero(numero);
	}
	
	public void printar() {
		view.printTelefoneDetails(model.getDdd() , model.getNumero());
	}
}
