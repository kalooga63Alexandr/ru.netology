import ru.netology.statistic.StatisticsService;

public class Main {
    public static void main (String[] args) {
        StatisticsService service = new StatisticsService();
        long[] data = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long res = service.findMax(data);
        System.out.println("Максимальное число: " + res);
    }
}
