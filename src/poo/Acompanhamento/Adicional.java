package poo.Acompanhamento;

import poo.Lanchonete.Pao;

	public abstract class Adicional extends Pao{
	protected Pao pao;
	
	public Adicional(Pao pao) {
		this.pao = pao;
	}
}
