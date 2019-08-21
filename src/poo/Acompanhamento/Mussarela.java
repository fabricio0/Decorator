package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Mussarela extends Adicional{
	public Mussarela(Pao pao) {
		super(pao);
	}

	public double preco() {
		return 12 + pao.preco();
	}
	
	public String getDescricao() {
		return  pao.getDescricao() + ", mussarela";
	}
}
