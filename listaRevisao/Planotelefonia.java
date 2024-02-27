import java.util.Scanner;
public class Planotelefonia {
    public static void main(String[] args) {
        
        double plan1 = 0, plan2 = 0, plan3 = 0;
        int minConsumo;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quanto é o seu consumo telefônico mensal: ");
        minConsumo = leitor.nextInt();

        calculoPlanos(plan1, plan2, plan3, minConsumo);
        leitor.close();

    }   
    static void calculoPlanos(double plan1, double plan2, double plan3,int minConsumo)
    {
        plan1 = minConsumo * 1.32 + 30;
        plan2 = minConsumo * 1.12 + 40;
        plan3 = minConsumo * 1.42 + 10;
        
        if(plan1 < plan2 && plan1 < plan2)
        {
            System.out.println("O primeiro plano é o mais barato! " + plan1);
        }else if(plan2 < plan1 && plan2 < plan3)
        {
            System.out.println("O segundo plano é o mais barato! " + plan2);
        }else if(plan3 < plan1 && plan3 < plan2)
        {
            System.out.println("O terceiro plano é o mais barato! " + plan3);
        }else
        {
            System.out.println("Erro");
        }     
    } 
}
