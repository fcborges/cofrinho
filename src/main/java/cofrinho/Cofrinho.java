package cofrinho;

import java.util.ArrayList;

public abstract class Cofrinho extends Moeda{
	public static double totalMoedas;
	public static ArrayList<Double> arrayMoedas = new ArrayList<>();
	public static ArrayList<String> arrayTipo = new ArrayList<>();
	public static void adicionar(double moeda, String tipo) {
		arrayMoedas.add(moeda);
		arrayTipo.add(tipo);
		System.out.println("Adicionado com sucesso");
		return;
	}
	public static void
	listar() {
		for (int i = 0; i < arrayMoedas.size(); i++) {
			String result = (i + 1 ) + " - " + arrayTipo.get(i) + " - " +Double.toString(arrayMoedas.get(i));
			System.out.println(result);
		}
		return;
	}
	public static void
	remover(int op��o) {
		System.out.println(op��o);
		arrayMoedas.remove(op��o - 1);
		arrayTipo.remove(op��o - 1);
		return;
	}
	public static double conveter() {

		System.out.println("heres");
		for (int i = 0; i < arrayMoedas.size(); i++) {
			totalMoedas += conveterMoeda(arrayMoedas.get(i), arrayTipo.get(i));
		}
		System.out.println(totalMoedas);
		return 0;
	}
}

