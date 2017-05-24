package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import it.polito.tdp.bar.model.Tavolo.TableStatus;

public class Simulator {
	
	// Simulation parameters

		private int NT; // number of tables
		private List<Tavolo> tavoli = new ArrayList<Tavolo>();

		// World model
		
		private int occupiedTables = 0;

		// Measures of Interest
		private int numeroTotaleClienti= 0;
		private int numeroClientiSoddisfatti=0;
		private int numeroClientiInsoddisfatti=0;

		// Event queue
		private PriorityQueue<Evento> queue;

		public Simulator(int nT) {
			Tavolo t;
			NT = nT;
			for (int i = 1; i<=15; i++){
				if (i<=5){
					t = new Tavolo(i, 4);
					t.setStatus(TableStatus.LIBERO);
					this.tavoli.add(t);
					
				}
				if (i>5 && i<=9){
					t = new Tavolo(i, 6);
					t.setStatus(TableStatus.LIBERO);
					this.tavoli.add(t);

				}
				if (i>13){
					t = new Tavolo(i, 10);
					t.setStatus(TableStatus.LIBERO);
					this.tavoli.add(t);
				}
				else{
					t = new Tavolo(i, 8);
					t.setStatus(TableStatus.LIBERO);
					this.tavoli.add(t);
				}
			}
		}
		
		

}
