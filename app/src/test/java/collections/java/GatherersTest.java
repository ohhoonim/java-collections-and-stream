package collections.java;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class GatherersTest {
    
    @Test
    public void noneGatherer() {
        var result = Stream.of(1,2,3,4,5)
                .map(i -> i * 2)
                .toList();
        assertThat(result).containsExactly(2, 4, 6, 8, 10);
    }
}
