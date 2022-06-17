
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import utilitarios.Utilitarios;

public class salary {

    public static void main(String[] args) {

        List<Utilitarios> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos funcionarios você vai registrar?  ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("funcionarios #" + (i + 1) + ":");
            System.out.println("Digite ID do funcionario: ");
            int id = input.nextInt();

            while (hasId(list, id)) {

                System.out.println("esse Id ja está registrado");
                id = input.nextInt();

            }

            input.nextLine();
            System.out.println("Digite o nome do funcionario: ");
            String name = input.nextLine();

            System.out.println("Digite o salario do funcionario: ");
            double salary = input.nextDouble();

            Utilitarios ult = new Utilitarios(name, salary, id);

            list.add(ult);
        }

        System.out.println("Quer da aumento para algum fisioncionario? ");
        char anser = input.next().charAt(0);

        if (anser == 's') {

            System.out.println("enter para procurar funcionario que vai receber o aumento : ");
            int idsalary = input.nextInt();

            Utilitarios ult = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

            if (ult == null) {

                System.out.println("Esse ID não exite!");
            } else {

                System.out.println("enter para porcentagem");
                double percent = input.nextDouble();
                ult.addsalary(percent);
            }
        }
        System.out.println();
        System.out.println("Lista de funcionarios");
        for (Utilitarios e : list) {
            System.out.println(e);
        }

        System.out.println("Algum funcionario foi demitido? ");
        anser = input.next().charAt(0);

        if (anser == 's') {
            System.out.println("enter para procurar funcionario que foi demitido : ");
            int idsalary = input.nextInt();

            Utilitarios ult = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

            if (ult == null) {
                System.out.println("Id não existe!");

            } else {
                System.out.println("Removido");
                list.remove(ult);
            }
        }
        System.out.println();
        System.out.println("Lista de funcionarios");
        for (Utilitarios e : list) {
            System.out.println(e);
        }
    }

    public static Integer position(List<Utilitarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Utilitarios> list, int id) {
        Utilitarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
