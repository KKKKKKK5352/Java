public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Rectangle one = new Rectangle(4, 40);
        Rectangle two = new Rectangle(3.5, 35.9);

        System.out.println("Ширина x высота = " + one.width + " x " + one.height);
        System.out.println("Площадь = " + one.getArea());
        System.out.println("Периметр = " + one.getPerimeter());

        System.out.println("Ширина x высота = " + two.width + " x " + two.height);
        System.out.println("Площадь = " + two.getArea());
        System.out.println("Периметр = " + two.getPerimeter());

        System.out.println();

        System.out.println("Задание 2");

        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.previousClosingPrice = 281.50;
        stock.currentPrice = 282.87;
        double res = (double)Math.round(stock.getChangePercent() * 100000) / 1000;

        System.out.println(stock.symbol + " " + stock.name);
        System.out.println(res + "%");
    }
}