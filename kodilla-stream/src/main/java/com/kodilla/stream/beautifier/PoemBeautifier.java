package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String poem, PoemDecorator poemDecorator) {

        String result = poemDecorator.decorate(poem);
        System.out.println(result);
    }

    public String addingWealthInFrontAndBack(String poem) {return "$$$" + poem + "$$$";}

    public String toUpperCase(String poem) {return poem.toUpperCase();}

    public String trim(String poem) {return poem.trim();}

    public String repeat616thTimes(String poem) {return poem.repeat(616);}

}
