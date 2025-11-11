import java.util.Scanner;
import com.employeeprofile.Profile;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe os dados do funcionário:");

        System.out.print("Nome: ");
        String nome = scn.nextLine();

        System.out.print("Cargo: ");
        String cargo = scn.nextLine();

        System.out.print("ID: ");
        int id = scn.nextInt();

        System.out.print("CPF: ");
        int cpf = scn.nextInt();

        System.out.print("Salário: ");
        double salario = scn.nextDouble();

        Profile profile = new Profile(nome, cargo, id, cpf, salario);

        System.out.println("\n--- Dados do Funcionário ---");
        profile.exibirDados();

        scn.close();
    }
}