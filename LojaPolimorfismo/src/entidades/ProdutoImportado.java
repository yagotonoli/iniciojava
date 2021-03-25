package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxaImportação;
	
	public ProdutoImportado () {		
	}

	public ProdutoImportado(String nome, Double preço, Double taxaImportação) {
		super(nome, preço);
		this.taxaImportação = taxaImportação;
	}

	public Double getTaxaImportação() {
		return taxaImportação;
	}

	public void setTaxaImportação(Double taxaImportação) {
		this.taxaImportação = taxaImportação;
	}
	
	public Double preçoTotal() {
		Double preçoTotal = getPreço() + getTaxaImportação();
		return preçoTotal;
	}
	
	@Override
	public final String etiqueta() {
		return getNome() + " - R$ " + String.format("%.2f", preçoTotal()) + " (Taxa de Importação: R$ " + getTaxaImportação() + ")";
	}

}
