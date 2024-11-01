package banco;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	double diferenca;

	public ContaEspecial(String cliente, String numeroConta, double saldo, double limite) {
		super(cliente, numeroConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public String sacar(double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return "Saque efetuado com sucesso!";
			
		}else if(this.getSaldo() + limite >= valor && getSaldo() >=0){
			diferenca = valor - getSaldo();
			
			limite -= diferenca;
					
			this.setSaldo(this.getSaldo() - valor);
			
			return "Saque efetuado com sucesso!";
			
		}else if(this.getSaldo() < 0 && limite >= valor){
			
			limite -= valor;
			
			this.setSaldo(this.getSaldo() - valor);
			
			return "Saque efetuado com sucesso!";
			
		}else {
			
			return "Não foi possível efetuar o saque!";
		}	
	}
	
	@Override
	public String mostraInfo() {
		return "Número da conta: " + this.getNumeroConta() + "\nNome: " + this.getCliente() + "\nSaldo: " + this.getSaldo() + "\nLimite: " + this.getLimite();
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
