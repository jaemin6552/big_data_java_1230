package 테스트;

import java.util.*;


class test {

    public static void main(String[] args) {
        int []array = {1,5,2,6,3,7,4};
        int [][]commands ={{2,5,3},{4,4,1},{1,7,3}};
        int k = 0;
        List<Integer> answer = new ArrayList<>();
        for(int i =0; i<commands.length; i++){
            for(int j =commands[i][0]; j<commands[i][1]; j++){
                answer.add(array[j]);
            }
        }
        Collections.sort(answer);
        for(int i = 0; i<)
    }
}