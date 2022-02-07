package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o codigo: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String slq = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(slq);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		}else {
			System.out.println("Nada feito!");
		}
		
		conexao.close();
		entrada.close();
		
	}
}
