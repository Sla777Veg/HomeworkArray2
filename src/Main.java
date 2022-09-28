public class Main {
    public static void main(String[] args) {

        int [] Arr = new int [] {110_000, 150_000, 115_000,120_000, 125_000, 135_000, 130_000, 145_000, 140_000, 165_000, 145_000, 160_000, 170_000, 180_000, 175_000, 145_000, 115_000, 112_000, 137_000, 147_000, 105_000, 118_000, 167_000, 190_000, 187_000, 177_000, 132_000, 117_000, 123_000, 164_000, 172_000, 100_000};
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]);
            if(i < Arr.length - 1){
                System.out.print(", ");
            }
        }
        //задание1
        int i = 0;
        int titleCosts = i;
        System.out.print("\n");
        for (; i < Arr.length; i++) {
            titleCosts = titleCosts + (Arr[i]);
        }
        System.out.print("\n");
        System.out.println("Сумма трат за месяц составила " +titleCosts+ " рублей");

        //Задание2
        int maxCost = -1;
        int minCost = 1_000_000;
        int i1 = 0;
        while (i1 < Arr.length) {
            if (Arr[i1] > maxCost) {
                maxCost = Arr[i1];
            }
            if (Arr[i1] < minCost) {
                minCost = Arr[i1];
            }
            i1++;
        }
        System.out.println("Минимальная сумма трат за день составила "+ minCost+" рублей. Максимальная сумма трат за день составила "+maxCost+" рублей");

        //Задание3
        int mounth = 30;
        int i2 = 0;
        int titleCosts2 = i2;
        System.out.print("\n");
        for (; i2 < Arr.length; i2++) {
            titleCosts2 = titleCosts2 + (Arr[i2]);
        }
        float meanAr = (float)titleCosts2/mounth;
        System.out.print("\n");
        System.out.println("Средняя сумма трат за месяц составила " +(meanAr)+ " рублей");

        //Задание4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length-1; j>-1; j--) {
            System.out.print(reverseFullName[j]);
        }
    }
}

