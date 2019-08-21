package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Tomate extends Adicional{

	public Tomate(Pao pao) {
		super(pao);
	}

	@Override
	public double preco() {
		return 1 + pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", tomate";
	}

}
