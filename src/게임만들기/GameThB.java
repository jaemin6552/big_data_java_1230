package 게임만들기;

public class GameThB extends Thread{
    private Character warrior;
    private Character wizard;

    public GameThB(Character warrior, Character wizard){
        this.warrior = warrior; //전사
        this.wizard  = wizard; //마법사
    }
    @Override
    public void run() {
        int normal; // 일반 공격에 대한 확률 구하기
        int special;// 특수 공격에 대한 확률 구하기
        boolean endGame = false; //게임 종료 조건

        while(true){
            try {
                sleep(3300); //3초 마다 반복
                normal = (int)(Math.random() * 2); // 범위가 0~1이니 50%확률
                special = (int)(Math.random() * 18 ); //범위가 0~19이니 5%의 확률
                if(normal == 1){
                    System.out.println("마법 공격 : " + warrior.name + "에게" + wizard.mAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.mAttack());
                } else {
                    System.out.println("물리 공격 : " + warrior.name + "에게" + wizard.pAttack() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                }
                if(special == 10){ // 1/18  확률
                    System.out.println(wizard.name + "궁극기 발동 !!!," + warrior.name + "에게" +
                            wizard.ultimate() + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage( wizard.ultimate());
                }
                if (endGame){
                    System.exit(0);
                }
            } catch (InterruptedException e){}
        }
    }
}
