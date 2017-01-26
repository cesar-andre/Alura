package testeIO;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestandoJavaIO {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream("saida.txt");
		
		System.out.println("Digite sua mensagem:");

        while (sc.hasNextLine()) {
            ps.println(sc.nextLine());
        }
		
		sc.close();
		ps.close();

	}
}
