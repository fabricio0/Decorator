package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Cebola extends Adicional{

	public Cebola(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 0.7+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", cebola";
	}

}
