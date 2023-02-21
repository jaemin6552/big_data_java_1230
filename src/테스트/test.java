package 테스트;

import java.util.*;


class test {

    public static void main(String[] args) {
        int []array = {1,5,2,6,3,7,4}; //1차배열주어짐
        int [][]commands ={{2,5,3},{4,4,1},{1,7,3}}; //0,0 시작 0,1끝 0,3 추출해야할인덱스번호
        int k = 0;
        List<Integer> answer = new ArrayList<>();
        for(int i =0; i<commands.length; i++){
            for(int j =commands[i][0]-1; j<commands[i][1]-1; j++){
                answer.add(array[j]);
            }
        }
        Collections.sort(answer);
        for(int i =0; i<answer.size(); i ++){
            System.out.println(answer.get(i));
        }
        int [] result = new int[commands.length];
        for(int i = 0; i< commands.length; i++){
            result[i] = answer.get(commands[i][2]-1);
        }
        System.out.println(Arrays.toString(result));
    }
}