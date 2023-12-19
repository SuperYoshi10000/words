package local.ytk.exp.words.type;

public class Adverb extends Word {
    @Override
    public WordType type() {
        return WordType.ADVERB;
    }
    @Override
    public AdverbObject instance() {
        return new AdverbObject(this);
    }
}
