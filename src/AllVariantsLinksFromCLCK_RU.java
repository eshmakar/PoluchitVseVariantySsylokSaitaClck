import java.io.FileWriter;
import java.io.IOException;

public class AllVariantsLinksFromCLCK_RU {
    private static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("D:\\Alphabet.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Начинаю....");
        long start = System.currentTimeMillis();

        for (char alphabet = '0'; alphabet <= 'z'; alphabet++) {
            if (al(alphabet)) continue;
            for (char alphabet2 = '0'; alphabet2 <= 'z'; alphabet2++) {
                if (al(alphabet2)) continue;
                for (char alphabet3 = '0'; alphabet3 <= 'z'; alphabet3++) {
                    if (al(alphabet3)) continue;
                    for (char alphabet4 = '0'; alphabet4 <= 'z'; alphabet4++) {
                        if (al(alphabet4)) continue;
                        for (char alphabet5 = '0'; alphabet5 <= 'z'; alphabet5++) {
                            if (al(alphabet5)) continue;


                            fileWriter.write("https://clck.ru/");
                            fileWriter.write(alphabet);
                            fileWriter.write(alphabet2);
                            fileWriter.write(alphabet3);
                            fileWriter.write(alphabet4);

                            fileWriter.write(alphabet5 + "\n");
                        }
                    }
                }
            }
        }

        fileWriter.close();
        System.out.println("Выполнено за: " + ((double) System.currentTimeMillis() - start) / 1000 + " сек.");
        System.out.println("Или за: " + ((double) System.currentTimeMillis() - start) / 1000 / 60 + " мин.");
    }

    private static boolean al(char alphabet) {
        if (alphabet == '@' || alphabet == '?' || alphabet == '=' || alphabet == '>' || alphabet == '<' || alphabet == ';' || alphabet == ':' || alphabet == '[' || alphabet == ']' || alphabet == '^' || alphabet == '_' || alphabet == '`' || alphabet == '\\')
            return true;
        return false;
    }
}
