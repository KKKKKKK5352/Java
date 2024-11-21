package Seasons;

public class EverySeasonTest {
    public static void main(String[] args) {
        EveySeason season = EveySeason.Summer;
        System.out.println(season);
        info(season);
        printAll();
    }
    public static void info(EveySeason season) {
        switch (season) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
        }
    }

    public static void printAll(){
        for (EveySeason s : EveySeason.values()) {
            System.out.println(s + " - " + s.getDescription());
        }
    }

}
