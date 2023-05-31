public class Variable {

    public static void main(String[] args) {
        int days = 10000;
        int years = days / 365;
        int months = (days - (years*365)) / 30;
        int daysLeft = days - (years*365) - (months * 30);
        System.out.println(daysLeft);
        System.out.println(months);
        System.out.println(years);
    }
}
