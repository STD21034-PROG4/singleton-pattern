import org.example.singleton.ClassUniqueInstance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassUniqueSingletonTest {
  private static final int EXPECTED_CLICK = 0;
  private static final int NEW_CLICK = 1;

  @Test
  void read_click_ok() {
    ClassUniqueInstance actual1 = ClassUniqueInstance.INSTANCE.getInstance();
    assertEquals(EXPECTED_CLICK, actual1.getClick());

    ClassUniqueInstance actual2 = ClassUniqueInstance.INSTANCE.getInstance();
    actual1.setClick(1);

    assertEquals(NEW_CLICK, actual2.getClick());
  }

}
