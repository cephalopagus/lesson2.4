import java.util.*;

public class Main {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("___Введите пять имен для списка 'А'___");
        String str;
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ": ");
            str = in.nextLine();
            names.add(str);
        }
        System.out.println("___Cписок 'А'___");
        for (String s: names
             ) {
            System.out.print(s+ "    ");
        }




        System.out.println("\n___Введите пять имен для списка 'Б'___");
        ArrayList<String> names2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ": ");
            str = in.nextLine();
            names2.add(str);
        }
        System.out.println("___Cписок 'Б'___");
        for (String s: names2
        ) {
            System.out.print(s+ "    ");
        }
        System.out.println();




        ArrayList<String> names3 = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            names3.add(names.get(i));
        }
        int index = 1;
        for (int i = names.size()-1; i>=0; i--) {
            names3.add(index, names2.get(i));
            index+=2;
        }
        System.out.println("___Cписок 'C'___");
        for (String s: names3
        ) {
            System.out.print(s+ "    ");
        }




        names3.sort(Comparator.comparingInt(String::length));
        System.out.println("\n___Отсоритированный список 'C'___");
        for (String s: names3
        ) {
            System.out.print(s+ "    ");
        }



    }
}