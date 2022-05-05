package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String poem = "Jeden pies";
        String poem2 = "Dwa koty";
        String poem3 = "Trzy chomiki";
        String poem4 = "CZTERY JASZCZURKI";
        String poem5 = "Piec koni";

        poemBeautifier.beautify(poem, (p -> "ABC " + p + " ABC"));
        poemBeautifier.beautify(poem2, String::toUpperCase);
        poemBeautifier.beautify(poem3, (p -> p.replace('i', '1')));
        poemBeautifier.beautify(poem4, String::toLowerCase);
        poemBeautifier.beautify(poem5, (p -> p + " biegnie"));

    }

}
