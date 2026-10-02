/*
* File: Writer.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II N
* Date: 2026-10-02
* Github: https://github.com/benedekszasz7/
* Licenc: MIT
*/

public class Writer implements Writeable {
    @Override
    public void writeContent(String content) {
        System.out.println("Fájlba írom a szöveget:  " + content);
    }
}
