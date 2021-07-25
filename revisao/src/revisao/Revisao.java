package revisao;

public class Revisao {

	public static void main(String[] args) {
		
		String original = "fsadfasdfa DFADFASDFASDFASDFASDF       ";
		
		String s01 = original.toLowerCase();
		String s02 = original.trim();
		String s03 = original.substring(2);
		String s04 = original.substring(2, 9);
		int i = original.indexOf("fs");
		int j = original.lastIndexOf("DF");
				
		System.out.println(s01);
		System.out.println(s01.toUpperCase());
		System.out.println(s02 + "-");
		System.out.println("-" + s03 + "-");
		System.out.println("-" + s04 + "-");
		System.out.println(s01.replace("F", "f"));
		System.out.println(i);
		System.out.println(j);
		
	}

}
