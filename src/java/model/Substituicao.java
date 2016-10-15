
package model;




public class Substituicao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Cifra.
	 * 
	 * @param mensagem
	 * @param chave
	 * @return
	 */
	public static String cifra(String mensagem, int chave) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < mensagem.length(); i++) {
			char c = (char) (mensagem.charAt(i) + chave);
			builder.append(c);
		}

		return builder.toString();
	}

	/**
	 * Decifra.
	 * 
	 * @param mensagem
	 * @param chave
	 * @return
	 */
	public static String decifra(String mensagem, int chave) {
		return cifra(mensagem, -chave);
	}

	/**
	 * Cifrar.
	 * 
	 * @param mensagem
	 * @param chave
	 * @return
	 */
//	public static String cifrar(String mensagem, int chave) {
//		return cifra(mensagem, +chave);
//	}
	
	
	public static String cifrar(String mensagem, int chave) {
	return cifra(mensagem, +chave);
}
	

}/* FIM CLASS */
