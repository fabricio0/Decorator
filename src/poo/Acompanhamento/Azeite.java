package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Azeite extends Adicional{

	public Azeite(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 1.1+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", azeite";
	}

}
