package TV만들기상속버전;
// 상속관계 있는 TV
// 오버라이딩 적용
public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTv = new ProductTV("우리집 TV");
        lgTv.setPower(true);
        lgTv.setVolume(120);
        lgTv.setChannel(1900,true);
        lgTv.viewTV();

    }
}
