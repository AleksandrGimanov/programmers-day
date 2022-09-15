    import java.util.Scanner;

    public class Praktikum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                System.out.println("12.09."+year);// здесь нужно вывести результат
            }
            else {
                System.out.println("13.09."+year);
            }
        }

        public static boolean isLeapYear(int year) { // здесь нужно определить, является ли переданный год високосным
            if (year % 4 !=0  ){
                return  false;  // обычный
            }
            if (year % 4 ==0  ){ //високосный
                return  true;
            }
            else if(year % 400 ==0 ){ //високосный
                return true;
            }
            else if(year % 100 !=0 ) { // обычный
                return false;
            }
            return false;
        }
    }

