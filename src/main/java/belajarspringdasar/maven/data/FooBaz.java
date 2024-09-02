package belajarspringdasar.maven.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBaz {

    private Foo foo;

    private Baz baz;

}
