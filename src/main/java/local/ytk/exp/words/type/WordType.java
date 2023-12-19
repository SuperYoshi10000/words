package local.ytk.exp.words.type;

public final class WordType {

    public static final WordType SUBORDINATING_CONJUNCTION = null;
    public static WordType NOUN = new WordType("noun");
    public static WordType VERB = new WordType("verb");
    public static WordType ADJECTIVE = new WordType("adjective");
    public static WordType ADVERB = new WordType("adverb");

    public final String name;

    private WordType(String name) {
        this.name = name;
    }
}
