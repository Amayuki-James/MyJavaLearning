// HistoryManager.java
import java.io.IOException;
import java.nio.file.*;

public class HistoryManager {
    public static void saveToHistory(String name) {
        try {
            Files.write(
                    Paths.get("history.txt"),
                    (name + System.lineSeparator()).getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.err.println("Failed to write history: " + e.getMessage());
        }
    }
}
