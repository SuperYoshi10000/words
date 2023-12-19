package local.ytk.exp.words.type;

public class Adjective extends Word {
    @Override
    public WordType type() {
        return WordType.ADJECTIVE;
    }
    @Override
    public AdjectiveObject instance() {
        return new AdjectiveObject(this);
    }
}
