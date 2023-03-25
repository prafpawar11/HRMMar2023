package TestLayer;

public class Demo1 {

	public static void main(String[] args) {
		String a = "java";

		char[] abc = a.toCharArray();

		for (int i = abc.length - 1; i >= 0; i--) {
			System.out.print(abc[i]);
		}

	}

}
