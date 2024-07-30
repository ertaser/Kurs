import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        double[] many = new double[] {0.00,0.00,0.00};

        Scanner scaner = new Scanner(System.in);
        

        System.out.println("\nВведите текущий курс доллара");
        many[1] = scaner.nextDouble();

        System.out.printf("Курс доллара: %.2f\n",many[1]);


        System.out.printf("Введите количество рублей\n");
        many[2] = scaner.nextDouble();
        System.out.printf("Количество рублей: %.2f\n",many[2] );

        many[0] = many[2]/many[1];

        System.out.printf("Итого: %.2f долларов" ,many[0]);
        scaner.close();
    }
}
