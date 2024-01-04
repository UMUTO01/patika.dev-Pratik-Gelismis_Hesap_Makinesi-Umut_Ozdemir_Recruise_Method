import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number: ");

        int argo = scan.nextInt();



        System.out.println(Pow(argo));
    }

    public static int Pow(int a ){


        if(a < 0){
            return -1;
        }

        if(a == 1 || a ==0){
            return 1;
        }

        a = a*Pow(a-1);

        return a;
    }
}

