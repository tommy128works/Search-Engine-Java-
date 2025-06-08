import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private final AppService service;

    public TextUI(AppService service) {
        this.scanner = new Scanner(System.in);
        this.service = service;
    }

    public void start() {
        this.inputLine();
        this.inputSearch();
    }

    private void inputLine() {
        String line = this.scanner.nextLine();
        this.service.setWords(line);
    }

    public void inputSearch() {
        String search = this.scanner.nextLine();
        String result = this.service.searchWords(search);
        System.out.println(result);
    }

}
