import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* String funcionarioUm;
        double salarioUm;
        String funcionarioDois;
        double salarioDois;
        String funcinarioTres;
        double salarioTres;
        String funcionarioQuatro;
        double salarioQuatro;
        char continuar = 'S';
        double media = 4.0;

       do {

            System.out.println("Digite o nome do funcinario um:");
            funcionarioUm = sc.next();

            System.out.println("Digite o salário um");
            salarioUm = sc.nextDouble();


            System.out.println("Digite o nome do funcinario dois:");
            funcionarioDois = sc.next();

            System.out.println("Digite o salário dois");
            salarioDois = sc.nextDouble();


            System.out.println("Digite o nome do funcinario três:");
            funcinarioTres= sc.next();

            System.out.println("Digite o salário três");
            salarioTres = sc.nextDouble();


            System.out.println("Digite o nome do funcinario quatro:");
            funcionarioQuatro = sc.next();

            System.out.println("Digite o salário quatro");
            salarioQuatro = sc.nextDouble();

            media = (salarioUm + salarioDois + salarioTres + salarioQuatro) / media;

            System.out.println(" Media salarial " + media);

            System.out.println ( "Deseja realizar uma nova media S ou N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        }while(continuar == 'S');
        sc.close();


    }*/

        double salarios;
        int qtdSalarios = 0;



        System.out.println("Informe a quantidade de salários para calcular a média: ");
        qtdSalarios = sc.nextInt();

       for(int i = 1; i <= qtdSalarios; i++){
           System.out.println("Digite o salário:  " + i );
           salarios = sc.nextDouble();

           System.out.println("Salários: " + salarios );



       }

      }


    }