public class main {

    public static void main(String[] args) {
        System.out.println(findNum(100));
    }

    public static int findNum(int n) {
        int num = 1;
        int triangleNumber = 0;

        while (true) {
            triangleNumber += num;
            num++;

            int divisors = countDiv(triangleNumber);

            if (divisors > n) {
                return triangleNumber;
            }
        }
    }


    public static int countDiv(int number) {
        int count = 0;

        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                count++;
            }
        }


            return count+1;


    }
}
