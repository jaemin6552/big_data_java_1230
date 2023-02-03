package 진수변환;

import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> num = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        num.push(sc.nextInt());

        for(int i =0; i< num.size(); i++){
            int tmp = num.pop();
                 answer.add(tmp^0);
            }
        for(Integer e : answer){
            System.out.println(e);
        }

    }

}
