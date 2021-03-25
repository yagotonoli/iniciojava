package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;

	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void addItem(ItemPedido item) {
		itens.add(item);
	}

	public void remItem(ItemPedido item) {
		itens.remove(item);
	}

	public double total() {
		double totalPedido = 0;
		for (ItemPedido item : itens) {
			totalPedido += item.subTotal();
		}
		return totalPedido;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: " + status + "\n");
		sb.append("Cliente: " + cliente + "\n");
		sb.append("Itens do Pedido:\n");
		for (ItemPedido item : itens) {
			sb.append(" - " + item.getQuantidade() + " - " + item + " - Subtotal: R$ " + String.format("%.2f", item.subTotal()) + "\n");
		}
		sb.append("Total do Pedido: R$ " + String.format("%.2f", total()));
		return sb.toString();
	}

}
