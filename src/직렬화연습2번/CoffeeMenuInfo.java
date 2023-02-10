package 직렬화연습2번;

import java.io.Serializable;

public class CoffeeMenuInfo implements Serializable {
    private String name; // 메뉴 이름
    private int price;   // 가격
    private String group; // 분류
    private String desc;  // 설명

    public CoffeeMenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
