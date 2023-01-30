package 어레이리스트객체;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectEx {
    public static void main(String[] args) {
        List<MenuInfo> menuInfoList = new ArrayList<>();
        menuInfoList.add(new MenuInfo("Bigmac",6000,"hambergur","맥도날드 시그니쳐"));
        menuInfoList.add(new MenuInfo("Latte", 4000, "Coffee", "우유가 포함된 커피"));
        //menuInfoList.get(0).ViewMenuInfo();

        for(MenuInfo e : menuInfoList) {
            e.ViewMenuInfo();
        }
    }
}
