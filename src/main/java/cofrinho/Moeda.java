package cofrinho;

import moeda.Dolar;
import moeda.Euro;
import moeda.Real;

public class Moeda {

	public static double conveterMoeda(double moedas,
			String tipo) {
		if(tipo == "real")
		{
			Real real = new Real();
			real.conveterReal
			(moedas)
			;
		}
		if(tipo == "dolar")
		{
			Dolar dolar = new Dolar();
			return dolar.conveterReal(moedas)
					;
		}
		if(tipo == "euro") {
			Euro euro = new Euro();

			return euro.conveterReal(moedas)
					;
		}
		return moedas;
	}

}
