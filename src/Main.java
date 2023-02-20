import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Inside_punkts lavash1 = new Inside_punkts("Сырный", 20, 1);
    static Inside_punkts lavash2 = new Inside_punkts("Обычный", 10, 2);
    static Inside_punkts salad1 = new Inside_punkts("Айсберг", 20, 1);
    static Inside_punkts salad2 = new Inside_punkts("Латук", 30, 2);
    static Inside_punkts salad3 = new Inside_punkts("Романо", 15, 3);
    static Inside_punkts sause1 = new Inside_punkts("Сметанный", 10, 1);
    static Inside_punkts sause2 = new Inside_punkts("Чесночный", 20, 2);
    static Inside_punkts cheese1 = new Inside_punkts("Чеддер", 50, 1);
    static Inside_punkts cheese2 = new Inside_punkts("Маздам", 30, 2);
    static Inside_punkts cheese3 = new Inside_punkts("Рокфор", 80, 3);
    static Inside_punkts tomato1 = new Inside_punkts("Черри", 60, 1);
    static Inside_punkts tomato2 = new Inside_punkts("Сливовидные", 40, 2);
    static Inside_punkts meet1 = new Inside_punkts("Курица", 100, 1);
    static Inside_punkts meet2 = new Inside_punkts("Свинина", 120, 2);
    static Inside_punkts meet3 = new Inside_punkts("Говядина", 150, 3);

    static Inside_punkts[] lavash = new Inside_punkts[] {lavash1, lavash2};
    static Punkts punkt_lavash = new Punkts("Лаваш", lavash, 1);

    static Inside_punkts[] salad = new Inside_punkts[] {salad1, salad2, salad3};
    static Punkts punkt_salad = new Punkts("Салат", salad, 2);

    static Inside_punkts[] sause = new Inside_punkts[] {sause1, sause2};
    static Punkts punkt_sause = new Punkts("Соус", sause, 3);

    static Inside_punkts[] cheese = new Inside_punkts[] {cheese1, cheese2, cheese3};
    static Punkts punkt_cheese = new Punkts("Сыр", cheese, 4);

    static Inside_punkts[] tomato = new Inside_punkts[] {tomato1, tomato2};
    static Punkts punkt_tomato = new Punkts("Помидоры", tomato, 5);

    static Inside_punkts[] meet = new Inside_punkts[] {meet1, meet2, meet3};
    static Punkts punkt_meet = new Punkts("Мясо", meet, 6);

    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many shaurms do you want to create?");
            int number_of_shavas = scanner.nextInt();
            Shava[] shaurmi = new Shava[number_of_shavas];
            String type_lavash = "";
            String type_salad = "";
            String type_sause = "";
            String type_cheese = "";
            String type_tomatoes = "";
            String type_meet = "";
            int cost = 0;
            for (int i = 0; i < number_of_shavas; i++) {
                System.out.println("Please, choose number of lavash");
                for (int j = 0; j < punkt_lavash.podpunkts.length; j++) {
                    System.out.println(punkt_lavash.podpunkts[j].position + " " + punkt_lavash.podpunkts[j].name + " " + punkt_lavash.podpunkts[j].cost);
                }
                int number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_lavash = "Сырный";
                        cost += 20;
                    }
                    case 2 -> {
                        type_lavash = "Обычный";
                        cost += 10;
                    }
                    default -> System.out.println("Error");
                }

                System.out.println("Please, choose number of salad");
                for (int j = 0; j < punkt_salad.podpunkts.length; j++) {
                    System.out.println(punkt_salad.podpunkts[j].position + " " + punkt_salad.podpunkts[j].name + " " + punkt_salad.podpunkts[j].cost);
                }
                number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_salad = "Айсберг";
                        cost += 20;
                    }
                    case 2 -> {
                        type_salad = "Латук";
                        cost += 30;
                    }
                    case 3 -> {
                        type_salad = "Романо";
                        cost += 15;
                    }
                    default -> System.out.println("Error");
                }

                System.out.println("Please, choose number of sause");
                for (int j = 0; j < punkt_sause.podpunkts.length; j++) {
                    System.out.println(punkt_sause.podpunkts[j].position + " " + punkt_sause.podpunkts[j].name + " " + punkt_sause.podpunkts[j].cost);
                }
                number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_sause = "Сметанный";
                        cost += 10;
                    }
                    case 2 -> {
                        type_sause = "Чесночный";
                        cost += 20;
                    }
                    default -> System.out.println("Error");
                }

                System.out.println("Please, choose number of cheese");
                for (int j = 0; j < punkt_cheese.podpunkts.length; j++) {
                    System.out.println(punkt_cheese.podpunkts[j].position + " " + punkt_cheese.podpunkts[j].name + " " + punkt_cheese.podpunkts[j].cost);
                }
                number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_cheese = "Чеддер";
                        cost += 50;
                    }
                    case 2 -> {
                        type_cheese = "Маздам";
                        cost += 30;
                    }
                    case 3 -> {
                        type_cheese = "Рокфор";
                        cost += 80;
                    }
                    default -> System.out.println("Error");
                }

                System.out.println("Please, choose number of tomatoes");
                for (int j = 0; j < punkt_tomato.podpunkts.length; j++) {
                    System.out.println(punkt_tomato.podpunkts[j].position + " " + punkt_tomato.podpunkts[j].name + " " + punkt_tomato.podpunkts[j].cost);
                }
                number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_tomatoes = "Черри";
                        cost += 60;
                    }
                    case 2 -> {
                        type_tomatoes = "Сливовидные";
                        cost += 40;
                    }
                    default -> System.out.println("Error");
                }

                System.out.println("Please, choose number of meet");
                for (int j = 0; j < punkt_meet.podpunkts.length; j++) {
                    System.out.println(punkt_meet.podpunkts[j].position + " " + punkt_meet.podpunkts[j].name + " " + punkt_meet.podpunkts[j].cost);
                }
                number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        type_meet = "Курица";
                        cost += 100;
                    }
                    case 2 -> {
                        type_meet = "Свинина";
                        cost += 120;
                    }
                    case 3 -> {
                        type_meet = "Говядина";
                        cost += 150;
                    }
                    default -> System.out.println("Error");
                }

                Shava new_shava = new Shava(type_lavash, type_salad, type_sause, type_cheese, type_tomatoes, type_meet, cost);
                shaurmi[i] = new_shava;
                System.out.println("Your shaurma was created successfully");
                cost = 0;
            }

            for (int y = 0; y < shaurmi.length; y++) {
                System.out.println("Шаурма №" + (y + 1) + ":");
                System.out.println("Тип лаваша - " + shaurmi[y].lavash);
                System.out.println("Тип салата - " + shaurmi[y].salad);
                System.out.println("Тип соуса - " + shaurmi[y].sause);
                System.out.println("Тип сыра - " + shaurmi[y].cheese);
                System.out.println("Тип помидор - " + shaurmi[y].tomatoes);
                System.out.println("Тип мяса - " + shaurmi[y].meet);
                System.out.println("-------------------------------");
                System.out.println("Стоимость - " + shaurmi[y].cost);
                System.out.println();
            }
        }
        catch (Exception e)
        {
            System.out.println("Error occured");
        }
    }

}