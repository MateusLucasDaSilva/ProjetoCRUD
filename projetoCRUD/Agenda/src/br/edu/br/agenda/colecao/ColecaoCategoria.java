package br.edu.br.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifba.agenda.basicas.Categoria;

public class ColecaoCategoria {
	
	public void adicionarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into Categoria (nome) values (?)");
			stmt.setString(1, c.getNome());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void atualizarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("UPDATE CATEGORIA SET nome = ? WHERE id = ?");
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void deletarCategoria(Categoria c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("DELETE FROM  CATEGORIA WHERE id = ?");
			stmt.setInt(1, c.getId());;
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void listarCategoria() {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("SELECT *FROM CATEGORIA;");
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
