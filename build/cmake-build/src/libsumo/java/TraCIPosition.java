/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class TraCIPosition extends TraCIResult {
  private transient long swigCPtr;

  protected TraCIPosition(long cPtr, boolean cMemoryOwn) {
    super(libsumoJNI.TraCIPosition_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TraCIPosition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_TraCIPosition(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getString() {
    return libsumoJNI.TraCIPosition_getString(swigCPtr, this);
  }

  public void setX(double value) {
    libsumoJNI.TraCIPosition_x_set(swigCPtr, this, value);
  }

  public double getX() {
    return libsumoJNI.TraCIPosition_x_get(swigCPtr, this);
  }

  public void setY(double value) {
    libsumoJNI.TraCIPosition_y_set(swigCPtr, this, value);
  }

  public double getY() {
    return libsumoJNI.TraCIPosition_y_get(swigCPtr, this);
  }

  public void setZ(double value) {
    libsumoJNI.TraCIPosition_z_set(swigCPtr, this, value);
  }

  public double getZ() {
    return libsumoJNI.TraCIPosition_z_get(swigCPtr, this);
  }

  public TraCIPosition() {
    this(libsumoJNI.new_TraCIPosition(), true);
  }

}