package day19_forloops;

public class FINRA {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){
            if (i % 15 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN ");
            }
        }
    }
}
