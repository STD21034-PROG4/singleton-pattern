import org.example.singleton.ClassUniqueInstance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassUniqueSingletonTest {
  private static final int EXPECTED_CLICK = 0;

  @Test
  void read_click_ok() {
    int actual = ClassUniqueInstance.INSTANCE.getInstance().getClick();

    assertEquals(EXPECTED_CLICK, actual);
  }

}
