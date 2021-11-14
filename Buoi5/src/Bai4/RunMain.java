package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> sumInt=new Sum<>(2,6);
        Sum<Long> sumLong=new Sum<>(125L,2603L);
        Sum<Float> sumFl=new Sum<>(2.5f,3.8f);
        Sum<Double> sumDb=new Sum<>(7.1d,5.3);
        System.out.println("Sum Integer = "+(sumInt.getSoA()+sumInt.getSoB()));
        System.out.println("Sum Long = "+(sumFl.getSoA()+sumFl.getSoB()));
        System.out.println("Sum Float = "+(sumLong.getSoA()+sumLong.getSoB()));
        System.out.println("Sum Double = "+ (sumDb.getSoA()+sumDb.getSoB()));
        
    }
}
