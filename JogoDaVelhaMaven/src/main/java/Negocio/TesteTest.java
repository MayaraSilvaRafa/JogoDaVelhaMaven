package Negocio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteTest {
	
	Tabuleiro tab = new Tabuleiro();
	Jogadas jogadas = new Jogadas();
	Jogador jogador1 = new Jogador("nome1", "X");
	Jogador jogador2 = new Jogador("nome2", "O");
	
	//fazerJogada(Jogador j,String posicao, Tabuleiro tab)
	@Test
	public void fazerJogadaTest1(){
		jogadas.fazerJogada(jogador1, "1",tab );
		String resultado = tab.tab[0][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest2(){
		jogadas.fazerJogada(jogador1,"2",tab);
		String resultado = tab.tab[0][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest3(){
		jogadas.fazerJogada(jogador1,"3",tab);
		String resultado = tab.tab[0][2];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest4(){
		jogadas.fazerJogada(jogador1,"4",tab);
		String resultado = tab.tab[1][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest5(){
		jogadas.fazerJogada(jogador1,"5",tab);
		String resultado = tab.tab[1][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest6(){
		jogadas.fazerJogada(jogador1,"6",tab);
		String resultado = tab.tab[1][2];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest7(){
		jogadas.fazerJogada(jogador1,"7",tab);
		String resultado = tab.tab[2][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest8(){
		jogadas.fazerJogada(jogador1,"8",tab);
		String resultado = tab.tab[2][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void fazerJogadaTest9(){
		jogadas.fazerJogada(jogador1,"9",tab);
		String resultado = tab.tab[2][2];
		Assert.assertEquals("X", resultado);
	}
	
	//jogador2
	@Test
	public void fazerJogadaTest10() {
		jogadas.fazerJogada(jogador2,"1",tab);
		String resultado = tab.tab[0][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest11(){
		jogadas.fazerJogada(jogador2,"2",tab);
		String resultado = tab.tab[0][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest12(){
		jogadas.fazerJogada(jogador2,"3",tab);
		String resultado = tab.tab[0][2];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest13(){
		jogadas.fazerJogada(jogador2,"4",tab);
		String resultado = tab.tab[1][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest14(){
		jogadas.fazerJogada(jogador2,"5",tab);
		String resultado = tab.tab[1][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest15(){
		jogadas.fazerJogada(jogador2,"6",tab);
		String resultado = tab.tab[1][2];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest16(){
		jogadas.fazerJogada(jogador2,"7",tab);
		String resultado = tab.tab[2][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest17(){
		jogadas.fazerJogada(jogador2,"8",tab);
		String resultado = tab.tab[2][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void fazerJogadaTest18(){
		jogadas.fazerJogada(jogador2,"9",tab);
		String resultado = tab.tab[2][2];
		Assert.assertEquals("O", resultado);
	}
 //Metodo verficar vencedor 
	
	@Test
	public void verficarJogador1Ganhando(){
		jogadas.fazerJogada(jogador1, "1", tab);
		jogadas.fazerJogada(jogador1, "2", tab);
		jogadas.fazerJogada(jogador1, "3", tab);
		
		boolean resultado = jogadas.verificarVencedor(tab, jogador1);
		Assert.assertEquals(true, resultado);
	}
	@Test
	public void verficarJogador1Empate(){
		jogadas.fazerJogada(jogador1, "1", tab);
		jogadas.fazerJogada(jogador2, "2", tab);
		jogadas.fazerJogada(jogador1, "3", tab);
		jogadas.fazerJogada(jogador2, "4", tab);
		jogadas.fazerJogada(jogador1, "5", tab);
		jogadas.fazerJogada(jogador2, "7", tab);
		jogadas.fazerJogada(jogador1, "6", tab);
		jogadas.fazerJogada(jogador2, "9", tab);
		jogadas.fazerJogada(jogador1, "8", tab);
		boolean resultado = jogadas.verificarVencedor(tab, jogador1);
		Assert.assertEquals(false, resultado);
	}
	@Test
	public void verficarJogador2Ganhando(){
		jogadas.fazerJogada(jogador2, "1", tab);
		jogadas.fazerJogada(jogador2, "2", tab);
		jogadas.fazerJogada(jogador2, "3", tab);
		boolean resultado = jogadas.verificarVencedor(tab, jogador2);
		Assert.assertEquals(true, resultado);
	}
	@Test
	public void verficarJogador2Empate(){
		jogadas.fazerJogada(jogador1, "1", tab);
		jogadas.fazerJogada(jogador2, "2", tab);
		jogadas.fazerJogada(jogador1, "3", tab);
		jogadas.fazerJogada(jogador2, "4", tab);
		jogadas.fazerJogada(jogador1, "5", tab);
		jogadas.fazerJogada(jogador2, "7", tab);
		jogadas.fazerJogada(jogador1, "6", tab);
		jogadas.fazerJogada(jogador2, "9", tab);
		jogadas.fazerJogada(jogador1, "8", tab);
		boolean resultado = jogadas.verificarVencedor(tab, jogador2);
		Assert.assertEquals(false, resultado);
	}
	
	
}
