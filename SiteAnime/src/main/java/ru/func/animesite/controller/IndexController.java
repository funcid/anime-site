package ru.func.animesite.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author func 29.12.2019
 */
@Controller
public class IndexController {
    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String index() throws IOException {
        InputStream stream = IndexController.class.getResourceAsStream("/index.html");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String line;
        while ((line = bufferedReader.readLine()) != null)
            outputStream.write(line.getBytes());
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }
}
