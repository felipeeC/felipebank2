package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Conta remetente;
	private Conta destinatario;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Conta getRemetente() {
		return remetente;
	}
	public void setRemetente(Conta remetente) {
		this.remetente = remetente;
	}
	public Conta getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Conta destinatario) {
		this.destinatario = destinatario;
	}
}
