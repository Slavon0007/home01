package test;

import app.computer.Computer;
import app.computer.Keyboard;
import app.computer.Monitor;
import app.computer.Mousse;
import app.computer.SystemBlock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    
    @Test
    public void testMonitor() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));

        assertEquals("monitor", computer.toString());
    }
    
    @Test
    public void testMonitorMouse() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));

        assertEquals("monitor"+"mousse", computer.toString());
    }

    @Test
    public void testMonitorKeyboard() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setKeyboard(new Keyboard("some factory 2", "genius", "33"));

        assertEquals("monitorkeyboard", computer.toString());
    }

    @Test
    public void testMonitorSystemBlock() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setSystemBlock(new SystemBlock("IBM"));

        assertEquals("monitorsystemBlock", computer.toString());
    }

    @Test
    public void testMonitorMouseKeyboard() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));
        computer.setKeyboard(new Keyboard("some factory 2", "genius", "33"));
        assertEquals("monitormoussekeyboard", computer.toString());
    }

    @Test
    public void testMonitorMouseSystemBlock() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));
        
        assertEquals("monitormoussesystemBlock", computer.toString());
    }
}