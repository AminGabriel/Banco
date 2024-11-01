package banco;

import javax.swing.JOptionPane;


public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupanca CPO = new ContaPoupanca(null, "09999-8", 0, 0.01);
		ContaEspecial CE = new ContaEspecial(null, "84594-4", 0, 600);
		
		String valor;
		String nome;
		String dias;
		
		Object[] opcoes = {"Interagir com contas", "Sair"};
		Object opcao;
		
		nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
		CPO.setCliente(nome);
		CE.setCliente(nome);
		
		
		do {
			opcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Caixa eletrônico", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(opcao == "Interagir com contas") {
				Object[] oopcoes = {"Conta Poupança", "Conta Especial", "Voltar"};
				Object oopcao;
				
				do {
					oopcao = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Caixa eletrônico", JOptionPane.INFORMATION_MESSAGE, null, oopcoes, oopcoes[0]);
					if(oopcao == "Conta Poupança") {
						Object[] ooopcoes = {"Depositar", "Sacar", "Rendimento", "Exibir Dados", "Voltar"};
					    Object ooopcao;
					    
					    do {
					    	ooopcao = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Caixa eletrônico", JOptionPane.INFORMATION_MESSAGE, null, ooopcoes, ooopcoes[0]);
					    	if(ooopcao == "Depositar") {
					    		while(true) {
					    			valor = JOptionPane.showInputDialog(null, "Informe o valor do deposito:");
					    			
					    			if(CPO.testeDouble(valor)) {
					    				valor = CPO.depositar(Double.parseDouble(valor));
							    		JOptionPane.showMessageDialog(null, valor);
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
					    		
					    		
					    	}else if(ooopcao == "Sacar") {
					    		while(true) {
					    			valor = JOptionPane.showInputDialog("Informe o valor do saque:");
					    			
					    			if(CPO.testeDouble(valor)) {
					    				valor = CPO.sacar(Double.parseDouble(valor));
							    		JOptionPane.showInternalMessageDialog(null, valor);
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
				
					    
					    	
					    	}else if(ooopcao == "Rendimento") {
					    		while(true) {
					    			dias = JOptionPane.showInputDialog("Informe a quantidade de dias passados:");
					    			
					    			if(CPO.testeInt(dias)) {
					    				CPO.calcularNovoSaldo(Integer.parseInt(dias)); 
							    		
							    		JOptionPane.showMessageDialog(null, "Rendimento:"+ CPO.getSaldo() + "\nTaxa:" + CPO.getTaxa() + "\nDias em rendimento:" + dias);
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    		
					    			}
					    		}
					    		
					    		
					    		
					    	}else if (ooopcao == "Exibir Dados") {
					    		JOptionPane.showMessageDialog(null, CPO.mostraInfo());
					    		
					    	}
					    	
					    	
					    }while(ooopcao != "Voltar");
						
						
					}else if(oopcao == "Conta Especial") {
						Object[] oooopcoes = {"Depositar", "Sacar", "Exibir Dados", "Voltar"};
						Object oooopcao;
						
						do {
							oooopcao = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Caixa elêtronico", JOptionPane.INFORMATION_MESSAGE, null, oooopcoes, oooopcoes[0]);
							if(oooopcao == "Depositar") {
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o valor do deposito:");
									
									if(CE.testeDouble(valor)) {
										valor = CE.depositar(Double.parseDouble(valor));
										JOptionPane.showMessageDialog(null, valor);
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
							}else if(oooopcao == "Sacar") {
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o valor do saque:");
									
									if(CE.testeDouble(valor)) {
										valor = CE.sacar(Double.parseDouble(valor));
										JOptionPane.showInternalMessageDialog(null, valor);
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
							}else if(oooopcao == "Exibir Dados") {
								JOptionPane.showMessageDialog(null, CE.mostraInfo());
							}
							
						}while(oooopcao != "Voltar");
					}
						
					
					
				}while(oopcao != "Voltar");
				
				
			}else if(opcao == "Sair") {
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
			}
		}while(opcao != "Sair");
		
		System.exit(0);

	}

}
