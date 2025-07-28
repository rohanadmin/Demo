public class ArmStrongNum {

    public static void main(String[] args) {
        int actualNum = 9474;
        int num = actualNum;
        int sum = 0;
        int count=0;

        int temp = num;
        while(temp>0) {
            count++;
            temp= temp/10;
        }

        while(num>0){
            int rem = num%10;
            rem = (int) Math.pow(rem,count);
            sum+=rem;
            num = num/10;
        }

        if(actualNum==sum){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
}
