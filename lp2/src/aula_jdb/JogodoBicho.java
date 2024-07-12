package aula_jdb;

import java.util.Random;
import java.util.Arrays;

public class JogodoBicho{
	
	static String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
	public static final int SIZE = 5; // Constant value for size
	
	
	public static void main(String[] args) {
		int[] cartela = new int[SIZE];
		FazAposta(cartela);
		ImprimeAposta(cartela);		
	}
	
	
	public static String pegaBicho(int valor) {
		if(valor >= 0 && valor < bichos.length) {
			return bichos[valor];
		} else {
			return "Numeração incorreta";
		}
	}
	
	public static void FazAposta(int[] bichos_random) {
		Random random = new Random(); 
		for(int j=0;j<SIZE;j++) {
			int valor_random = random.nextInt(bichos.length);
			bichos_random[j] = valor_random;
		}	
			
		Arrays.sort(bichos_random);
	}
	
	public static void ImprimeAposta(int[] bichos_random) {
		for(int bicho: bichos_random) {
			if (bicho <= 8) {
				System.out.println("["+(bicho+1)+"]"+ " ... " + pegaBicho(bicho));
			} else {
				System.out.println("["+(bicho+1)+"]"+ " .. " + pegaBicho(bicho));
			}
		}
	}
}