package documin.elemento;

import documin.documento.Documento;

/**
 * Subtipo de Elemento. Além dos atributos de Elemento, Atalho guarda um documento referenciado por outro documento.
 * 
 * @author paulo.ricardo.pereira.nascimento
 */
public class Atalho extends Elemento {
	private Documento documento;
	
	/**
	 * Cria um Atalho.
	 * 
	 * @param documento Documento referenciado por outro documento.
	 */
	public Atalho(Documento documento) {
		super(documento.getMediaPrioridade(), documento.getTituloDoc());
		this.documento = documento;
	}
	
	/**
	 * Representação completa dos elementos do documento referenciado com prioridade igual a 4 ou 5. 
	 * 
	 * @return Representação completa dos elementos do documento referenciado.
	 */
	@Override
	public String toStringCompleto() {
		String toString = new String();
		
		for (Elemento elem : documento.getElementos()) {
			if (elem.getPrioridade() >= 4) {
				toString += elem.toStringCompleto() + "\n";
			}
		}
		
		return toString.strip();
	}
	
	/**
	 * Representação resumida dos elementos do documento referenciado com prioridade igual a 4 ou 5. 
	 * 
	 * @return Representação resumida dos elementos do documento referenciado.
	 */
	@Override
	public String toStringResumido() {
		String toString = new String();
		
		for (Elemento elem : documento.getElementos()) {
			if (elem.getPrioridade() >= 4) {
				toString += elem.toStringResumido() + "\n";
			}
		}
		
		return toString.strip();
	}
	
}
