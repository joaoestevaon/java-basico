import java.util.Scanner;
public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String ag, nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o número da Agência!");
		num = sc.nextInt();
		
		System.out.println("Digite a Agência: ");
		ag = sc.next();
		
		System.out.println("Digite seu nome: ");
		nomeCliente = sc.next();
		
		System.out.println("Digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agêcia é "+ag+", conta "+num+" e seu saldo "+saldo+" já está disponível para saque");
		
		sc.close();
	}
}
