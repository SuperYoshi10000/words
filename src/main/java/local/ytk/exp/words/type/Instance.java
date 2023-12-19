package local.ytk.exp.words.type;

class Instance<W extends Word> {
    public final W word;
    protected Instance(W word) {
        this.word = word;
    }
}