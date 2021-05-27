
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(1234, 5678);
		cc.deposita(1200.0);
		
		ContaPoupanca cp = new ContaPoupanca(4321, 8765);
		cp.deposita(1000.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
