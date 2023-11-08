public class Main {
    public static void main(String[] args){
BmiService service  = new BmiService();
        double height = 1.85;
        int weight = 86;
        int bmi = service.calculate(height , weight);
        System.out.println("body mass index: " + bmi);


    }
}

