package com.rafaelkohler.cadastrousuario.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtil {

	public static void enviarMensagem(String mensagem) {
		FacesMessage msg = new FacesMessage();
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public static void enviarMensagemDeAtencao(String mensagem) {
		FacesMessage msg = new FacesMessage();
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_WARN);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
