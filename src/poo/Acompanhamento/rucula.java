package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class rucula extends Adicional{

	public rucula(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 0.9+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", rucula";
	}

}
