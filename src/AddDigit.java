public class AddDigit {
    public static void main(String[] args) {
        System.out.println(addDigits(4234));
    }

    public static int addDigits(int num) {
        int sum = 0;
        int digit;
        if (num / 10 == 0) return num;
        else {

            while (num / 10 != 0) {
                digit=num%10;
                sum += digit;
                num = num/ 10;
            }
            if(num/10==0)
            {
                sum+=num;
            }
            return sum/10==0?sum:addDigits(sum);
        }
    }

}
