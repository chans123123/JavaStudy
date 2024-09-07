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
    public void run() {
        System.out.println(word + "에 오신걸 환영합니다!" + vector.size() + "개의 단어 테스트를 시작합니다!");
        System.out.println("-1를 누르면 종료됩니다!");
        System.out.println("현제 " + vector.size() + "개의 단어가들어가 잇습니다.");
        QuizStart();
    } // run end
    void QuizStart() {
        while (true) {
            int num = (int)(Math.random() * vector.size());
            String question = vector.get(num).getKey();
            System.out.println(question + "?");
            
            for (int i = 0; i < 4; i++) {
                System.out.print("(" + (i + 1) + ")" + vector.get(i).getValue());
            }

            System.out.print(" :>");
            int answer = scanner.nextInt();

            if (answer == -1) {
                System.out.println(word + " 프로그렘을 종료합니다");
                break;
            } //if end
            else {
                 if (question.equals(vector.get(answer-1).getKey())) {
                     System.out.println("Excellent !!");
                 }
                 else {
                     System.out.println("No. !!");
                 }
            }//else end
        }// while end
    }// QuizStart end
}
