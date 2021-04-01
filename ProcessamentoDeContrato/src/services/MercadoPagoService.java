package services;

public class MercadoPagoService implements PagamentoOnlineService {

	private static final double TAXA_PAGAMENTO = 0.01;
	private static final double JUROS_TOTAL = 0.02;
	
	
	@Override
	public Double taxaDePagamento(Double valor) {
		return valor * TAXA_PAGAMENTO;
	}

	@Override
	public Double juros(Double valor, int meses) {
		return valor * meses * JUROS_TOTAL;
	}

}
