package br.com.farias.javasolid.isp.problem.drivers;

public class TouchScreenDriver implements Device {

    @Override
    public String read() {
        System.out.println("Reading a touch event");
        return "Touch event";
    }

    @Override
    public void write(String body) {
        body = String.format("Writing %s to touch screen", body);
        System.out.println(body);
    }
}
