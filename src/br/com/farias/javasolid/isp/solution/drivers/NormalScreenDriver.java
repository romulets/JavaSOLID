package br.com.farias.javasolid.isp.solution.drivers;

import br.com.farias.javasolid.isp.problem.exceptions.NotImplementedException;

public class NormalScreenDriver implements OutputDevice {

    @Override
    public void write(String body) {
        body = String.format("Writing %s to normal screen", body);
        System.out.println(body);
    }
}
