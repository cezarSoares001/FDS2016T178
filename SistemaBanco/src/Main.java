
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sist = new Sistema();
		Cliente cliente1 = new Cliente("Lucas", 5);
		Cliente cliente2 = new Cliente("João", 5);
		Cliente cliente3 = new Cliente("Zé", 5);
		Cliente cliente4 = new Cliente("Maria", 5);
		Cliente cliente5 = new Cliente("Douglas", 5);
		Cliente cliente6 = new Cliente("Roberto", 5);
		sist.addCliente(cliente1);
		sist.addCliente(cliente2);
		sist.addCliente(cliente3);
		sist.addCliente(cliente4);
		sist.addCliente(cliente5);
		sist.addCliente(cliente6);
		//System.out.println(sist.caixa);
		System.out.println(sist.getClientes());

		sist.distribui();
		
		System.out.println(sist.getCaixas());
		System.out.println(sist.getClientes());
		
		
		
	}

}
