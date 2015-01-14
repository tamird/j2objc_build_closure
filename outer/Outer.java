package outer;

// resolvable but unused import
// contains unresolvable imports
// does not cause a problem
import inner.*;

// unresolvable import
// blows up
import java.nio.file.Path;

public final class Outer {
}
