package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class parmesao extends Adicional{

	public parmesao(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 2.2+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", parmesão";
	}

}
