package 쓰레드예제5번;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
// wait() : 현재의 쓰레드를 일시 정지 상태로 전환 시킴
// notify() : 대기 상태에 있는 쓰레드를 실행 대기로 전환 시킴
// notifyAll() : 일시 정지된 모든 쓰레드를 실행 대기로 만듬
public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();
        Thread threadA = new ThreadA(workObject);
        Thread threadB = new ThreadB(workObject);
        threadB.start();
        threadA.start();
    }
}
