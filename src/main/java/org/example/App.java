package org.example;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException {


        String filePath = "c:\\users\\leste\\ideaprojects\\functionalprogramming\\lifeonmars.txt";

        Path absolute = Paths.get("c:\\users\\leste\\ideaprojects\\functionalprogramming");

        File file1 = new File(filePath);

        URI myURI = file1.toURI();

        System.out.println("does my file exist : "+myURI);

        var contents = Files.readString(Paths.get("c:\\users\\leste\\ideaprojects\\functionalprogramming\\lifeonmars.txt"));

        List<String> words = List.of(contents.split("\\PL+"));
        words.forEach(System.out::println);

    }
}
