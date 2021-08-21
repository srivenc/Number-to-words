public class NumberWordConverter {
    public static void main(String[] args) {

    }



    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number); //reverseNumber = 1
        while (reverseNumber != 0) {
            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }
        if(getDigitCount(reverse(number)) != getDigitCount(number)){
            for(int i=getDigitCount(reverse(number));i<getDigitCount(number);i++){
                System.out.println("Zero");
            }
        }
        if(number == 0){
            System.out.println("Zero");
        }
    }



    public static int reverse(int number){
        boolean isNeg = false;
        if(number < 0){
            number *= -1;
            isNeg = true;
        }
        int digitTotal = getDigitCount(number);
        int reverse = 0;
        int factor = (int) Math.pow(10,digitTotal - 1);
        for(int i=1;i<=digitTotal;i++){
            int digit = number % 10;
            reverse += digit * factor;
            number /= 10;
            factor /= 10;
        }
        if(isNeg){
            reverse *= -1;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}

