package banco;

public class ContaBancaria {
	
	private String cliente;
    private String numeroConta;
    private double saldo;
    
    
    public ContaBancaria(String cliente, String numeroConta, double saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.setSaldo(saldo);
	}
    
	public String sacar(double valor) {
		if(getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			
			return "Saque efetuado com sucesso!";
			
		}else {
			return "Saque inválido!";
		}
	}
	
	public String depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		
		return "Deposito efetuado com sucesso!";
	}
	
	public String mostraInfo() {
		return "Número da conta: " + this.getNumeroConta()+ "\nNome: " + this.getCliente() + "\nSaldo: " + this.getSaldo();
		
	}
	
	public boolean testeDouble(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public boolean testeInt(String dias) {
		try {
			Integer.parseInt(dias);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
    
    

}
