/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class ParkingArea {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ParkingArea(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParkingArea obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_ParkingArea(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static StringVector getIDList() {
    return new StringVector(libsumoJNI.ParkingArea_getIDList(), true);
  }

  public static int getIDCount() {
    return libsumoJNI.ParkingArea_getIDCount();
  }

  public static String getLaneID(String stopID) {
    return libsumoJNI.ParkingArea_getLaneID(stopID);
  }

  public static double getStartPos(String stopID) {
    return libsumoJNI.ParkingArea_getStartPos(stopID);
  }

  public static double getEndPos(String stopID) {
    return libsumoJNI.ParkingArea_getEndPos(stopID);
  }

  public static String getName(String stopID) {
    return libsumoJNI.ParkingArea_getName(stopID);
  }

  public static int getVehicleCount(String stopID) {
    return libsumoJNI.ParkingArea_getVehicleCount(stopID);
  }

  public static StringVector getVehicleIDs(String stopID) {
    return new StringVector(libsumoJNI.ParkingArea_getVehicleIDs(stopID), true);
  }

  public static String getParameter(String stopID, String param) {
    return libsumoJNI.ParkingArea_getParameter(stopID, param);
  }

  public static SWIGTYPE_p_std__pairT_std__string_std__string_t getParameterWithKey(String objectID, String key) {
    return new SWIGTYPE_p_std__pairT_std__string_std__string_t(libsumoJNI.ParkingArea_getParameterWithKey(objectID, key), true);
  }

  public static void setParameter(String stopID, String key, String value) {
    libsumoJNI.ParkingArea_setParameter(stopID, key, value);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin, double end) {
    libsumoJNI.ParkingArea_subscribe__SWIG_0(objectID, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin) {
    libsumoJNI.ParkingArea_subscribe__SWIG_1(objectID, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribe(String objectID, IntVector varIDs) {
    libsumoJNI.ParkingArea_subscribe__SWIG_2(objectID, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribe(String objectID) {
    libsumoJNI.ParkingArea_subscribe__SWIG_3(objectID);
  }

  public static void unsubscribe(String objectID) {
    libsumoJNI.ParkingArea_unsubscribe(objectID);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin, double end) {
    libsumoJNI.ParkingArea_subscribeContext__SWIG_0(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin) {
    libsumoJNI.ParkingArea_subscribeContext__SWIG_1(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs) {
    libsumoJNI.ParkingArea_subscribeContext__SWIG_2(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.ParkingArea_subscribeContext__SWIG_3(objectID, domain, dist);
  }

  public static void unsubscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.ParkingArea_unsubscribeContext(objectID, domain, dist);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getAllSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.ParkingArea_getAllSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t getSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t(libsumoJNI.ParkingArea_getSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t getAllContextSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t(libsumoJNI.ParkingArea_getAllContextSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getContextSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.ParkingArea_getContextSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t makeWrapper() {
    return new SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t(libsumoJNI.ParkingArea_makeWrapper(), true);
  }

  public static boolean handleVariable(String objID, int variable, SWIGTYPE_p_libsumo__VariableWrapper wrapper) {
    return libsumoJNI.ParkingArea_handleVariable(objID, variable, SWIGTYPE_p_libsumo__VariableWrapper.getCPtr(wrapper));
  }

}