package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class EstudanteDAO {
	
	private Connection conexao;
	
	public EstudanteDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	public void inserir(Estudante e) {
		String sql = "insert into estudante (nome, email, endereco) values (?,?,?)";
		try {
			PreparedStatement statement = (PreparedStatement) conexao.prepareStatement(sql);
			statement.setString(1, e.getNomeEstudante());
			statement.setString(2, e.getEmailEstudante());
			statement.setString(3, e.getEndereco());
			statement.execute();
			statement.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
	}
	
	public List<Estudante> listar() throws SQLException{
		List<Estudante> lista = new ArrayList<Estudante>();
		String sql = "Select * from estudante";
		
			PreparedStatement stm = (PreparedStatement) conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Estudante est = new Estudante();
				est.setId(rs.getLong("id"));
				est.setNomeEstudante(rs.getString("nome"));
				est.setEmailEstudante(rs.getString("email"));
				est.setEndereco(rs.getString("endereco"));
				lista.add(est);
			}
		
		rs.close();
		return lista;
		
	}
}
