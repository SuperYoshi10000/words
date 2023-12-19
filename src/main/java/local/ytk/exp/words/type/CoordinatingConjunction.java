package local.ytk.exp.words.type;

public class CoordinatingConjunction extends Word {
    @Override
    public WordType type() {
        return WordType.SUBORDINATING_CONJUNCTION;
    }
    @Override
    public CoordinatingConjunctionObject instance() {
        return new CoordinatingConjunctionObject(this);
    }
}
