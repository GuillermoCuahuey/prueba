package web.profesor.modulo;

public class TablaNivel {

    private String nickname;
    private int listen;
    private int trasncript;
    private int read;
    private int gramman;
    private String quizzes;

    private Integer id;

    public TablaNivel() {
    }

    public TablaNivel(String nickname, int listen, int trasncript, int read, int gramman, String quizzes, Integer id) {
        this.nickname = nickname;
        this.listen = listen;
        this.trasncript = trasncript;
        this.read = read;
        this.gramman = gramman;
        this.quizzes = quizzes;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getTrasncript() {
        return trasncript;
    }

    public void setTrasncript(int trasncript) {
        this.trasncript = trasncript;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getGramman() {
        return gramman;
    }

    public void setGramman(int gramman) {
        this.gramman = gramman;
    }

    public String getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(String quizzes) {
        this.quizzes = quizzes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
