package exercicios;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "Beatriz Rorigues", 1000));
		System.out.println(dao.incluir(sql, "Igor Henrique", 1001));
		System.out.println(dao.incluir(sql, "Erik Pedro", 1002));
		
		dao.close();
	}
}
