package Negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabuleiroTest {

	Tabuleiro tab =new Tabuleiro();

	//Construir Tabuleiro
	@Test
	public void constriurTabuleiro(){
		String tabuleiro = tab.construirTabuleiro(
				tab.tab[0][0] = "1",tab.tab[0][1] = "2",tab.tab[0][2]="3",
				tab.tab[1][0] = "4",tab.tab[1][1] = "5", tab.tab[1][2]= "6",
				tab.tab[2][0]= "7",tab.tab[2][1] = "8",tab.tab[2][2]="9");
		Assert.assertEquals(tab);
	}
}
