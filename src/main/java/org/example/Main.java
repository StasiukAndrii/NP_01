package org.example;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.example.Config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ConfigurationException, IOException {
        String ordersPath = Config.getProperty("appsettings.properties", "orders.folder");
        Path ordersDir = Paths.get(ordersPath);
        if(!Files.exists(ordersDir)){
            System.out.printf("Could not find the path " + ordersDir.toString());
            return;
        }
        try {
            Stream<Path> ordersStream = Files.walk(ordersDir);
            ordersStream
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".json"))
                    .forEach(path -> {
                        try {
                           Order order =  Deserializer.deserialize(path, Order.class);
                           String uniqueID = UUID.randomUUID().toString();
                           order.orderID = uniqueID;
                           System.out.printf(order.orderID + '\n');
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

        } catch (IOException e){
            throw new IOException(e.toString());
        }

    }
}