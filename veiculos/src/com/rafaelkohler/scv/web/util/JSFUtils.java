package com.rafaelkohler.scv.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe para eventos utilitários de JSF
 * 
 * @author Rafael Kohler
 *
 */
public class JSFUtils {

	/**
	 * Envia uma mensagem de sucesso para a tela usando JSF
	 * 
	 * @param mensagem
	 */
	public static void enviarMensagemDeSucesso(String mensagem) {
		
		FacesMessage msg = new FacesMessage();
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}

}




