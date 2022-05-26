package jp.urgm.sample.collectors;

import static jp.urgm.collectors.Collectors0.*;

import java.util.Optional;
import java.util.stream.Stream;

public class CollectorsSample {

    public static void main(final String[] args) {
        final Optional<String> first = Stream
                .of("Bar", "ber", "buz")
                .collect(findFirst());
        System.out.println(first);
    }
    System.out.println("Esto ha sido un exito, hemos logrado hacker gracias nil");
    System.out.println("no me denuncien, es culpa de nil");
}
