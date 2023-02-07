package 소수단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        String insert = br.readLine();
        for(int i = 0; i<insert.length(); i++){
            if(insert.charAt(i) >= 'a' && insert.charAt(i) <= 'z') {
                answer += insert.charAt(i) - 'a' + 1; //`는 아세키코드값 a보다 1낮은수
            } else{
                answer += insert.charAt(i) - 'A' + 27;//92는 아세키코드값 A보다 27큰수
            }
        }
        boolean isDecimal = true;

        for(int i = 2; i < answer; i++){
            if(answer%i == 0) isDecimal = false;
        }
        if(isDecimal) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}

