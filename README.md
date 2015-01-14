# How to reproduce

Run `build.sh` with the environment variable `J2OBJC` set to your `j2objc` binary:
```shell
J2OBJC=~/j2objc/dist/j2objc ./build.sh
javac compiled successfully
translating outer/Outer.java
error: outer/Outer.java:10: The import java.nio.file cannot be resolved
Translated 0 files: 1 errors, 0 warnings
Translated 0 methods as functions
j2objc compilation failed
```
