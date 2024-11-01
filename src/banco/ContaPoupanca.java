package banco;

public class ContaPoupanca extends ContaBancaria{
	
	
	private double taxa;
	
	public ContaPoupanca(String cliente, String numeroConta, double saldo, double taxa) {
		super(cliente, numeroConta, saldo);
		this.taxa = taxa;
	}
	
	public String calcularNovoSaldo(int diaDeRendimento) {
		
		double saldoAtual = this.getSaldo();
		
		this.setSaldo(saldoAtual + ((saldoAtual * getTaxa()) * diaDeRendimento));
		
		return "Saldo atualizado com sucesso!";
	}
	
	@Override
	public String mostraInfo() {
		return "Número da conta: " + this.getNumeroConta() + "\nNome: " + this.getCliente() + "\nSaldo: " + this.getSaldo() + "\nTaxa ao dia: " + this.getTaxa ();
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
	

}
