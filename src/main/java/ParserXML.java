import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//Na wejście dostajemy plik XML, naszym zadaniem będzie go odczytać i sparsować na
//        strukturę obiektową w Java. Następnie zapisać utworzone obiekty do pliku JSON.
@Slf4j
public class ParserXML {

    public static void main(String[] args) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();
        Artist[] artists = xmlMapper.readValue(new File("src/main/resources/artists.xml"), Artist[].class);
//        List<Artist> artistsList = xmlMapper.readValue(new File("src/main/resources/artists.xml"),
//                new TypeReference<List<Artist>>() {});
//
//        artistsList.forEach(artist -> log.info("artist{}",artist));
        Arrays.stream(artists).forEach(artist -> log.info("artist{}",artist));

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/artists.json");
        objectMapper.writeValue(file, artists);
    }
}
