package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Rosbife extends Adicional{

	public Rosbife(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 3.80+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", rosbife";
	}

}
