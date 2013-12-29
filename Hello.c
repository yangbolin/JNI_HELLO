#include "Hello.h" 
#include <stdio.h>

JNIEXPORT void JNICALL Java_Hello_sayHello  (JNIEnv * env, jobject arg, jstring instring)   
{   
    const char *str = (*env)->GetStringUTFChars(env,instring,0);
    printf("jstring=%s\n", str);
    printf("HelloWorld\n"); 
    return;   
} 
