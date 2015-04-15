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

/**
 * Tipologie di carburante
 * @author Folug
 *
 */
public enum Carburante {
	
	BENZINA("l"),
	DIESEL("l"),
	GPL("l"),
	METANO("kg"),
	ELETTRICA("kWh");
	
	private String unita;
	
	/**
	 * Costruttore privato
	 * @param unita Unità di misura
	 */
	private Carburante(String unita){
		this.unita = unita;
	}
	
	/**
	 * Ritorna l'unità di misura predefinata per il carburante
	 * scelto
	 * @return Unità di misura standard
	 */
	public String getUnita(){
		return unita;
	}
}
