package TimeComplexity.project01;

public class Main{

    public int findSum1(int n){
        return (n*(n+1))/2;
    }

    public int findSum2(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        Main obj = new Main();
        // System.out.println(obj.findSum1(99999));
        System.out.println(obj.findSum2(99999));
        System.out.println("Time Taken - " +(System.currentTimeMillis() - now) + "milliseconds");
    }
}