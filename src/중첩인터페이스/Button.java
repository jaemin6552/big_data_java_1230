package 중첩인터페이스;

public class Button {
    OnClickListener listener;
    //매개변수 다형성으로 외부에서 생성된 객체의 주소를 전달 받음
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch(){
        listener.onClick(); //구현 객체의 onclick() 매소드 호출
    }

    interface OnClickListener {
        void onClick();//추상메소드 : 상속 받은 클래스에서 해당 기능을 반드시 오버라이딩 해야 함
    }
}
