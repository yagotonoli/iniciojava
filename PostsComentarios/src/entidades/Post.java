package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String titulo;
	private String conteudo;
	private Integer like;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
	}
	
	public Post(Date moment, String titulo, String conteudo, Integer like) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario (Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void remComentario (Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(like);
		sb.append("Likes - " + sdf.format(moment) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentarios:\n");
		for (Comentario c : comentarios) {
		sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}

}
