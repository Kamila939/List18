import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static String number1 = "Начало";

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add(number1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Все функции");
        while (true) {
            String command = sc.nextLine();
            if (command.equals("вывести")) {
                System.out.println(list);
            }
            else if (command.equals("функции")) {
                System.out.println("Для добавления номера введите 'добавить'");
                System.out.println("Для удаления номера введите 'убрать'");
            }
            else if (command.equals("добавить")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("новый номер");
                String elementAdd = sc1.nextLine();
                list.add(elementAdd);
            }
            else if (command.equals("убрать")){
                System.out.println("номер, который нужно убрать");
                Scanner sc1 = new Scanner(System.in);
                int i = sc1.nextInt();
                list.remove(i);
            }
        }
    }
}