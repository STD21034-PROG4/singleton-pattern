import org.example.singleton.ClassSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassSingletonTest {
  private static final String EXPECTED_DESCRIPTION = "Initial description";

  @Test
  void read_description_ok(){
    String actual = ClassSingleton.getInstance().getDescription();

    assertEquals(EXPECTED_DESCRIPTION, actual);
  }

}
