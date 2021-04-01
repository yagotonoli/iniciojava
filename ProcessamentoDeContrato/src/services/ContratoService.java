package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContratoService {
	
	private PagamentoOnlineService pagamentoOnlineService;

	public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;
	}
	
	public void processoContrato (Contrato contrato, int meses) {
		double baseParcela = contrato.getValorTotalContrato() / meses;
		for (int i = 1; i <= meses; i++) {
			double jurosParcela = baseParcela + pagamentoOnlineService.juros(baseParcela, i);
			double totalParcela = jurosParcela + pagamentoOnlineService.taxaDePagamento(jurosParcela);
			Date dataParcela = addMeses(contrato.getDataContrato(), i);
			contrato.getListaParcelas().add(new Parcela(dataParcela, totalParcela));
		}
	}
	
	private Date addMeses(Date data, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}

}
