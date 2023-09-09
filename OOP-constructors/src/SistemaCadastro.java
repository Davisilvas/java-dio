public class SistemaCadastro {
	public static void main(String[] args) {

		Pessoa davi = new Pessoa("000.000.007-00", "Davi");

		davi.setEndereco("RUA DAS MARIAS");

		System.out.println(davi.getNome() + " | " + davi.getCpf());
	}
}
