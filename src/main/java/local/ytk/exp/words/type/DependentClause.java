package local.ytk.exp.words.type;

public class DependentClause extends Clause {
    SubordinatingConjunctionObject subconj;
    public DependentClause(NounObject subject, Predicate predicate, SubordinatingConjunctionObject subconj) {
        super(subject, predicate);
        this.subconj = subconj;
    }
    
}