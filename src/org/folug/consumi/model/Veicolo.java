package org.folug.consumi.model;

/**
 * This file is part of Consumi for Android software.
 *
 *  Consumi is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Consumi is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Consumi.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe che rappresenta il veicolo per cui devono essere salvati
 * i consumi
 * @author folug
 */
public class Veicolo {

	private Carburante alimentazione1, alimentazione2;
	
	private String modello, marca, targa;
	
	private int km;
	
	private ArrayList<Rifornimento> rifornimenti;
	
	/**
	 * Costruttore
	 * @param modello Modello del veicolo
	 * @param marca Marca del veicolo
	 * @param alimentazione Carburante 1
	 */
	public Veicolo (String modello, String marca, Carburante alimentazione){
		this(modello,marca,alimentazione,null);
	}
	
	/**
	 * Costruttore
	 * @param modello Modello del veicolo
	 * @param marca Marca del veicolo
	 * @param alimentazione1 Carburante 1
	 * @param alimentazione2 Carburante 2
	 */
	public Veicolo(String modello, String marca, Carburante alimentazione1, Carburante alimentazione2){
		this.modello = modello;
		this.marca = marca;
		rifornimenti = new ArrayList<Rifornimento>();
		this.alimentazione1 = alimentazione1;
		this.alimentazione2 = alimentazione2;
	}

	/**
	 * Ritorna la targa
	 * @return the targa
	 */
	public String getTarga() {
		return targa;
	}

	/**
	 * Imposta la targa
	 * @param targa the targa to set
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/**
	 * Ritorna l'alimentazione principale
	 * @return the alimentazione1
	 */
	public Carburante getAlimentazione1() {
		return alimentazione1;
	}

	/**
	 * Ritorna l'alimentazione secondaria
	 * @return the alimentazione2
	 */
	public Carburante getAlimentazione2() {
		return alimentazione2;
	}

	/**
	 * Ritorna il modello del veicolo
	 * @return the modello
	 */
	public String getModello() {
		return modello;
	}

	/**
	 * Ritorna la marca del veicolo
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Ritorna i km del veicolo
	 * @return the km
	 */
	public int getKm() {
		return km;
	}
	
	/**
	 * Imposta i km del veicolo
	 * @param km del veicolo
	 */
	public void setKm(int km) {
		if(km<0) return;
		this.km = km;
	}
	
	/**
	 * Aggiungi i rifornimenti nell'array list relativa
	 * @param carburante Tipo di carburante
	 * @param km indicati nel contachilometri
	 * @param quantita di carburante
	 * @param costo totale del rifornimento
	 * @param data data del rifornimento
	 * @return
	 */
	public boolean addRifornimento(Carburante carburante, int km, double quantita, double costo, Calendar data){
		Rifornimento rif = new Rifornimento(carburante, km-this.km, quantita, costo, data);
		rifornimenti.add(rif);
		return true;
	}
	
}
