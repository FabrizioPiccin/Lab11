package it.polito.tdp.bar.model;

public class Tavolo {
	
	public enum TableStatus { LIBERO, OCCUPATO};
	
	private int id;
	private int numPosti;
	private TableStatus status;

	public Tavolo(int id, int numPosti) {
		super();
		this.id=id;
		this.numPosti = numPosti;
	}

	public int getId() {
		return id;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	public TableStatus getStatus() {
		return status;
	}

	public void setStatus(TableStatus status) {
		this.status = status;
	}

	
	
}
