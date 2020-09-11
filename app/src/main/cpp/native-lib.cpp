#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_contentFromJNI(JNIEnv *env, jobject thiz) {

     char *h="C++";
    return env->NewStringUTF(h);
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_practiceFromJNI3(JNIEnv *env, jobject thiz) {
    // TODO: implement practiceFromJNI3()
}extern "C"
JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_practiceFromJNI2(JNIEnv *env, jobject thiz) {


}extern "C"
JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_practiceFromJNI(JNIEnv *env, jobject thiz) {


}extern "C"
JNIEXPORT jstring JNICALL
Java_com_cherish_class1_MainActivity_contentFromJNI3(JNIEnv *env, jobject thiz) {


}