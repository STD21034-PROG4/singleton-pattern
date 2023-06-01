import org.example.singleton.ClassSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassSingletonTest {
  private static final String EXPECTED_DESCRIPTION = "Initial description";
  private static final String NEW_DESCRIPTION = "New description";

  @Test
  void read_description_ok(){
    ClassSingleton actual1 = ClassSingleton.getInstance();
    assertEquals(EXPECTED_DESCRIPTION, actual1.getDescription());

    ClassSingleton actual2 = ClassSingleton.getInstance();
    actual1.setDescription(NEW_DESCRIPTION);

    assertEquals(NEW_DESCRIPTION, actual2.getDescription());
  }

}
