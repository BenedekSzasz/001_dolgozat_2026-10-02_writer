public class Writer implements Writeable {
    @Override
    public void writeContent(String content) {
        System.out.println("Fájlba írom a szöveget:  " + content);
    }
}
