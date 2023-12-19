package local.ytk.exp.words.type;

public abstract class Clause {
    NounObject subject;
    Predicate predicate;
    public Clause(NounObject subject, Predicate predicate) {
        this.subject = subject;
        this.predicate = predicate;
    }
}
