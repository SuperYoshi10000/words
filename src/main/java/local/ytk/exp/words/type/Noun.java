package local.ytk.exp.words.type;

public class Noun extends Word {
    String name;

    @Override
    public WordType type() {
        return WordType.NOUN;
    }
    @Override
    public NounObject instance() {
        return new NounObject(this);
    }

    public Noun addTrait(Adverb adjective) {

        return this;
    }

}
