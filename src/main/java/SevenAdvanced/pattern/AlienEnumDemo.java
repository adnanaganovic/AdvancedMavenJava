package SevenAdvanced.pattern;

public class AlienEnumDemo {
    public static void main(String[] args) {

    AlienEnum alien1 = AlienEnum.SINGLETON;    //1 objekat tipa ENUM koji SINGLETON i nije ga moguće razbiti ni refleksijom ni
    AlienEnum alien2 = AlienEnum.SINGLETON;

        System.out.println(alien1.hashCode());
        System.out.println(alien2.hashCode());

}
}
