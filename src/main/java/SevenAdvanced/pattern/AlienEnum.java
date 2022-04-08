package SevenAdvanced.pattern;

public enum AlienEnum {

    SINGLETON;             //Oracle - ENUM ne može imati public konstruktor

    private AlienEnum(){
        System.out.println("Konstruiše se ENUM vanzemaljac");
    }
}
