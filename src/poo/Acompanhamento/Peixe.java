package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Peixe extends Adicional{

	public Peixe(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 7.30+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", Peixe";
	}

}
