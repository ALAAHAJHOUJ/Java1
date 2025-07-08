import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void modele()
    {
        for (int i = 0; i <20 ; i++) {
            for (int j=0;j<20-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++)
            {
                System.out.print("x");
            }
            System.out.println();

        }
    }

    public static int fact(int nb)
    {
        if(nb==0 || nb==1) return 1;
        else return fact(nb-1)*nb;
    }

    public static int puissance(int nb,int puiss)
    {
        if(puiss==0) return 1;
        else if(puiss==1) return nb;
        else return nb*puissance(nb,puiss-1);
    }

    public static void main(String[] args) {
     modele();
     System.out.println("le factorielle de 4 est:"+fact(4));
     System.out.println("le factorielle de 5 est :"+fact(5));
     System.out.println("la puissance de 5 a 2 est:"+puissance(5,2));
    }
}