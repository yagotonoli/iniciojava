package services;

public interface PagamentoOnlineService {
	
	public Double taxaDePagamento(Double valor);
	public Double juros(Double valor, int meses);

}
