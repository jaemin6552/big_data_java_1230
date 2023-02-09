package 진수변환;
import java.util.ArrayList;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        int tmp = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0; i< num.length(); i++){
                tmp = (num.charAt(num.length()-1-i)-'0') * (int)(Math.pow(8,i));
                sum += tmp;
        }
        while(sum != 0){
            answer.add(sum % 2);
            sum = sum / 2;
        }
        for(int i = answer.size()-1; i>=0; i--){
            System.out.print(answer.get(i));
        }
    }
}
