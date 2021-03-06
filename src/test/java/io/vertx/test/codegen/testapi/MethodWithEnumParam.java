package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.testmodel.TestEnum;
import io.vertx.codegen.testmodel.TestGenEnum;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface MethodWithEnumParam {

  void methodWithEnumParam(TestEnum weirdo);
  void methodWithGenEnumParam(TestGenEnum weirdo);
}
