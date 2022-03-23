public class FiveTask {
    public static void main(String[] args) {
        //00:00 01:10 02:20 03:30 04:40 05:50 10:01 11:11 12:21 13:31 14:41 15:51 20:02 21:12 22:22 23:32 24:42
        int a, b, c, d;
        int num = 0 ;
        for (int i = 0; i <= 24; i++){
             a = i / 10;
             b = i % 10;
            for (int j = 0; j <= 59; j++){
                c = j / 10;
                d = j % 10;
                if(a == d & c == b){
                    System.out.println(a + "" + b + ":"+ c + "" + d);
                    num++;
                }
            }
        }
        System.out.println("Кількість співпадінь: " + num);
    }
}
