package Zajecia1;
class przyklad {
    public static void main() {



        int[] numbers = { 4, 6, 1, 8 };
            System.out.println("____Dodawanie etc.____");
            System.out.println(numbers[1] + numbers[2]);
            System.out.println(numbers[2] - numbers[0]);
            System.out.println(numbers[3] / numbers[1]);
            System.out.println(numbers[1] * numbers[3]);

            System.out.println("____Średnia____");
            int sum = ((numbers[0] + numbers[1] + numbers[2] + numbers[3]) / 4);
            System.out.println(sum);

            System.out.println("____sprawdź czy przysta/nieparzysta____");    
            if (sum % 2 == 0) {
                System.out.println("Liczba parzysta");
            } else {
                System.out.println("Liczba nieparzysta");
            }      
            
            System.out.println("____Wskaźnik BMI____");
            int[] weight = {50, 60, 70, 80, 100};
            double[] height = {1.6, 1.7, 1.8, 1.9, 2.0};
            System.out.println(weight[3]/(height[2] * height[2]));

            System.out.println("____Średnia ocen A,B,C...____");
            int A = (6);
            int B = (5);
            int C = (4);
            int D = (3);
            int E = (2);
            int F = (1);
            System.out.println((A + B + C + D + E + F) /  6);
    }
}