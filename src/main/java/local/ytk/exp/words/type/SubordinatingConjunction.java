package local.ytk.exp.words.type;

public class SubordinatingConjunction extends Word {
    @Override
    public WordType type() {
        return WordType.SUBORDINATING_CONJUNCTION;
    }
    @Override
    public SubordinatingConjunctionObject instance() {
        return new SubordinatingConjunctionObject(this);
    }
}
