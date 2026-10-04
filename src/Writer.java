/*
* File: Writer.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II N
* Date: 2026-10-02
* Github: https://github.com/BenedekSzasz/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writeable {
    @Override
    public void writeContent(String content) {
        try {
            FileWriter writeContent = new FileWriter("write.txt");
            writeContent.write("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                Donec arcu purus, egestas in interdum in, euismod non ligula. 
                Class aptent taciti sociosqu ad litora torquent per conubia nostra,
                per inceptos himenaeos. Cras et posuere odio. Donec id lectus cursus, 
                dapibus elit vel, mattis lectus. Integer et posuere dolor. 
                Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. 
                Quisque tincidunt fringilla ligula, in dictum velit elementum sed. 
                Donec semper neque at tincidunt dictum. Maecenas nec mattis mauris, non maximus magna. 
                In nec mauris enim. Pellentesque fringilla pellentesque nibh a consequat. 
                Nulla elementum dolor ipsum, sed egestas eros pulvinar non. 
                Nam interdum vel nisl non varius.
                """);
            writeContent.close();
            System.out.println("Sikeresen fájlba írtam a megadott szöveget.");

        } catch (IOException e) {
            System.out.println("Hiba lépett fel a fájlba írás során: " + e.getMessage());
        }
    }
}
