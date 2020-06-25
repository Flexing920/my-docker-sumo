/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class TraCIColor extends TraCIResult {
  private transient long swigCPtr;

  protected TraCIColor(long cPtr, boolean cMemoryOwn) {
    super(libsumoJNI.TraCIColor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TraCIColor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_TraCIColor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TraCIColor() {
    this(libsumoJNI.new_TraCIColor__SWIG_0(), true);
  }

  public TraCIColor(int r, int g, int b, int a) {
    this(libsumoJNI.new_TraCIColor__SWIG_1(r, g, b, a), true);
  }

  public TraCIColor(int r, int g, int b) {
    this(libsumoJNI.new_TraCIColor__SWIG_2(r, g, b), true);
  }

  public String getString() {
    return libsumoJNI.TraCIColor_getString(swigCPtr, this);
  }

  public void setR(int value) {
    libsumoJNI.TraCIColor_r_set(swigCPtr, this, value);
  }

  public int getR() {
    return libsumoJNI.TraCIColor_r_get(swigCPtr, this);
  }

  public void setG(int value) {
    libsumoJNI.TraCIColor_g_set(swigCPtr, this, value);
  }

  public int getG() {
    return libsumoJNI.TraCIColor_g_get(swigCPtr, this);
  }

  public void setB(int value) {
    libsumoJNI.TraCIColor_b_set(swigCPtr, this, value);
  }

  public int getB() {
    return libsumoJNI.TraCIColor_b_get(swigCPtr, this);
  }

  public void setA(int value) {
    libsumoJNI.TraCIColor_a_set(swigCPtr, this, value);
  }

  public int getA() {
    return libsumoJNI.TraCIColor_a_get(swigCPtr, this);
  }

}
