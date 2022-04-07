package agenciaViagem;

public class Passagem {
	private String destino;
	private double valor;
	private double taxa;
	private String cliente;
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void cadastrar(String cliente, double valor, double taxa, String destino ) {
		this.cliente = cliente;
		this.valor = valor;
		this.taxa = taxa;
		this.destino = destino;

	}

	@Override
	public String toString() {
	
		return ("Dados do Passageiro: " + this.cliente + "; Destino: ," + this.destino + "; Taxa: " + this.taxa + "; Valor: " + this.valor);
}
}