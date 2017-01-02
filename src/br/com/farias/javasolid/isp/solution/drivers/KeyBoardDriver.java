package br.com.farias.javasolid.isp.solution.drivers;

public class KeyBoardDriver implements InputDevice {

    @Override
    public String read() {
        System.out.println("Reading a key press event");
        return "Key Event";
    }

}
