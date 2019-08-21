package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Frango extends Adicional{

	public Frango(Pao pao) {
		super(pao);
		
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 6.50+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", Frango";
	}

}
