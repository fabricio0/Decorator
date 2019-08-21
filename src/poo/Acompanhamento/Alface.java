package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Alface extends Adicional{
	
	public Alface(Pao pao) {
		super(pao);
	}

	@Override
	public double preco() {
		return 3.5 + pao.preco();
	}
	
	public String getDescricao() {
		return  pao.getDescricao() + ", alface";
	}
	
}
