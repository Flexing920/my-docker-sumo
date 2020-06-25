/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class TrafficLight {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TrafficLight(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TrafficLight obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_TrafficLight(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static StringVector getIDList() {
    return new StringVector(libsumoJNI.TrafficLight_getIDList(), true);
  }

  public static int getIDCount() {
    return libsumoJNI.TrafficLight_getIDCount();
  }

  public static String getRedYellowGreenState(String tlsID) {
    return libsumoJNI.TrafficLight_getRedYellowGreenState(tlsID);
  }

  public static TraCILogicVector getAllProgramLogics(String tlsID) {
    return new TraCILogicVector(libsumoJNI.TrafficLight_getAllProgramLogics(tlsID), true);
  }

  public static StringVector getControlledJunctions(String tlsID) {
    return new StringVector(libsumoJNI.TrafficLight_getControlledJunctions(tlsID), true);
  }

  public static StringVector getControlledLanes(String tlsID) {
    return new StringVector(libsumoJNI.TrafficLight_getControlledLanes(tlsID), true);
  }

  public static SWIGTYPE_p_std__vectorT_std__vectorT_libsumo__TraCILink_t_t getControlledLinks(String tlsID) {
    return new SWIGTYPE_p_std__vectorT_std__vectorT_libsumo__TraCILink_t_t(libsumoJNI.TrafficLight_getControlledLinks(tlsID), true);
  }

  public static String getProgram(String tlsID) {
    return libsumoJNI.TrafficLight_getProgram(tlsID);
  }

  public static int getPhase(String tlsID) {
    return libsumoJNI.TrafficLight_getPhase(tlsID);
  }

  public static String getPhaseName(String tlsID) {
    return libsumoJNI.TrafficLight_getPhaseName(tlsID);
  }

  public static double getPhaseDuration(String tlsID) {
    return libsumoJNI.TrafficLight_getPhaseDuration(tlsID);
  }

  public static double getNextSwitch(String tlsID) {
    return libsumoJNI.TrafficLight_getNextSwitch(tlsID);
  }

  public static int getServedPersonCount(String tlsID, int index) {
    return libsumoJNI.TrafficLight_getServedPersonCount(tlsID, index);
  }

  public static StringVector getBlockingVehicles(String tlsID, int linkIndex) {
    return new StringVector(libsumoJNI.TrafficLight_getBlockingVehicles(tlsID, linkIndex), true);
  }

  public static StringVector getRivalVehicles(String tlsID, int linkIndex) {
    return new StringVector(libsumoJNI.TrafficLight_getRivalVehicles(tlsID, linkIndex), true);
  }

  public static StringVector getPriorityVehicles(String tlsID, int linkIndex) {
    return new StringVector(libsumoJNI.TrafficLight_getPriorityVehicles(tlsID, linkIndex), true);
  }

  public static String getParameter(String tlsID, String paramName) {
    return libsumoJNI.TrafficLight_getParameter(tlsID, paramName);
  }

  public static SWIGTYPE_p_std__pairT_std__string_std__string_t getParameterWithKey(String objectID, String key) {
    return new SWIGTYPE_p_std__pairT_std__string_std__string_t(libsumoJNI.TrafficLight_getParameterWithKey(objectID, key), true);
  }

  public static void setRedYellowGreenState(String tlsID, String state) {
    libsumoJNI.TrafficLight_setRedYellowGreenState(tlsID, state);
  }

  public static void setPhase(String tlsID, int index) {
    libsumoJNI.TrafficLight_setPhase(tlsID, index);
  }

  public static void setPhaseName(String tlsID, String name) {
    libsumoJNI.TrafficLight_setPhaseName(tlsID, name);
  }

  public static void setProgram(String tlsID, String programID) {
    libsumoJNI.TrafficLight_setProgram(tlsID, programID);
  }

  public static void setPhaseDuration(String tlsID, double phaseDuration) {
    libsumoJNI.TrafficLight_setPhaseDuration(tlsID, phaseDuration);
  }

  public static void setProgramLogic(String tlsID, TraCILogic logic) {
    libsumoJNI.TrafficLight_setProgramLogic(tlsID, TraCILogic.getCPtr(logic), logic);
  }

  public static void setParameter(String tlsID, String paramName, String value) {
    libsumoJNI.TrafficLight_setParameter(tlsID, paramName, value);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin, double end) {
    libsumoJNI.TrafficLight_subscribe__SWIG_0(objectID, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin) {
    libsumoJNI.TrafficLight_subscribe__SWIG_1(objectID, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribe(String objectID, IntVector varIDs) {
    libsumoJNI.TrafficLight_subscribe__SWIG_2(objectID, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribe(String objectID) {
    libsumoJNI.TrafficLight_subscribe__SWIG_3(objectID);
  }

  public static void unsubscribe(String objectID) {
    libsumoJNI.TrafficLight_unsubscribe(objectID);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin, double end) {
    libsumoJNI.TrafficLight_subscribeContext__SWIG_0(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin) {
    libsumoJNI.TrafficLight_subscribeContext__SWIG_1(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs) {
    libsumoJNI.TrafficLight_subscribeContext__SWIG_2(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.TrafficLight_subscribeContext__SWIG_3(objectID, domain, dist);
  }

  public static void unsubscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.TrafficLight_unsubscribeContext(objectID, domain, dist);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getAllSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.TrafficLight_getAllSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t getSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t(libsumoJNI.TrafficLight_getSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t getAllContextSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t(libsumoJNI.TrafficLight_getAllContextSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getContextSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.TrafficLight_getContextSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t makeWrapper() {
    return new SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t(libsumoJNI.TrafficLight_makeWrapper(), true);
  }

  public static boolean handleVariable(String objID, int variable, SWIGTYPE_p_libsumo__VariableWrapper wrapper) {
    return libsumoJNI.TrafficLight_handleVariable(objID, variable, SWIGTYPE_p_libsumo__VariableWrapper.getCPtr(wrapper));
  }

  public static TraCILogicVector getCompleteRedYellowGreenDefinition(String tlsID) {
    return new TraCILogicVector(libsumoJNI.TrafficLight_getCompleteRedYellowGreenDefinition(tlsID), true);
  }

  public static void setCompleteRedYellowGreenDefinition(String tlsID, TraCILogic logic) {
    libsumoJNI.TrafficLight_setCompleteRedYellowGreenDefinition(tlsID, TraCILogic.getCPtr(logic), logic);
  }

}