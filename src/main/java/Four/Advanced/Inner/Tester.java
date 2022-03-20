package Four.Advanced.Inner;

public class Tester {
    public static void main(String[] args) {
        //Zašto klassa postoji? - Da bi neko nekad kreirao objekat

        OuterModel outerModel = new OuterModel(23);
//INSTANCE INNER KLASE
        OuterModel.innerModel instanceInner = outerModel.new innerModel();
//        INSTANCE STATIC INNER KLASE
        OuterModel.InnerStaticModel innerStaticModel = new OuterModel.InnerStaticModel();

    }
}
