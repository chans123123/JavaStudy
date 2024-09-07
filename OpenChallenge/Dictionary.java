public class Dictionary {
    private String word;
    private Scanner scanner = new Scanner(System.in);
    private Vector<Word> vector = new Vector<>();

    public Dictionary(String word) {
        this.word = word;
        vector.add(new Word("사진", "photo"));
        vector.add(new Word("사람", "human"));
        vector.add(new Word("게임", "game"));
        vector.add(new Word("캐릭터", "character"));
    }//Dictionary end
