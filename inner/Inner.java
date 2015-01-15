package inner;

// unresolvable import
// blows up
import java.nio.file.Path;

public final class Inner {
  public static boolean isUsed() {
    return true;
  }

  // uses unresolvable type
  // blows up despite being unused
  public static boolean isNotUsed(Path path) {
    return path == null;
  }
}
