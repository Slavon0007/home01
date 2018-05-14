package app.Komputer;

import app.Komputer.App;

public class BlackMonster extends App.Computer {

    public BlackMonster() {
        super("BlackM");
        setKeyboard(new App.Keyboard("BlackM", "hhh", "Keyboard"));
        setMonitor(new App.Monitor("BlackM", 12, "LED"));
        setMousse(new App.Mousse("BlackM", "Mouse", "Soome"));

        App.SystemBlock blackMonster = new App.SystemBlock("Blackm");
        blackMonster.setRam(new App.RAM("BlackM", 12, 12));
        blackMonster.setHdd(new App.HDD("BlacM", 12, 12));
        
        setSystemBlock(blackMonster);
    }
}