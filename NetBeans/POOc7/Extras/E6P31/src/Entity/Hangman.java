package Entity;

public class Hangman {

    public String[] word;
    public int maxAttempts;
    public int lettersFound;
    
    public Hangman() {
    }

    public Hangman(int size , int maxAttempts, int lettersFound) {
        this.word=new String[size];
        this.maxAttempts = maxAttempts;
        this.lettersFound = lettersFound;
    }

    public String[] getWord() {
        return word;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }

    
}
