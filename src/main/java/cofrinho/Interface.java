//INTERFACE
package cofrinho;
import java.util.Scanner;

//Criada essa classe pra separar a interface da logica do projeto
public class Interface extends Cofrinho {
	public static double moeda;
	public static int op��o;
	public static int tipo;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Trabalho de cofrinho em Java de Eduardo Carvalho da Silva");
		System.out.println("------------------- Cofrinho ----------------------");
		menu();

		return;
	}
	
	public static void menu() throws InterruptedException {
		Scanner usuario = new Scanner(System.in);
		System.out.println("Selecione abaixo umas das op��o!");
		//Thread.sleep(500);
		System.out.println("1 - Adicionar moeda \n2 - Listar moeda(s) \n3 - Remover moedas \n4 - Converter tudo pra real \n5 - Sair");
		//Thread.sleep(200);
		op��o = usuario.nextInt();

		//Adicionar moedas

		if(op��o == 1) {
			System.out.println("Selecione o tipo de moeda");
			System.out.println("1 - Real \n2 - Dolar \n3 - Euro \n4 - Voltar");
			
			tipo = usuario.nextInt();
			//Thread.sleep(500);
			System.out.println("Digite um valor decimal e com separador ',':");
			moeda = usuario.nextDouble();
			
			if(tipo == 1) {
				adicionar(moeda,"real");
				menu();
			}
			
			if(tipo == 2) {
				adicionar(moeda,"dolar");
				menu();

			}
			
			if(tipo == 3) {
				adicionar(moeda,"euro");
				menu();
			}
		}
		
		//Listar moedas
		if(op��o == 2) {
			System.out.println("Moedas listadas");
			listar();
			Thread.sleep(500);
			menu();
		}
		
		//Remover moeda
		if(op��o == 3) {
			System.out.println("Selecione qual moeda deseja remover");
			Thread.sleep(500);
			listar();
			
			op��o = usuario.nextInt();
			remover(op��o);
			menu();
		}

		//Converter tudo pra real
		if(op��o == 4) {
			conveter();
			menu();
		}
		
		if(op��o == 5) {
			System.out.println("Tchau!");
			System.exit(0);
		}else if(op��o >=6) {
			System.out.println("Op��o invalida!");
			menu();
		}
	}
}