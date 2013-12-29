#!/bin/sh

JAVA_HOME=/home/yangbolin/jdk1.6.0_32
javac Hello.java 
javah -jni Hello 
gcc -I$JAVA_HOME/include/ -I$JAVA_HOME/include/linux/ -fPIC -shared -o Hello.so Hello.c
