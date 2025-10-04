package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;

public class Deserializer {
    static <T> T deserialize (Path jsonFile, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        T order = mapper.readValue(jsonFile.toFile(), clazz);
        return order;
    }
}
