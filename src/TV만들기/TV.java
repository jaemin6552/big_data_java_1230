package TV만들기;
//Television 만들기
public class TV {
    private boolean isON; //전원 버튼 , 접근 제한자 private 설정(같은 클래스내에서만 접근 가능)
    private int channel; //0 ~ 999
    private int volume; // 0 ~ 100
    TV(){
        this.isON = false;
        this.channel = 10;
        this.volume = 10;
        System.out.println("기본생성자 호출, 전원 : " + this.isON + ", 채널 : 10, 볼륨 : 10");
    }

    TV(boolean isON, int channel, int volume){
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("기본생성자 호출, 전원 : " + this.isON + "채널 : " + this.channel + "볼륨 : " + this.volume);
    }
    //외부에서 전원 ON/OFF 할 수 있는 기능을 제공(리모콘??)
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffStr + "되었습니다.");
    }
    //외부에서 채널을 변경할 수 있는 기능을 제공
    public void setChannel(int cnl) {
        if(cnl >= 0 && cnl <=999) {
            this.channel = cnl;
            System.out.println("채널을 "+channel +"로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >= 0 && vol <=100) {
            this.volume = vol;
            System.out.println("볼륨을 "+volume +"로 변경 하였습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    public void showInfo(){
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=====정보=====");
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
