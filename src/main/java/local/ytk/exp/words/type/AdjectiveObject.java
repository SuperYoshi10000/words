package local.ytk.exp.words.type;

public class AdjectiveObject extends Instance<Adjective> {
    Adjective a;
    AdverbObject[] d;
    public AdjectiveObject(Adjective adjective, AdverbObject... adverbs) {
        super(adjective);
        this.a = adjective;
        this.d = adverbs;
    }
}
