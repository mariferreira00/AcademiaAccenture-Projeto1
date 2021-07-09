package dados;

import java.sql.*;
import java.util.*;

import negocio.Professor;

public class ProfessorDAO {
	private Connection con = null;

	public ProfessorDAO() {	
		this.con = new ConexaoFactory().getConnection();		
	}

	public void adiciona(Professor professor) {
		
		String sql = "INSERT INTO professor(nome, cpf_prof, idade, salario) VALUES(?,?,?,?)";
		

		try {
			PreparedStatement stmt = con.prepareStatement(sql);		
			
			stmt.setString(1, professor.getNome());
			stmt.setString(2, professor.getCpf());
			stmt.setInt(3, professor.getIdade());
			stmt.setDouble(4, professor.getSalario());

			stmt.execute();
			stmt.close();

			System.out.println("Professor(a) registrado(a) com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Professor> getLista() {
		
		List<Professor> professores = new ArrayList<Professor>();
		
		String sql = "SELECT * FROM professor";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Professor professor = new Professor(rs.getString("nome"), rs.getString("cpf_prof"), rs.getInt("idade"), rs.getDouble("salario"));
				
				professores.add(professor);
			}
			
			rs.close();
			stmt.close();
			return professores;
		} catch (SQLException e) {			
			throw new RuntimeException(e);
		}		
	}	
}