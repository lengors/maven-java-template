package io.github.lengors.maven_java_template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

public class ExampleTest {
  @Test
  public void shouldThrowUnsupportedOperationExceptionWhenInstantiatingExample() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      ReflectionUtils.newInstance(Example.class);
    });
  }

  @Test
  public void shouldGetHelloWorldFromExampleFunction() {
    Assertions.assertEquals("Hello, World!", Example.example());
  }

  @Test
  public void shouldExecuteMainFunctionWithoutErrors() {
    Example.main(new String[] {});
  }
}
