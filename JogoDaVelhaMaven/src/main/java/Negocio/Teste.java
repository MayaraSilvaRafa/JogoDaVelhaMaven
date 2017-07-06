package Negocio;
import java.util.Scanner;

public class Teste {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();

		System.out.println("Escreva seu nome, você será X");
		String nome1 = sc.next();
		Jogador jogador1 = new Jogador(nome1, "X");
		System.out.println("Escreva seu nome, você será O");
		String nome2 = sc.next();
		Jogador jogador2 = new Jogador(nome2 , "O");

		tab.construirTabuleiro();
		tab.imprimirTabuleiro();

		Jogadas jogadas = new Jogadas();

		for (int i = 0; i < 9; i++) {
			System.out.println("Qual posição você deseja jogar");
			String posicao = sc.next();

			if(i%2==0){
				if(jogadas.VerificarJogadas(posicao, tab) == true){
					System.out.println("Escolha uma nova posição");
					String novaPosicao = sc.next();
					jogadas.fazerJogada(jogador1, novaPosicao, tab);
				}else if(jogadas.VerificarJogadas(posicao, tab) == false){
					jogadas.fazerJogada(jogador1, posicao, tab);
				}
				if(jogadas.verificarVencedor(tab, jogador1)){
					break;
				}
				tab.imprimirTabuleiro();    

			}else{
				if(jogadas.VerificarJogadas(posicao, tab) == true){
					System.out.println("Escolha uma nova posição");
					String novaPosicao = sc.next();
					jogadas.fazerJogada(jogador2, novaPosicao, tab);
				}else if(jogadas.VerificarJogadas(posicao, tab) == false){
					jogadas.fazerJogada(jogador2, posicao, tab);
				}
				if(jogadas.verificarVencedor(tab, jogador2)){
					break;
				}
				tab.imprimirTabuleiro();
			} 
		}


		if(jogadas.verificarVencedor(tab, jogador1)== false){
			System.out.println("O jogo deu empate");
		}


	}


}
