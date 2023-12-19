package local.ytk.exp.words.type;

public class NounObject extends Instance<Noun> {
    Noun n;
    AdjectiveObject[] a;
    protected NounObject(Noun noun, AdjectiveObject... a) {
        super(noun);
        this.n = noun;
        this.a = a;
    }
    
}
