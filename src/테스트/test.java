package 테스트;

public class test {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        System.out.println(a);
        String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i]);
        }
    }
}
