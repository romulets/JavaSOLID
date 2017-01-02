package br.com.farias.javasolid.isp.problem;

import br.com.farias.javasolid.isp.problem.drivers.Device;
import br.com.farias.javasolid.isp.problem.drivers.KeyBoardDriver;
import br.com.farias.javasolid.isp.problem.drivers.NormalScreenDriver;
import br.com.farias.javasolid.isp.problem.drivers.TouchScreenDriver;
import br.com.farias.javasolid.isp.problem.exceptions.NotImplementedException;


public class ISPProblemApp {

    public static void main(String[] args) {
        KeyBoardDriver keyBoard = new KeyBoardDriver();
        readFrom(keyBoard);
        writeDefaultMessageTo(keyBoard);

        TouchScreenDriver touchScreen = new TouchScreenDriver();
        readFrom(touchScreen);
        writeDefaultMessageTo(touchScreen);

        NormalScreenDriver normalScreen = new NormalScreenDriver();
        readFrom(normalScreen);
        writeDefaultMessageTo(normalScreen);
    }

    private static boolean readFrom(Device device) {
        try {
            device.read();
            return  true;
        } catch (NotImplementedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean writeDefaultMessageTo(Device device) {
        try {
            device.write("Default message");
            return  true;
        } catch (NotImplementedException e) {
            e.printStackTrace();
            return false;
        }
    }

}
