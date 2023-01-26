package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("KJM",DevType.BACKEND,Career.JUNIOR,Gender.MALE);
        developer.devInfo();

        Developer developer1 = new Developer("MOMIJI",DevType.DBA,Career.JUNIOR,Gender.FEMALE);
        developer.devInfo();
    }
}

