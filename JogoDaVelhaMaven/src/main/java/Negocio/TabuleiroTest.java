package Negocio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TabuleiroTest {

	Tabuleiro tab =new Tabuleiro();

	//Construir Tabuleiro
	@Test
	public void construirTabuleiroTest(){
		tab.construirTabuleiro();
		String resultado = tab.tab[0][0] = "1";
		String resultado2 = tab.tab[0][1] = "2";
		String resultado3 =tab.tab[0][2] = "3";

		String resultado4 =tab.tab[1][0] = "4";
		String resultado5 =tab.tab[1][1] = "5";
		String resultado6 =tab.tab[1][2] = "6";

		String resultado7 =tab.tab[2][0] = "7";
		String resultado8 =tab.tab[2][1] = "8";
		String resultado9 =tab.tab[2][2] = "9";

		Assert.assertEquals(tab.tab[0][0],resultado);
		Assert.assertEquals(tab.tab[0][1],resultado2);
		Assert.assertEquals(tab.tab[0][2],resultado3);

		Assert.assertEquals(tab.tab[1][0],resultado4);
		Assert.assertEquals(tab.tab[1][1],resultado5);
		Assert.assertEquals(tab.tab[1][2],resultado6);

		Assert.assertEquals(tab.tab[2][0],resultado7);
		Assert.assertEquals(tab.tab[2][1],resultado8);
		Assert.assertEquals(tab.tab[2][2],resultado9);
	}

	//Imprimir Tabuleiro
	public void imprimirTabuleiroTest(){
		tab.imprimirTabuleiro();
		String resultado = "1 | 2 | 3" +"/n"+ " 4 | 5 | 6" +"/n"+"7 | 8 | 9";
		Assert.assertEquals(tab, resultado);
	}
}
