/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class InductionLoop {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InductionLoop(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InductionLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_InductionLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static StringVector getIDList() {
    return new StringVector(libsumoJNI.InductionLoop_getIDList(), true);
  }

  public static int getIDCount() {
    return libsumoJNI.InductionLoop_getIDCount();
  }

  public static double getPosition(String detID) {
    return libsumoJNI.InductionLoop_getPosition(detID);
  }

  public static String getLaneID(String detID) {
    return libsumoJNI.InductionLoop_getLaneID(detID);
  }

  public static int getLastStepVehicleNumber(String detID) {
    return libsumoJNI.InductionLoop_getLastStepVehicleNumber(detID);
  }

  public static double getLastStepMeanSpeed(String detID) {
    return libsumoJNI.InductionLoop_getLastStepMeanSpeed(detID);
  }

  public static StringVector getLastStepVehicleIDs(String detID) {
    return new StringVector(libsumoJNI.InductionLoop_getLastStepVehicleIDs(detID), true);
  }

  public static double getLastStepOccupancy(String detID) {
    return libsumoJNI.InductionLoop_getLastStepOccupancy(detID);
  }

  public static double getLastStepMeanLength(String detID) {
    return libsumoJNI.InductionLoop_getLastStepMeanLength(detID);
  }

  public static double getTimeSinceDetection(String detID) {
    return libsumoJNI.InductionLoop_getTimeSinceDetection(detID);
  }

  public static SWIGTYPE_p_std__vectorT_libsumo__TraCIVehicleData_t getVehicleData(String detID) {
    return new SWIGTYPE_p_std__vectorT_libsumo__TraCIVehicleData_t(libsumoJNI.InductionLoop_getVehicleData(detID), true);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin, double end) {
    libsumoJNI.InductionLoop_subscribe__SWIG_0(objectID, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin) {
    libsumoJNI.InductionLoop_subscribe__SWIG_1(objectID, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribe(String objectID, IntVector varIDs) {
    libsumoJNI.InductionLoop_subscribe__SWIG_2(objectID, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribe(String objectID) {
    libsumoJNI.InductionLoop_subscribe__SWIG_3(objectID);
  }

  public static void unsubscribe(String objectID) {
    libsumoJNI.InductionLoop_unsubscribe(objectID);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin, double end) {
    libsumoJNI.InductionLoop_subscribeContext__SWIG_0(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin) {
    libsumoJNI.InductionLoop_subscribeContext__SWIG_1(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs) {
    libsumoJNI.InductionLoop_subscribeContext__SWIG_2(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.InductionLoop_subscribeContext__SWIG_3(objectID, domain, dist);
  }

  public static void unsubscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.InductionLoop_unsubscribeContext(objectID, domain, dist);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getAllSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.InductionLoop_getAllSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t getSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t(libsumoJNI.InductionLoop_getSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t getAllContextSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t(libsumoJNI.InductionLoop_getAllContextSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getContextSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.InductionLoop_getContextSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_NamedRTree getTree() {
    long cPtr = libsumoJNI.InductionLoop_getTree();
    return (cPtr == 0) ? null : new SWIGTYPE_p_NamedRTree(cPtr, false);
  }

  public static void cleanup() {
    libsumoJNI.InductionLoop_cleanup();
  }

  public static void storeShape(String id, SWIGTYPE_p_PositionVector shape) {
    libsumoJNI.InductionLoop_storeShape(id, SWIGTYPE_p_PositionVector.getCPtr(shape));
  }

  public static SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t makeWrapper() {
    return new SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t(libsumoJNI.InductionLoop_makeWrapper(), true);
  }

  public static boolean handleVariable(String objID, int variable, SWIGTYPE_p_libsumo__VariableWrapper wrapper) {
    return libsumoJNI.InductionLoop_handleVariable(objID, variable, SWIGTYPE_p_libsumo__VariableWrapper.getCPtr(wrapper));
  }

}