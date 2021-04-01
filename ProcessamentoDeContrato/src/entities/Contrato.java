package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Long numeroContrato;
	private Date dataContrato;
	private Double valorTotalContrato;
	
	List<Parcela> listaParcelas = new ArrayList<>();
	
	public Contrato() {
		}
	
	public Contrato(Long numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public List<Parcela> getListaParcelas() {
		return listaParcelas;
	}

}
