package org.folug.consumi.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


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

/**
 * Tipo di rifornimento generico
 * @author folug
 */
public class Rifornimento {

	/**
	 * Tipologia di carburante
	 */
	private Carburante carburante;
	
	private int distanza;
	
	private double quantita;
	
	private double costo;
	
	private Calendar data;
	
	/**
	 * Costruttore
	 * @param carburante Tipologia di carburante
	 * @param distanza Distanza effettuata
	 * @param quantita Quantità di carburante
	 * @param costo Costo del rifornimento
	 * @param data Data del rifornimento
	 */
	public Rifornimento(Carburante carburante, int distanza, double quantita, double costo, Calendar data){
		this.carburante = carburante;
		this.distanza = distanza;
		this.quantita = quantita;
		this.costo = costo;
		this.data = data;
	}

	/**
	 * Restituisce la tipologia di carburante
	 * @return the carburante
	 */
	public Carburante getCarburante() {
		return carburante;
	}

	/**
	 * Restituisce la distanza effettuata dal rifornimento precedente
	 * @return the distanza
	 */
	public int getDistanza() {
		return distanza;
	}

	/**
	 * Ritorna la quantià di carburante
	 * @return the quantita
	 */
	public double getQuantita() {
		return quantita;
	}

	/**
	 * Ritorna il costo del rifornimento
	 * @return the costo
	 */
	public double getCosto() {
		return costo;
	}

	/**
	 * Ritorna la data del rifornimento
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss",Locale.ITALIAN);
		return sdf.format(data.getTime())+" - "+carburante.name()+" - "+distanza+"km - "+costo+"euro - "+quantita+carburante.getUnita();
	}

}
