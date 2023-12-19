package local.ytk.exp.words.type;

public class Verb extends Word {
    String name;

    @Override
    public WordType type() {
        return WordType.NOUN;
    }
    @Override
    public VerbObject instance() {
        return new VerbObject(this);
    }

    public VerbObject with(Noun object) {
        return new VerbObject(this);
    }

}
