package ua.lviv.iot.components.ComponentsManager;

import ua.lviv.iot.components.models.Components;

import java.io.*;
import java.util.List;

public class ComponentsWriter {
    public final void writeToFile(final List<Components> simulators)
            throws IOException {
        File file = new File("Components.csv");

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufferedWriter = new BufferedWriter(osw)) {

            simulators.stream().forEach(component -> {
                try {
                    bufferedWriter.write(component.getHeaders());
                    bufferedWriter.newLine();
                    bufferedWriter.write(component.toCSV());
                    bufferedWriter.newLine();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });
        } finally {
            System.out.println(" ");
        }
    }
}
