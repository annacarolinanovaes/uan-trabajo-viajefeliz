package servico;

import servico.impl.AlquilerServicoImpl;
import servico.impl.ArrendatarioServicoImpl;
import servico.impl.CabanaOCasaServicoImpl;
import servico.impl.EncuestaSatisfacionServicoImpl;
import servico.impl.UsuarioServicoImpl;

public class ServicoFactory {

	
	public static CabanaOCasaServico criarCabanaOCasaServico(){
		return new CabanaOCasaServicoImpl();
	}

	public static ArrendatarioServico criarArrendatarioServico() {
		return new ArrendatarioServicoImpl();
	}
	
	public static EncuestaSatisfacionServico criarEncuestaSatisfacionServico() {
		return new EncuestaSatisfacionServicoImpl();
	}

	public static UsuarioServico criarUsuarioServico() {
		return new UsuarioServicoImpl();
	}

	public static AlquilerServico criarAlquilerServico() {
		return new AlquilerServicoImpl();
	}


}
