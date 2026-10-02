/*
* File: Writer.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II N
* Date: 2026-10-02
* Github: https://github.com/benedekszasz7/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writeable {
    @Override
    public void writeContent(String content) {
        try {
            FileWriter writeContent = new FileWriter("write.txt");
            writeContent.write("Az osztály, fájlba írja eme szöveget.");
            writeContent.close();
            System.out.println("Sikeresen fájlba írtam a megadott szöveget.");

        } catch (IOException e) {
            System.out.println("Hiba lépett fel a fájlba írás során: " + e.getMessage());
        }
    }
}
