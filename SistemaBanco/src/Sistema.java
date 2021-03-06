
public class Sistema {
	public Caixa[] caixa;
	public Cliente[] cliente;
	public int cont, contCliente;
	
	public Sistema(){
		caixa = new Caixa[9];
		cliente = new Cliente[10];
		this.cont = 1;
		while(cont <= 9){
			Caixa caixaInst = new Caixa(cont);
			caixa[cont-1] = caixaInst;
			cont++;
		}
					
		}
	
	public void addCliente(Cliente cli){
		if(contCliente >= 0 && contCliente <=9){
			cliente[contCliente] = cli;
			contCliente++;
		}
			
			
	}
	
	public boolean removeCliente(int pos){
		if(contCliente>0){
		for(int i=pos;i<contCliente;i++){
			cliente[i] = cliente[i+1];
		}
		cliente[contCliente] = null;
		contCliente--;
			return true;
		}
		else return false;
	}
	
	
	
	public void distribui(){
		for(int i = 0;i<contCliente;i++){
			if(getIdadeCliente(i) == true){
				for(int j = 0;j<4;j++){
					if(caixa[j].getDisp() == 0){
						caixa[j].setOcupado();
						removeCliente(i);
					}
				}
			}
			

			}
		

		for(int i = 0;i<contCliente;i++){
				if(getIdadeCliente(i) == false){
					for(int j = 0;j<contCliente;j++){
						if(caixa[j].getDisp() == 0){
							caixa[j].setOcupado();
							removeCliente(i);
						}
					}
				}
				

				
		}

		}
	
	
	public Cliente getCliente(int i){
		return cliente[i];
	}
	
	public boolean getIdadeCliente(int pos){
		if(cliente[pos].getIdade()>65)
			return true;
		else 
			return false;
	}
	
			
	public String getCaixas(){
		String aux = "";
		for(int i = 0;i<cont-1;i++){
			if(+ caixa[i].getDisp() == 0)
			aux = aux + " " + caixa[i].getNumeroCaixa()+" Caixa Livre \n";
			else
				aux = aux + " " + caixa[i].getNumeroCaixa()+" Caixa Ocupado \n";

		
		}
		
		return aux;		
	}
	
	
	public String getClientes(){
		String aux = "";
		for(int i = 0;i<contCliente;i++){
			aux = aux + " Nome cliente:" + cliente[i].getNome()+" Posicao: "+i+" \n" ;
			
		
		}
		
		return aux;		
	}
	
	
	
	
	
	
}
