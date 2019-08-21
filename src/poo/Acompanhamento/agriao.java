package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class agriao extends Adicional{

	public agriao(Pao pao) {
		super(pao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 1.7+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", agrião";
	}

}
