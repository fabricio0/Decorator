package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Pickles extends Adicional{
	
	public Pickles(Pao pao) {
		super(pao);
	}

	public double preco() {
		return 2 + pao.preco();
	}
	
	public String getDescricao() {
		return  pao.getDescricao() + ", mussarela";
	}
}
