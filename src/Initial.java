import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Initial {
	
	/*public static boolean isName(String name){
		Pattern p = Pattern.compile("[A-Z][a-z]+ ([A-Z][a-z]* )?[A-Z][a-z]+");
		Matcher m = p.matcher(name);
		return m.matches();
	}*/
	
	/*public static boolean isEmail(String email){
		Pattern p = Pattern.compile("[a-z]+@[a-z]+(.com.br|.br)");
		Matcher m = p.matcher(email);
		return m.matches();
	}*/
	
	/*public static boolean isPassword(String pass){
		Pattern p = Pattern.compile("^(?![0-9]+$)(?![A-Z]+$)(?![a-z]+$)(?![a-zA-Z]+$)(?![a-z0-9]+$)[a-zA-Z0-9]*$");
		int lengthPattern = 8;
		if (pass.length() == lengthPattern) {
			Matcher m = p.matcher(pass);
			return m.matches();
		} else {
			return false;
		}		
	}*/
	
	/*public static boolean isCPF(String cpf){
		Pattern p = Pattern.compile("[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9]-[0-9][0-9]");
		Matcher m = p.matcher(cpf);
		return m.matches();
	}*/
	
	/*/public static boolean isPhone(String phone){
		Pattern p = Pattern.compile("(\\([0-9][0-9]\\) [9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])|(\\([9][0-9]\\) [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])|([0-9][0-9] [9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])");
		Matcher m = p.matcher(phone);
		return m.matches();
	}*/
	
	/*public static boolean isDate(String date){
		Pattern p = Pattern.compile("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9] [0-2][0-3]:[0-5][0-9]:[0-5][0-9]");
		Matcher m = p.matcher(date);
		return m.matches();
	}*/
	
	public static boolean isNumber(String number){
		Pattern p = Pattern.compile("[\\+|\\-]?[0-9]+\\.[0-9]+|[\\+|\\-]*[0-9]+");
		Matcher m = p.matcher(number);
		return m.matches();
	}

	public static void main(String[] args) {
		//sentenças aceitas: "Ada Lovelace", "Alan Turing", "Stephen Cole Kleene".
		//cadeias rejeitadas: "1Alan", "Alan", "A1an", "A1an Turing", "Alan turing".
		/*String names[] = {"Ada Lovelace", "Alan Turing", "Stephen Cole Kleene", "1Alan", "Alan", "A1an", "A1an Turing", "Alan turing"};
	
		for (String string : names)
			System.out.println(isName(string));*/
		
		//sentenças aceitas: "a@a.br", "divulga@ufpa.br", "a@a.com.br".
		//cadeias rejeitadas: "@", "a@.br", "@a.br", "T@teste.br", "a@A.com.br".
		/*String emails[] = {"a@a.br", "divulga@ufpa.br", "a@a.com.br", "@", "a@.br", "@a.br", "T@teste.br", "a@A.com.br"};
		
		for (String string : emails)
			System.out.println(isEmail(string));*/
		
		//sentenças aceitas: "518R2r5e", "F123456A", "1234567T", "ropsSoq0".
		//cadeias rejeitadas: "F1234567A", "abcdefgH", "1234567HI".
		/*String passwords[] = {"518R2r5e", "F123456A", "1234567T", "ropsSoq0", "F1234567A", "abcdefgH", "1234567HI"};
		
		for (String string : passwords)
			System.out.println(isPassword(string));*/
		
		//sentenças aceitas: "123.456.789-09", "000.000.000-00".
		//cadeias rejeitadas: "123.456.789-0", "111.111.11-11".
		/*String cpfs[] = {"123.456.789-09", "000.000.000-00", "123.456.789-0", "111.111.11-11"};
		
		for (String string : cpfs)
			System.out.println(isCPF(string));*/
		
		//sentenças aceitas: "(91) 99999-9999", "(91) 999999999", "91 999999999".
		//cadeias rejeitadas: "(91) 59999-9999", "99 99999-9999", "(94)95555-5555".
		/*String phones[] = {"(91) 99999-9999", "(91) 999999999", "91 999999999", "(91) 59999-9999", "99 99999-9999", "(94)95555-5555"};
		
		for (String string : phones)
			System.out.println(isPhone(string));*/
		
		//sentenças aceitas: "31/08/2019 20:14:55", "99/99/9999 23:59:59".
		//cadeias rejeitadas: "99/99/9999 3:9:9", "9/9/99 99:99:99", "99/99/999903:09:09".
		/*String dates[] = {"31/08/2019 20:14:55", "99/99/9999 23:59:59", "99/99/9999 3:9:9", "9/9/99 99:99:99", "99/99/999903:09:09"};
		
		for (String string : dates)
			System.out.println(isDate(string));*/
		
		//sentenças aceitas: "-25.467", "1", "-1", "+1", "64.2".
		//cadeias rejeitadas: "1.", ".2", "+64,2".
		String numbers[] = {"-25.467", "1", "-1", "+1", "64.2", "1.", ".2", "+64,2"};
		
		for (String string : numbers)
			System.out.println(isNumber(string));
		
	}
}
