package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Peru extends Adicional{

	public Peru(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 4+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", Peru";
	}

}
