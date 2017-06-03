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
	public void test1(){
		jogadas.fazerJogada(jogador1, "1",tab );
		String resultado = tab.tab[0][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test2(){
		jogadas.fazerJogada(jogador1,"2",tab);
		String resultado = tab.tab[0][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test3(){
		jogadas.fazerJogada(jogador1,"3",tab);
		String resultado = tab.tab[0][2];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test4(){
		jogadas.fazerJogada(jogador1,"4",tab);
		String resultado = tab.tab[1][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test5(){
		jogadas.fazerJogada(jogador1,"5",tab);
		String resultado = tab.tab[1][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test6(){
		jogadas.fazerJogada(jogador1,"6",tab);
		String resultado = tab.tab[1][2];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test7(){
		jogadas.fazerJogada(jogador1,"7",tab);
		String resultado = tab.tab[2][0];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test8(){
		jogadas.fazerJogada(jogador1,"8",tab);
		String resultado = tab.tab[2][1];
		Assert.assertEquals("X", resultado);
	}
	@Test
	public void test9(){
		jogadas.fazerJogada(jogador1,"9",tab);
		String resultado = tab.tab[2][2];
		Assert.assertEquals("X", resultado);
	}
	
	//jogador2
	@Test
	public void test10() {
		jogadas.fazerJogada(jogador2,"1",tab);
		String resultado = tab.tab[0][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test11(){
		jogadas.fazerJogada(jogador2,"2",tab);
		String resultado = tab.tab[0][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test12(){
		jogadas.fazerJogada(jogador2,"3",tab);
		String resultado = tab.tab[0][2];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test13(){
		jogadas.fazerJogada(jogador2,"4",tab);
		String resultado = tab.tab[1][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test14(){
		jogadas.fazerJogada(jogador2,"5",tab);
		String resultado = tab.tab[1][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test15(){
		jogadas.fazerJogada(jogador2,"6",tab);
		String resultado = tab.tab[1][2];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test16(){
		jogadas.fazerJogada(jogador2,"7",tab);
		String resultado = tab.tab[2][0];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test17(){
		jogadas.fazerJogada(jogador2,"8",tab);
		String resultado = tab.tab[2][1];
		Assert.assertEquals("O", resultado);
	}
	@Test
	public void test18(){
		jogadas.fazerJogada(jogador2,"9",tab);
		String resultado = tab.tab[2][2];
		Assert.assertEquals("O", resultado);
	}
 //Metodo verficar vencedor 
	
	@Test
	public void verficarJogador1Ganhando(){
		jogadas.verificarVencedor(tab, jogador1);
		boolean resultado = true;
		Assert.assertEquals(true, resultado);
	}
	@Test
	public void verficarJogador1Empate(){
		jogadas.verificarVencedor(tab, jogador1);
		boolean resultado = false;
		Assert.assertEquals(false, resultado);
	}
	@Test
	public void verficarJogador2(){
		jogadas.verificarVencedor(tab, jogador2);
		boolean resultado = true;
		Assert.assertEquals(true, resultado);
	}
	@Test
	public void verficarJogador2Empate(){
		jogadas.verificarVencedor(tab, jogador2);
		boolean resultado = false;
		Assert.assertEquals(false, resultado);
	}
	
}
