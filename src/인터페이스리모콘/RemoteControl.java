package 인터페이스리모콘;
// 인터페이스란?
// 모든 필드는 자동으로 상수(final static)으로 변환 됩니다.(자동 클래스맴버화)
// 모든 메소드는 자동으로 (public abstract)가 추가됩니다.(자동 추상화)
// 디폴트 메소드 : 예외적으로 구현부를 가질 수 있으며 상속 받은 클래스에서 재정의 가능 합니다.
// 정적메소드를 포함 할 수 있습니다.(정적메소드는 객체와 상관없고 인터페이스 타입으로 사용됩니다.
public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의 하지 않았지만 정점인 상수이다,(인터페이스 생성시 만들
    int MIN_VOLUME = 0; //자동으로 final static
    void turnOn(); //자동으로 pbulic abstarct 가 붙음(왜나면 인터페이스는 기본적으로 모든 메소드가 추상메소드이다.
    void turnOff();
    void setVolume(int volume);
    static  void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
    void getInfo();
    //자바 버전 1.8이후에 추가된 기능
    //인터페이스 상속받은 클래스들이 다 오버라이딩 안해주면 오류나는걸 막기위해 새로 만드는 메소드는 예외가 가능하게 해주는것
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
}
