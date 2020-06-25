/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class TraCIRoadPosition extends TraCIResult {
  private transient long swigCPtr;

  protected TraCIRoadPosition(long cPtr, boolean cMemoryOwn) {
    super(libsumoJNI.TraCIRoadPosition_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TraCIRoadPosition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_TraCIRoadPosition(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getString() {
    return libsumoJNI.TraCIRoadPosition_getString(swigCPtr, this);
  }

  public void setEdgeID(String value) {
    libsumoJNI.TraCIRoadPosition_edgeID_set(swigCPtr, this, value);
  }

  public String getEdgeID() {
    return libsumoJNI.TraCIRoadPosition_edgeID_get(swigCPtr, this);
  }

  public void setPos(double value) {
    libsumoJNI.TraCIRoadPosition_pos_set(swigCPtr, this, value);
  }

  public double getPos() {
    return libsumoJNI.TraCIRoadPosition_pos_get(swigCPtr, this);
  }

  public void setLaneIndex(int value) {
    libsumoJNI.TraCIRoadPosition_laneIndex_set(swigCPtr, this, value);
  }

  public int getLaneIndex() {
    return libsumoJNI.TraCIRoadPosition_laneIndex_get(swigCPtr, this);
  }

  public TraCIRoadPosition() {
    this(libsumoJNI.new_TraCIRoadPosition(), true);
  }

}
