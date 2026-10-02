public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Writer.....");

        Writeable writer = new Writer();
        writer.writeContent("Az osztály, fájlba írja a kapott szöveget.");
    }
}
