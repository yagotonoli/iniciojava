package services;

public class PaypalService implements PagamentoOnlineService {
	
	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double TAXA_JUROS = 0.01;

	@Override
	public Double taxaDePagamento(Double valor) {
		return valor * TAXA_PAGAMENTO;
	}

	@Override
	public Double juros(Double valor, int meses) {
		return valor * meses * TAXA_JUROS;
	}
	
}
