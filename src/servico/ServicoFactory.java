package servico;

import servico.impl.CabanaOCasaServicoImpl;

public class ServicoFactory {

	
	public static CabanaOCasaServico criarCabanaOCasaServico(){
		return new CabanaOCasaServicoImpl();
	}

}
