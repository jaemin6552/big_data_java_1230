package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// [1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴 수정, [6]종료
public class CoffeeMenuEx {
    Map<String,MenuInfo> hashMap = new TreeMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }
    void makeMenu(){
        hashMap.put("Americano", new MenuInfo("Americano", 9000,"Coffee", "기본커피입니다."));
        hashMap.put("Latte", new MenuInfo("Latte", 1500,"Coffee", "우유커피입니다."));
        hashMap.put("q", new MenuInfo("a", 4000,"Coffee", "찐한커피입니다."));
        hashMap.put("j", new MenuInfo("b", 7300,"Coffee", "기본커피입니다."));
        hashMap.put("k", new MenuInfo("c", 8200,"Coffee", "우유커피입니다."));
        hashMap.put("d", new MenuInfo("d", 5000,"Coffee", "찐한커피입니다."));

    }
    void selectMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("메뉴를 선택 하세여 : ");
            System.out.println("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴 수정, [6]종료");
            int selMenu = sc.nextInt();
            String key ="";
            switch (selMenu){
                case 1 :
                    System.out.println("======= 메뉴보기 =======");

                    for(String e : hashMap.keySet()){
                       // hashMap.
                        System.out.println("메뉴 : " + hashMap.get(e).name);
                        System.out.println("가격 : " + hashMap.get(e).price);
                        System.out.println("분류 : " + hashMap.get(e).group);
                        System.out.println("설명 : " + hashMap.get(e).desc);
                        System.out.println("----------------------");

                    }
                    break;
                case 2 :
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(hashMap.containsKey(key)) { //map 내에 키가 존재하는지 확인(있으면 true)
                        System.out.println("메뉴 : " + hashMap.get(key).name);
                        System.out.println("가격 : " + hashMap.get(key).price);
                        System.out.println("분류 : " + hashMap.get(key).group);
                        System.out.println("설명 : " + hashMap.get(key).desc);
                        System.out.println("----------------------");
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3 :
                    System.out.print("추가할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(hashMap.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else{
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        hashMap.put(key,new MenuInfo(key,price,group,desc));
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(hashMap.containsKey(key)){
                        hashMap.remove(key);
                        System.out.println(key + " 메뉴를 삭제 했습니다.");
                    } else System.out.println("해당 메뉴가 존재하지않습니다.");
                    break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(hashMap.containsKey(key)){
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        hashMap.put(key,new MenuInfo(key,price,group,desc));
                    } else System.out.println("수정할 메뉴가 없습니다.");
                    break;
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    return;
            }
        }
    }
}
