package org.folug.consumi;

import java.util.GregorianCalendar;

import org.folug.consumi.model.Carburante;
import org.folug.consumi.model.Veicolo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Veicolo veicolo = new Veicolo("Punto 1.4", "Fiat", 60000, Carburante.BENZINA);
		veicolo.addRifornimento(Carburante.BENZINA, 60500, 40.0, 60.0, new GregorianCalendar(2015, 03, 1, 8, 0));
		veicolo.addRifornimento(Carburante.BENZINA, 61000, 40.0, 60.0, new GregorianCalendar(2015, 04, 1, 8, 0));
	}

}
