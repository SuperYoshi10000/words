package local.ytk.exp.words.type;

public class AdverbObject extends Instance<Adverb> {
    Adverb a;
    AdverbObject[] d;
    public AdverbObject(Adverb adverb, AdverbObject... d) {
        super(adverb);
        this.a = adverb;
        this.d = d;
    }
}
