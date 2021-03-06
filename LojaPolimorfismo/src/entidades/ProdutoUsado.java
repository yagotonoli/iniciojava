package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private Date dataFabricação;
	
	ProdutoUsado(){
	}

	public ProdutoUsado(String nome, Double preço, Date dataFabricação) {
		super(nome, preço);
		this.dataFabricação = dataFabricação;
	}

	public Date getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(Date dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	
	@Override
	public final String etiqueta() {
		return getNome() + " - R$ " + String.format("%.2f", getPreço()) + " - Fabricado em " + sdf.format(getDataFabricação());
	}

}
