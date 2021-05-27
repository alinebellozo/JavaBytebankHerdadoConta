
public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(1234, 5678);
		
		conta.deposita(400.0);
		try {
			conta.saca(500.0);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
		
	}

}
