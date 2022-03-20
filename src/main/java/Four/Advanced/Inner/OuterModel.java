package Four.Advanced.Inner;
//OUTER KLASA - koja se isto zove i kao i fajl u kojem se nalazi
public class OuterModel {
    private int x;

    public OuterModel(int x) {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void outerModel(int x){
        this.x = x;
    }

    //INEER KLASA - private, protected, public, packgage private
    //INSTANCE INNER KLASA
    public class innerModel{
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    //STATIC INNER KLASA - čak može imati svoju iner klasu
    public static class InnerStaticModel{
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
