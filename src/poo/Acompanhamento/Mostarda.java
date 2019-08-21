package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Mostarda extends Adicional{

	public Mostarda(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 1.2+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", mostarda";
	}
	
}
