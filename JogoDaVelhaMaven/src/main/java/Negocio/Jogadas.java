package Negocio;
public class Jogadas {

	public boolean VerificarJogadas(String posicao, Tabuleiro tab){
		if(posicao.equals("1")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("2")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("3")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("4")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("5")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("6")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("7")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("8")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}else if(posicao.equals("9")){
			if(tab.tab[0][0]=="X" && tab.tab[0][0]=="O"){
				return true;
			}
		}
		
		return false;
		

	}


	public void fazerJogada(Jogador j,String posicao, Tabuleiro tab) {

		if(posicao.equals("1")){
			if(tab.tab[0][0]!="X" && tab.tab[0][0]!="O"){
				tab.tab[0][0] = j.getSimbolo(); 
			}
		}else if(posicao.equals("2")){
			if(tab.tab[0][1]!="X" && tab.tab[0][1]!="O"){
				tab.tab[0][1] = j.getSimbolo();
			}
		}else if(posicao.equals("3")){
			if(tab.tab[0][2]!="X" && tab.tab[0][2]!="O"){
				tab.tab[0][2] = j.getSimbolo();
			}
		}else if(posicao.equals("4")){
			if(tab.tab[1][0]!="X" && tab.tab[1][0]!="O"){
				tab.tab[1][0] = j.getSimbolo();
			}
		}else if(posicao.equals("5")){
			if(tab.tab[1][1]!="X" && tab.tab[1][1]!="O"){
				tab.tab[1][1] = j.getSimbolo();
			}
		}else if(posicao.equals("6")){
			if(tab.tab[1][2]!="X" && tab.tab[1][2]!="O"){
				tab.tab[1][2] = j.getSimbolo();
			}
		}else if(posicao.equals("7")){
			if(tab.tab[2][0]!="X" && tab.tab[2][0]!="O"){
				tab.tab[2][0] = j.getSimbolo();
			}
		}else if(posicao.equals("8")){
			if(tab.tab[2][1]!="X" && tab.tab[2][1]!="O"){
				tab.tab[2][1] = j.getSimbolo();
			}
		}else if(posicao.equals("9")){
			if(tab.tab[2][2]!="X" && tab.tab[2][2]!="O"){
				tab.tab[2][2] = j.getSimbolo();

			}
		}

	}

	public boolean verificarVencedor(Tabuleiro tab, Jogador j){
		if(tab.tab[0][0] == tab.tab[0][1] && tab.tab[0][0]== tab.tab[0][2]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[1][0] == tab.tab[1][1] && tab.tab[1][0] == tab.tab[1][2]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[2][0] == tab.tab[2][1] && tab.tab[2][0] == tab.tab[2][2]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[0][0] == tab.tab[1][0] && tab.tab[0][0] == tab.tab[2][0]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[0][1] == tab.tab[1][1] && tab.tab[0][1] == tab.tab[2][1]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[0][2] == tab.tab[1][2] && tab.tab[0][2] == tab.tab[2][2]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[0][0] == tab.tab[1][1] && tab.tab[0][0] == tab.tab[2][2]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}else if(tab.tab[0][2] == tab.tab[1][1] && tab.tab[0][2] == tab.tab[2][0]){
			System.out.println(j.getNome()+" Parabéns você ganhou ");
			return true;
		}
		return false;
	}

}



