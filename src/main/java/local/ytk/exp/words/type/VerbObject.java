package local.ytk.exp.words.type;

public class VerbObject extends Instance<Verb> {
    Verb v;
    AdverbObject[] d;
    protected VerbObject(Verb verb, AdverbObject... d) {
        super(verb);
        this.v = verb;
        this.d = d;
    }
    
    
}
