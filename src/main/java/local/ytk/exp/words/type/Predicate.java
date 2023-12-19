package local.ytk.exp.words.type;

public class Predicate {
    VerbObject v;
    NounObject n;
    public Predicate(VerbObject v) {
        this(v, null);
    }
    public Predicate(VerbObject v, NounObject n) {
        this.v = v;
        this.n = n;
    }
}
