package 트리셋예제2;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        Integer[] score = {78,45,60,54,92};
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(score));

        System.out.println("60점 미만 : " + treeSet.headSet(60));
        System.out.println("60점 이상 : " + treeSet.tailSet(60));

        //주어진 점수 바로 아래의 점수 출력
        System.out.println("60점 바로아래 수 : " + treeSet.lower(60));
        //주어진 점수 바로위의 점수 출력
        System.out.println("60점 바로 위 수  : " + treeSet.higher(60));
    }
}
