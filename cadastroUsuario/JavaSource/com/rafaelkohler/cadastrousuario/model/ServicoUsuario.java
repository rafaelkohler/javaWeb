package com.rafaelkohler.cadastrousuario.model;

import java.util.ArrayList;

import com.rafaelkohler.cadastrousuario.entity.Usuario;

public class ServicoUsuario {
	
	private static ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	
	public static void cadastrarUsuario(Usuario usuario) {
		usuariosCadastrados.add(usuario);
	}
	
	public static ArrayList<Usuario> listar(){
		return usuariosCadastrados;
	}
	
	public static void excluirUsuario(Usuario usuario) {
		usuariosCadastrados.remove(usuario);
	}

}
