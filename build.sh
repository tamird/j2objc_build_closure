#!/usr/bin/env sh

javac **/*.java && echo 'javac compiled successfully' || echo 'javac compilation failed'

$J2OBJC \
  --build-closure \
  -sourcepath . \
  -classpath . \
  outer/Outer.java && echo 'j2objc compiled successfully' || echo 'j2objc compilation failed'
