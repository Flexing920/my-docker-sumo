/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.eclipse.sumo.libsumo;

public class Polygon {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Polygon(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Polygon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsumoJNI.delete_Polygon(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static StringVector getIDList() {
    return new StringVector(libsumoJNI.Polygon_getIDList(), true);
  }

  public static int getIDCount() {
    return libsumoJNI.Polygon_getIDCount();
  }

  public static String getType(String polygonID) {
    return libsumoJNI.Polygon_getType(polygonID);
  }

  public static SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t getShape(String polygonID) {
    return new SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t(libsumoJNI.Polygon_getShape(polygonID), true);
  }

  public static TraCIColor getColor(String polygonID) {
    return new TraCIColor(libsumoJNI.Polygon_getColor(polygonID), true);
  }

  public static boolean getFilled(String polygonID) {
    return libsumoJNI.Polygon_getFilled(polygonID);
  }

  public static double getLineWidth(String polygonID) {
    return libsumoJNI.Polygon_getLineWidth(polygonID);
  }

  public static String getParameter(String polygonID, String key) {
    return libsumoJNI.Polygon_getParameter(polygonID, key);
  }

  public static SWIGTYPE_p_std__pairT_std__string_std__string_t getParameterWithKey(String objectID, String key) {
    return new SWIGTYPE_p_std__pairT_std__string_std__string_t(libsumoJNI.Polygon_getParameterWithKey(objectID, key), true);
  }

  public static void setType(String polygonID, String setType) {
    libsumoJNI.Polygon_setType(polygonID, setType);
  }

  public static void setShape(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape) {
    libsumoJNI.Polygon_setShape(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape));
  }

  public static void setColor(String polygonID, TraCIColor c) {
    libsumoJNI.Polygon_setColor(polygonID, TraCIColor.getCPtr(c), c);
  }

  public static void add(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color, boolean fill, String polygonType, int layer, double lineWidth) {
    libsumoJNI.Polygon_add__SWIG_0(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color, fill, polygonType, layer, lineWidth);
  }

  public static void add(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color, boolean fill, String polygonType, int layer) {
    libsumoJNI.Polygon_add__SWIG_1(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color, fill, polygonType, layer);
  }

  public static void add(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color, boolean fill, String polygonType) {
    libsumoJNI.Polygon_add__SWIG_2(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color, fill, polygonType);
  }

  public static void add(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color, boolean fill) {
    libsumoJNI.Polygon_add__SWIG_3(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color, fill);
  }

  public static void add(String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color) {
    libsumoJNI.Polygon_add__SWIG_4(polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color);
  }

  public static void addDynamics(String polygonID, String trackedID, SWIGTYPE_p_std__vectorT_double_t timeSpan, SWIGTYPE_p_std__vectorT_double_t alphaSpan, boolean looped, boolean rotate) {
    libsumoJNI.Polygon_addDynamics__SWIG_0(polygonID, trackedID, SWIGTYPE_p_std__vectorT_double_t.getCPtr(timeSpan), SWIGTYPE_p_std__vectorT_double_t.getCPtr(alphaSpan), looped, rotate);
  }

  public static void addDynamics(String polygonID, String trackedID, SWIGTYPE_p_std__vectorT_double_t timeSpan, SWIGTYPE_p_std__vectorT_double_t alphaSpan, boolean looped) {
    libsumoJNI.Polygon_addDynamics__SWIG_1(polygonID, trackedID, SWIGTYPE_p_std__vectorT_double_t.getCPtr(timeSpan), SWIGTYPE_p_std__vectorT_double_t.getCPtr(alphaSpan), looped);
  }

  public static void addDynamics(String polygonID, String trackedID, SWIGTYPE_p_std__vectorT_double_t timeSpan, SWIGTYPE_p_std__vectorT_double_t alphaSpan) {
    libsumoJNI.Polygon_addDynamics__SWIG_2(polygonID, trackedID, SWIGTYPE_p_std__vectorT_double_t.getCPtr(timeSpan), SWIGTYPE_p_std__vectorT_double_t.getCPtr(alphaSpan));
  }

  public static void addDynamics(String polygonID, String trackedID, SWIGTYPE_p_std__vectorT_double_t timeSpan) {
    libsumoJNI.Polygon_addDynamics__SWIG_3(polygonID, trackedID, SWIGTYPE_p_std__vectorT_double_t.getCPtr(timeSpan));
  }

  public static void addDynamics(String polygonID, String trackedID) {
    libsumoJNI.Polygon_addDynamics__SWIG_4(polygonID, trackedID);
  }

  public static void addDynamics(String polygonID) {
    libsumoJNI.Polygon_addDynamics__SWIG_5(polygonID);
  }

  public static void remove(String polygonID, int layer) {
    libsumoJNI.Polygon_remove__SWIG_0(polygonID, layer);
  }

  public static void remove(String polygonID) {
    libsumoJNI.Polygon_remove__SWIG_1(polygonID);
  }

  public static void setFilled(String polygonID, boolean filled) {
    libsumoJNI.Polygon_setFilled(polygonID, filled);
  }

  public static void setLineWidth(String polygonID, double lineWidth) {
    libsumoJNI.Polygon_setLineWidth(polygonID, lineWidth);
  }

  public static void setParameter(String polygonID, String key, String value) {
    libsumoJNI.Polygon_setParameter(polygonID, key, value);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin, double end) {
    libsumoJNI.Polygon_subscribe__SWIG_0(objectID, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribe(String objectID, IntVector varIDs, double begin) {
    libsumoJNI.Polygon_subscribe__SWIG_1(objectID, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribe(String objectID, IntVector varIDs) {
    libsumoJNI.Polygon_subscribe__SWIG_2(objectID, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribe(String objectID) {
    libsumoJNI.Polygon_subscribe__SWIG_3(objectID);
  }

  public static void unsubscribe(String objectID) {
    libsumoJNI.Polygon_unsubscribe(objectID);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin, double end) {
    libsumoJNI.Polygon_subscribeContext__SWIG_0(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin, end);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs, double begin) {
    libsumoJNI.Polygon_subscribeContext__SWIG_1(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs, begin);
  }

  public static void subscribeContext(String objectID, int domain, double dist, IntVector varIDs) {
    libsumoJNI.Polygon_subscribeContext__SWIG_2(objectID, domain, dist, IntVector.getCPtr(varIDs), varIDs);
  }

  public static void subscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.Polygon_subscribeContext__SWIG_3(objectID, domain, dist);
  }

  public static void unsubscribeContext(String objectID, int domain, double dist) {
    libsumoJNI.Polygon_unsubscribeContext(objectID, domain, dist);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getAllSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.Polygon_getAllSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t getSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t(libsumoJNI.Polygon_getSubscriptionResults(objectID), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t getAllContextSubscriptionResults() {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t_t(libsumoJNI.Polygon_getAllContextSubscriptionResults(), true);
  }

  public static SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t getContextSubscriptionResults(String objectID) {
    return new SWIGTYPE_p_std__mapT_std__string_std__mapT_int_std__shared_ptrT_libsumo__TraCIResult_t_t_t(libsumoJNI.Polygon_getContextSubscriptionResults(objectID), true);
  }

  public static void addHighlightPolygon(String objectID, int type, String polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t shape, TraCIColor color, boolean fill, String polygonType, int layer, double lineWidth) {
    libsumoJNI.Polygon_addHighlightPolygon(objectID, type, polygonID, SWIGTYPE_p_std__vectorT_libsumo__TraCIPosition_t.getCPtr(shape), TraCIColor.getCPtr(color), color, fill, polygonType, layer, lineWidth);
  }

  public static SWIGTYPE_p_NamedRTree getTree() {
    long cPtr = libsumoJNI.Polygon_getTree();
    return (cPtr == 0) ? null : new SWIGTYPE_p_NamedRTree(cPtr, false);
  }

  public static void cleanup() {
    libsumoJNI.Polygon_cleanup();
  }

  public static void storeShape(String id, SWIGTYPE_p_PositionVector shape) {
    libsumoJNI.Polygon_storeShape(id, SWIGTYPE_p_PositionVector.getCPtr(shape));
  }

  public static SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t makeWrapper() {
    return new SWIGTYPE_p_std__shared_ptrT_libsumo__VariableWrapper_t(libsumoJNI.Polygon_makeWrapper(), true);
  }

  public static boolean handleVariable(String objID, int variable, SWIGTYPE_p_libsumo__VariableWrapper wrapper) {
    return libsumoJNI.Polygon_handleVariable(objID, variable, SWIGTYPE_p_libsumo__VariableWrapper.getCPtr(wrapper));
  }

  public static boolean exists(String polyID) {
    return libsumoJNI.Polygon_exists(polyID);
  }

}