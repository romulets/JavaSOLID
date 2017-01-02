package br.com.farias.javasolid.isp.solution;

import br.com.farias.javasolid.isp.solution.drivers.*;

public class ISPSolutionApp {

    public static void main(String[] args) {
        KeyBoardDriver keyBoard = new KeyBoardDriver();
        readFrom(keyBoard);

        TouchScreenDriver touchScreen = new TouchScreenDriver();
        readFrom(touchScreen);
        writeDefaultMessageTo(touchScreen);

        NormalScreenDriver normalScreen = new NormalScreenDriver();
        writeDefaultMessageTo(normalScreen);
    }

    private static void readFrom(InputDevice device) {
        device.read();
    }

    private static void writeDefaultMessageTo(OutputDevice device) {
        device.write("Default message");
    }

}
