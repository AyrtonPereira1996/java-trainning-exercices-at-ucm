package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Aplicacao {

	public static void main(String[] args) throws SQLException {
//		Estudante[] estudantes = new Estudante[2];
		Connection conexao = new Conexao().getConexao();
		try {
			System.out.println("Conexao aberta");
			conexao.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		Estudante est1 = new Estudante();
		est1.setId(1L);
		est1.setNomeEstudante("Joana");
		est1.setEmailEstudante("Joana@gmail.com");
		est1.setEndereco("Avenida da Liberdade");

		Estudante est2 = new Estudante();
		est2.setId(2L);
		est2.setNomeEstudante("Ayrton");
		est2.setEmailEstudante("ayrton_pereira1996@hotmail.com");
		est2.setEndereco("Rua das mangas");
		
		EstudanteDAO edao = new EstudanteDAO();
//		edao.inserir(est1);
//		edao.inserir(est2);
		
	
//		estudantes[0] = est1;
//		estudantes[1] = est2;
		
		java.util.List<Estudante> estudantes = new ArrayList<Estudante>();
		estudantes.add(est1);
		estudantes.add(est2);
		
		for(Estudante e : edao.listar()) {
			if (estudantes != null) {
				System.out.println("Id do estudante: " + e.getId() + "\n" + "Nome estudante: "
						+ e.getNomeEstudante() + "\n" + "E-mail: " + e.getEmailEstudante()
						+ "\n" + "Endereco: " + e.getEndereco() + "\n");
			} else {
				System.out.println("Lista vazia!");
			}

		}

//		for (int i = 0; i < estudantes.length; i++) {
////			if (estudantes[i] != null) {
//				System.out.println("Id do estudante: " + estudantes[i].getId() + "\n" + "Nome estudante: "
//						+ estudantes[i].getNomeEstudante() + "\n" + "E-mail: " + estudantes[i].getEmailEstudante()
//						+ "\n" + "Endereco: " + estudantes[i].getEndereco() + "\n");
//			} else {
//				System.out.println("Lista vazia!");
//			}

		}
	}


