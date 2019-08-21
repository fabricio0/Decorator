package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Presunto extends Adicional {

	public Presunto(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 2+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", Presunto";
	}

}
