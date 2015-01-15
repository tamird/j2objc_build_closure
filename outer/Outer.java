package outer;

// resolvable but unused import
// contains unresolvable imports
// does not directly cause a problem
import inner.*;

public final class Outer {
  public static boolean usesInner() {
    return Inner.isUsed();
  }
}
