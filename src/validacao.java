public class validacao {
	
	static boolean validaString(String str) {
		return str.matches("[A-Z][a-z\\u00C0-\\u00FF]+,?\\s[A-Z][a-z\\u00C0-\\u00FF]{1,13}[^0-9][^@, $, ^, *, (, ), +, {, }, [, ], \\, |, ?, -, .]");
	}
	
}