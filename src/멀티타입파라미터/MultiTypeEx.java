package 멀티타입파라미터;
// 타입변수란? 참조형 타입을 의미하고 어떤 문자로 이름을 지정해도 상관없지만 일반적으로 'T'를 사용한다.
// 타입 변수는 클래스 뿐만 아니라 메소드의 매개변수나 반환 타입으로 사용 가능
public class MultiTypeEx {
    public static void main(String[] args) {
        Product<String,Integer> product = new Product<>("JM",1996);
        Product<Integer,String> product1 = new Product<>(1996,"JM");
        System.out.println(product.getName());
        System.out.println(product.getYear());
        System.out.println(product1.getName());
        System.out.println(product1.getYear());
    }
}
class Product<T, E>{
    private T name;
    private E year;

    public Product(T name, E year) {
        this.name = name;
        this.year = year;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setYear(E year) {
        this.year = year;
    }

    public T getName() {
        return name;
    }

    public E getYear() {
        return year;
    }
}