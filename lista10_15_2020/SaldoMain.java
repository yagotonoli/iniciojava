package lista10_15_2020;

public class SaldoMain {

	public static void main(String[] args) {
		
		Pessoa pessoaqualquer = new Pessoa ("Yago");
		
		Fornecedor fornecedor1 = new Fornecedor ("Generation");
		Fornecedor fornecedor2 = new Fornecedor ("Itaú", "Av. Paulista", 100000.00);
		
		fornecedor2.setValorDebito(92000.00);
		
		System.out.printf("O saldo final da "+ fornecedor2.getNome() +  " será de R$ " + fornecedor2.obterSaldo());

	}

}
