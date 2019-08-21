package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Azeitona extends Adicional{

	public Azeitona(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 2+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", azeitona";
	}

}
