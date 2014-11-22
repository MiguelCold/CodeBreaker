package co.edu.udea.codebreaker.code;

public class CodeBreaker {

	public static final String X = "X";
	public static final String HYPHEN = "-";
	private String numSecreto;

	public CodeBreaker(String clave) {
		numSecreto = clave;
	}

	public String validarPosicion(String parameter) {
		if(4 != parameter.length()){
			return "error";
		}
		char entrada, secreto;
		String result1 = "";
		String result2 = "";
		for (int i = 0; i < parameter.length(); i++) {
			entrada = parameter.charAt(i);
			secreto = numSecreto.charAt(i);
			if(!(entrada >='0' && entrada <='9')){
				return "error";
			}
			if (secreto == entrada) {
				result1 = result1 + "X";
			}else if(numSecreto.indexOf(entrada) != i 
					&& numSecreto.indexOf(entrada) != -1){
				result2 = result2 + "-"; 
			}
		}
		return result1.concat(result2);
	}
	
}