/*
* File: App.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II N
* Date: 2026-10-02
* Github: https://github.com/benedekszasz7/
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Writer.....");

        Writeable writer = new Writer();
        writer.writeContent("Az osztály, fájlba írja a kapott szöveget.");
    }
}
