#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jfloatArray JNICALL
Java_com_nimble_jniassignmentnimbleedge_MainActivity_doubleThisArray(JNIEnv *env, jobject thiz,
                                                                     jfloatArray arr) {
    // TODO: implement doubleArray()
    int i;
    jsize len = (*env).GetArrayLength(arr);
    jfloat *body = (*env).GetFloatArrayElements(arr, 0);
    for (i=0; i<len; i++) {
        body[i] = 2*body[i];
    }
    (*env).ReleaseFloatArrayElements(arr, body, 0);
    return arr;
}

extern "C"
JNIEXPORT jfloatArray JNICALL
Java_com_nimble_jniassignmentnimbleedge_Utils_doubleThisArray(JNIEnv *env, jobject thiz,
                                                              jfloatArray arr) {
    // TODO: implement doubleThisArray()
    int i;
    jsize len = (*env).GetArrayLength(arr);
    jfloat *body = (*env).GetFloatArrayElements(arr, 0);
    for (i=0; i<len; i++) {
        body[i] = 2*body[i];
    }
    (*env).ReleaseFloatArrayElements(arr, body, 0);
    return arr;
}