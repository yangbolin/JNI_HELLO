JNI_HELLO
=========

A simple example for jni which can run c/c++ in java code

git clone https://github.com/yangbolin/JNI_HELLO.git JNI_HELLO

cd JNI_HELLO

sh make.sh

java -Djava.library.path=. Hello

注:
在这个小例子中主要演示如何在JAVA执行C/C++代码，执行make.sh脚本的时候，需要把JAVA_HOME修改成你自己的JDK路径。
