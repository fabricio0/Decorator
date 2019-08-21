package poo.Lanche.Teste;

import java.util.Scanner;

import poo.Acompanhamento.Frango;
import poo.Acompanhamento.Peixe;
import poo.Acompanhamento.Peru;
import poo.Acompanhamento.Presunto;
import poo.Acompanhamento.Rosbife;
import poo.Lanchonete.Centeio;
import poo.Lanchonete.PaoBranco;
import poo.Lanchonete.PaoIntegral;

public class Testelanche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int op,oppao;
		PaoBranco p1 = null;
		PaoIntegral p2 = null;
		Centeio p3 = null;
		Frango fr =null;
		Frango f1 =null;
		Frango f2 =null;
		Peixe pe1 =null;
		Peixe pe2 =null;
		Peixe pe3 =null;
		Presunto ps1 =null;
		Presunto ps2 =null;
		Presunto ps3 =null;
		Peru per1 =null;
		Peru per2 =null;
		Peru per3 =null;
		String nomepao = "";
		Rosbife ros1 = null;
		Rosbife ros2 = null;
		Rosbife ros3= null;
		//qtd
		int qtdt =0;
		int qtd =0;
		int qtdtotalpao = 0 ,qtdtotalcar =0,qtdMolho=0;
		while (qtdt < 2 ) {
			System.out.println("Bem vindo a  lanchonete !");
			System.out.println("escolha os itens abaixo:");
			System.out.println("1. Para escolher tipo de pão");
			System.out.println("2. Para escolher tipo de carne");
			System.out.println("3. Para escolher tipo de molho");
			System.out.println("4. Para escolher tipo de salada");
			op = ler.nextInt();
			switch (op) {
				case 1: 
					if (qtdtotalpao == 0) {
					System.out.println("1. Para escolher pão branco");
					System.out.println("2. Para escolher pão tradicional");
					System.out.println("3. Para escolher centeio");
					oppao = ler.nextInt();
					switch(oppao) {
						case 1: 
							p1 = new PaoBranco();
							nomepao = "Tradicional";
							break;
						case 2:
							p2 = new PaoIntegral();
							nomepao = "Integral";
							break;
						default:
							p3 = new Centeio();
							nomepao = "Centeio";
						
							
					}
					++qtdtotalpao;
					break;
					}
					else {
						System.out.println("já escolheu");
					}
				case 2: //frango, peixe, presunto, peru e rosbife;
					if (qtdtotalcar == 0) {
					System.out.println("1. Para escolher frango");
					System.out.println("2. Para escolher peixe");
					System.out.println("3. Para escolher presunto");
					System.out.println("4. Para escolher peru");
					System.out.println("5. Para escolher rosbife");
					oppao = ler.nextInt();
					switch (oppao) {
					case 1:
						if(nomepao.equals("Centeio")) {
							fr = new Frango(p3);
						}
						else if(nomepao.equals("Tradicional")){
							 f1 = new Frango(p1);
							}
							else {
							 f2 = new Frango(p2);
								}
						++qtdtotalcar;
						break;
					
					case 2:
						if(nomepao.equals("Centeio")) {
							pe1 = new Peixe(p3);
						}
						else if(nomepao.equals("Tradicional")){
							 pe2 = new Peixe(p1);
							}
							else {
							 pe3 = new Peixe(p2);
								}
						++qtdtotalcar;
						break;
					
			
					
				case 3:
					if(nomepao.equals("Centeio")) {
						ps1 = new Presunto(p3);
					}
					else if(nomepao.equals("Tradicional")){
						 ps2 = new Presunto(p1);
						}
						else {
						 ps3 = new Presunto(p2);
							}
					++qtdtotalcar;
					break;
				case 4:
					if(nomepao.equals("Centeio")) {
						per1 = new Peru(p3);
					}
					else if(nomepao.equals("Tradicional")){
						 per2 = new Peru(p1);
						}
						else {
						 per3 = new Peru(p2);
							}
					++qtdtotalcar;
					break;
				default:
					if(nomepao.equals("Centeio")) {
						ros1 = new Rosbife(p3);
					}
					else if(nomepao.equals("Tradicional")){
						 ros2 = new Rosbife(p1);
						}
						else {
						 ros3 = new Rosbife(p2);
							}
					++qtdtotalcar;
					
					}
					}
				
			}
			qtdt++;
		}
	}			

}
