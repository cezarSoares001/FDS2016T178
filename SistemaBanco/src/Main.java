
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sist = new Sistema();
		Cliente cliente1 = new Cliente("Lucas", 25);
		Cliente cliente2 = new Cliente("João", 75);
		Cliente cliente3 = new Cliente("Zé", 85);
		Cliente cliente4 = new Cliente("Maria", 95);
		Cliente cliente5 = new Cliente("Douglas", 85);
		Cliente cliente6 = new Cliente("Roberto", 35);
		sist.addCliente(cliente1);
		sist.addCliente(cliente2);
		sist.addCliente(cliente3);
		sist.addCliente(cliente4);
		sist.addCliente(cliente5);
		sist.addCliente(cliente6);
		System.out.println(sist.caixa);
		sist.distribui();
		
		System.out.println(sist.getCaixas());
		
		
		
	}

}
