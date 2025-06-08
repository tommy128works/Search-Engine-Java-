public class AppService {
    private String[] words;

    public AppService() {


    }

    public void setWords(String line) {
        this.words = line.trim().split("\\s+");
    }

    public String searchWords(String search) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(search)) {
                return String.valueOf(i + 1);
            }
        }
        return "Not found";
    }


}
