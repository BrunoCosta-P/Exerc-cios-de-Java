
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
		if ( idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		}else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
