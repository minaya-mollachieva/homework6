public class Main {
    public static void main(String[] args) {
        //Задача 1- Все числа от 1 до 10
        System.out.println("Задача 1");
     for(int i = 1; i <= 10; i = i + 1){
            System.out.println(i+ "");
        }
        //Задача 2- Все числа от 10 до 1
        System.out.println("Задача 2");
        for(int i = 10; i>=1; i = i-1){
            System.out.println(i+ "");
        }
        //Задача 3-все четные числа от 0 до 17
        System.out.println("Задача 3");
        for(int i = 2; i<=17; i = i+2){
            System.out.println(i+ "");
        }
        //Задача 4-все числа от 10 до −10 от бо́льшего числа к меньшему
        System.out.println("Задача 4");
        for(int i = 10; i>=-10; i = i-1){
            System.out.println(i+ "");
        }
        //Задача 5-все високосные года, начиная с 1904 года до 2096
        System.out.println("Задача 5");
        for (int i = 1904; i <=2096; i = i + 4){
            System.out.println( i+ "год является высокосным");
        }
        //Задача 6 - Последовательность чисел +7
        System.out.println("Задача 6");
        for (int i = 7; i <=98; i = i + 7){
            System.out.println(i+ "");
        }
        //Задача 7 - Последовательность чисел *2
        System.out.println("Задача 7");
        for (int i = 1; i <=512; i = i *2){
            System.out.println(i+ "");
        }
        //Задача 8-Ежемесячные накопления в размере 29000
        System.out.println("Задача 8");
        int cashSavings=0;
        int monthlySavings=29000;
        for (int i=1;i<=12;i=i+1){
            cashSavings=cashSavings+monthlySavings;
         System.out.println ("Месяц "+i+",сумма накоплений = "+cashSavings+" рублей");
        }
        //Задача 9-Ежемесячные накопления под 12% годовых
        System.out.println("Задача 9");
        int cashSaving = 0;
        int monthlySaving = 29000;
        for (int i = 1; i <= 12; i++) {
            cashSaving = cashSaving + cashSaving/100;
            cashSaving = cashSaving + monthlySaving;
            System.out.println("Месяц " + i + " Сумма накоплений равно " + cashSaving);
        }
        //Задача 10-Таблица умножения на 2
        System.out.println("Задача 10");
        for(int i = 1; i<=10; i++) {
           int result=2*i;
            System.out.println("2 * "+i+" = "+result);
        }
    }
}