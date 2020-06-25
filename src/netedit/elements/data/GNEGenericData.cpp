/****************************************************************************/
// Eclipse SUMO, Simulation of Urban MObility; see https://eclipse.org/sumo
// Copyright (C) 2001-2020 German Aerospace Center (DLR) and others.
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0/
// This Source Code may also be made available under the following Secondary
// Licenses when the conditions for such availability set forth in the Eclipse
// Public License 2.0 are satisfied: GNU General Public License, version 2
// or later which is available at
// https://www.gnu.org/licenses/old-licenses/gpl-2.0-standalone.html
// SPDX-License-Identifier: EPL-2.0 OR GPL-2.0-or-later
/****************************************************************************/
/// @file    GNEGenericData.cpp
/// @author  Pablo Alvarez Lopez
/// @date    Jan 2020
///
// A abstract class for data sets
/****************************************************************************/
#include <config.h>

#include <netedit/GNENet.h>
#include <netedit/GNEViewNet.h>
#include <netedit/GNEViewParent.h>
#include <netedit/elements/data/GNEGenericData.h>
#include <netedit/frames/data/GNEEdgeDataFrame.h>
#include <netedit/frames/data/GNEEdgeRelDataFrame.h>
#include <utils/gui/div/GLHelper.h>
#include <utils/gui/div/GUIParameterTableWindow.h>
#include <utils/gui/globjects/GLIncludes.h>
#include <utils/gui/globjects/GUIGLObjectPopupMenu.h>

#include "GNEGenericData.h"
#include "GNEDataInterval.h"
#include "GNEDataSet.h"


// ===========================================================================
// member method definitions
// ===========================================================================

// ---------------------------------------------------------------------------
// GNEGenericData - methods
// ---------------------------------------------------------------------------

GNEGenericData::GNEGenericData(const SumoXMLTag tag, const GUIGlObjectType type, GNEDataInterval* dataIntervalParent,
        const std::map<std::string, std::string>& parameters,
        const std::vector<GNEJunction*>& junctionParents,
        const std::vector<GNEEdge*>& edgeParents,
        const std::vector<GNELane*>& laneParents,
        const std::vector<GNEAdditional*>& additionalParents,
        const std::vector<GNEShape*>& shapeParents,
        const std::vector<GNETAZElement*>& TAZElementParents,
        const std::vector<GNEDemandElement*>& demandElementParents,
        const std::vector<GNEGenericData*>& genericDataParents,
        const std::vector<GNEJunction*>& junctionChildren,
        const std::vector<GNEEdge*>& edgeChildren,
        const std::vector<GNELane*>& laneChildren,
        const std::vector<GNEAdditional*>& additionalChildren,
        const std::vector<GNEShape*>& shapeChildren,
        const std::vector<GNETAZElement*>& TAZElementChildren,
        const std::vector<GNEDemandElement*>& demandElementChildren,
        const std::vector<GNEGenericData*>& genericDataChildren) :
    GUIGlObject(type, dataIntervalParent->getID()),
    GNEAttributeCarrier(tag, dataIntervalParent->getNet()),
    Parameterised(ParameterisedAttrType::DOUBLE, parameters),
    GNEHierarchicalParentElements(this, junctionParents, edgeParents, laneParents, additionalParents, shapeParents, TAZElementParents, demandElementParents, genericDataParents),
    GNEHierarchicalChildElements(this, junctionChildren, edgeChildren, laneChildren, additionalChildren, shapeChildren, TAZElementChildren, demandElementChildren, genericDataChildren),
    GNEPathElements(this),
    myDataIntervalParent(dataIntervalParent) {
}


GNEGenericData::~GNEGenericData() {}


const std::string&
GNEGenericData::getID() const {
    return getMicrosimID();
}


GUIGlObject*
GNEGenericData::getGUIGlObject() {
    return this;
}


GNEDataInterval*
GNEGenericData::getDataIntervalParent() const {
    return myDataIntervalParent;
}

/*
const RGBColor&
GNEGenericData::getColor() const {
    // first check if we're in supermode demand
    if (myDataIntervalParent->getNet()->getViewNet()->getEditModes().isCurrentSupermodeData()) {
        // case for edgeDatas
        if (myTagProperty.getTag() == SUMO_TAG_MEANDATA_EDGE) {
            // obtain pointer to edge data frame (only for code legibly)
            const GNEEdgeDataFrame* edgeDataFrame = myDataIntervalParent->getNet()->getViewNet()->getViewParent()->getEdgeDataFrame();
            // check if we have to filter generic data
            if (edgeDataFrame->shown()) {
                // get interval
                const GNEDataInterval* dataInterval = edgeDataFrame->getIntervalSelector()->getDataInterval();
                // get filtered attribute (can be empty)
                const std::string filteredAttribute = edgeDataFrame->getAttributeSelector()->getFilteredAttribute();
                // check interval
                if (dataInterval && (dataInterval == myDataIntervalParent) && (filteredAttribute.size() > 0)) {
                    // get maximum and minimum value
                    const double minimumValue = dataInterval->getMinimumParameterValue(filteredAttribute);
                    const double maximumValue = dataInterval->getMaximumParameterValue(filteredAttribute);
                    const double colorValue = getParametersMap().count(filteredAttribute) > 0 ? parse<double>(getParametersMap().at(filteredAttribute)) : 0;
                    // return scaled color
                    return edgeDataFrame->getAttributeSelector()->getScaledColor(minimumValue, maximumValue, colorValue);
                }
            }
        } else if (myTagProperty.getTag() == SUMO_TAG_EDGEREL) {
            // obtain pointer to edge data frame (only for code legibly)
            const GNEEdgeRelDataFrame* edgeRelDataFrame = myDataIntervalParent->getNet()->getViewNet()->getViewParent()->getEdgeRelDataFrame();
            // check if we have to filter generic data
            if (edgeRelDataFrame->shown()) {
                // get interval
                const GNEDataInterval* dataInterval = edgeRelDataFrame->getIntervalSelector()->getDataInterval();
                // get filtered attribute (can be empty)
                const std::string filteredAttribute = edgeRelDataFrame->getAttributeSelector()->getFilteredAttribute();
                // check interval
                if (dataInterval && (dataInterval == myDataIntervalParent) && (filteredAttribute.size() > 0)) {
                    // get maximum and minimum value
                    const double minimumValue = dataInterval->getMinimumParameterValue(filteredAttribute);
                    const double maximumValue = dataInterval->getMaximumParameterValue(filteredAttribute);
                    const double colorValue = getParametersMap().count(filteredAttribute) > 0 ? parse<double>(getParametersMap().at(filteredAttribute)) : 0;
                    // return scaled color
                    return edgeRelDataFrame->getAttributeSelector()->getScaledColor(minimumValue, maximumValue, colorValue);
                }
            }
        }
    }
    // return specific color
    return getSpecificColor();
}


bool
GNEGenericData::isGenericDataVisible() const {
    // get pointer to ViewNet
    GNEViewNet* viewNet = myDataIntervalParent->getNet()->getViewNet();
    // first check if we're in supermode demand
    if (viewNet->getEditModes().isCurrentSupermodeData()) {
        // check if we're in common mode
        if ((viewNet->getEditModes().dataEditMode == DataEditMode::DATA_INSPECT) ||
                (viewNet->getEditModes().dataEditMode == DataEditMode::DATA_DELETE) ||
                (viewNet->getEditModes().dataEditMode == DataEditMode::DATA_SELECT)) {
            // obtain dataset, begin, end and attribute
            const std::string genericDataType = viewNet->getIntervalBar().getGenericDataTypeStr();
            const std::string dataSet = viewNet->getIntervalBar().getDataSetStr();
            const std::string begin = viewNet->getIntervalBar().getBeginStr();
            const std::string end = viewNet->getIntervalBar().getEndStr();
            const std::string attribute = viewNet->getIntervalBar().getAttributeStr();
            // chek genericData Type
            if (!genericDataType.empty() && (myTagProperty.getTagStr() != genericDataType)) {
                return false;
            }
            // chek data set
            if (!dataSet.empty() && myDataIntervalParent->getDataSetParent()->getID() != dataSet) {
                return false;
            }
            // chek begin
            if (!begin.empty() && parse<double>(begin) < myDataIntervalParent->getAttributeDouble(SUMO_ATTR_BEGIN)) {
                return false;
            }
            // chek end
            if (!end.empty() && parse<double>(end) > myDataIntervalParent->getAttributeDouble(SUMO_ATTR_END)) {
                return false;
            }
            // check attribute
            if (!attribute.empty() && getParametersMap().count(attribute) == 0) {
                return false;
            }
            // all checks ok, then return true
            return true;
        } else {
            // return specific function output
            return isVisible();
        }
    } else {
        // no supermode data
        return false;
    }
}
*/

void
GNEGenericData::drawAttribute(const PositionVector& shape) const {
    if ((myTagProperty.getTag() == SUMO_TAG_MEANDATA_EDGE) && (shape.length() > 0)) {
        // obtain pointer to edge data frame (only for code legibly)
        const GNEEdgeDataFrame* edgeDataFrame = myDataIntervalParent->getNet()->getViewNet()->getViewParent()->getEdgeDataFrame();
        // check if we have to filter generic data
        if (edgeDataFrame->shown()) {
            // check attribute
            if ((edgeDataFrame->getAttributeSelector()->getFilteredAttribute().size() > 0) &&
                    (getParametersMap().count(edgeDataFrame->getAttributeSelector()->getFilteredAttribute()) > 0)) {
                // get value
                const std::string value = getParametersMap().at(edgeDataFrame->getAttributeSelector()->getFilteredAttribute());
                // calculate center position
                const Position centerPosition = shape.positionAtOffset2D(shape.length2D() / 2);
                // Add a draw matrix
                glPushMatrix();
                GLHelper::drawText(value, centerPosition, GLO_MAX, 2, RGBColor::BLUE);
                // pop draw matrix
                glPopMatrix();
            }
        }
    }
}


bool
GNEGenericData::isGenericDataValid() const {
    return true;
}


std::string
GNEGenericData::getGenericDataProblem() const {
    return "";
}


void
GNEGenericData::fixGenericDataProblem() {
    throw InvalidArgument(getTagStr() + " cannot fix any problem");
}


GUIGLObjectPopupMenu*
GNEGenericData::getPopUpMenu(GUIMainWindow& app, GUISUMOAbstractView& parent) {
    GUIGLObjectPopupMenu* ret = new GUIGLObjectPopupMenu(app, parent, *this);
    // build header
    buildPopupHeader(ret, app);
    // build menu command for center button and copy cursor position to clipboard
    buildCenterPopupEntry(ret);
    buildPositionCopyEntry(ret, false);
    // buld menu commands for names
    new FXMenuCommand(ret, ("Copy " + getTagStr() + " name to clipboard").c_str(), nullptr, ret, MID_COPY_NAME);
    new FXMenuCommand(ret, ("Copy " + getTagStr() + " typed name to clipboard").c_str(), nullptr, ret, MID_COPY_TYPED_NAME);
    new FXMenuSeparator(ret);
    // build selection and show parameters menu
    myDataIntervalParent->getNet()->getViewNet()->buildSelectionACPopupEntry(ret, this);
    buildShowParamsPopupEntry(ret);
    // show option to open additional dialog
    if (myTagProperty.hasDialog()) {
        new FXMenuCommand(ret, ("Open " + getTagStr() + " Dialog").c_str(), getIcon(), &parent, MID_OPEN_ADDITIONAL_DIALOG);
        new FXMenuSeparator(ret);
    } else {
        new FXMenuCommand(ret, ("Cursor position in view: " + toString(getPositionInView().x()) + "," + toString(getPositionInView().y())).c_str(), nullptr, nullptr, 0);
    }
    return ret;
}


GUIParameterTableWindow*
GNEGenericData::getParameterWindow(GUIMainWindow& app, GUISUMOAbstractView& /* parent */) {
    // Create table
    GUIParameterTableWindow* ret = new GUIParameterTableWindow(app, *this);
    // Iterate over attributes
    for (const auto& tagProperty : myTagProperty) {
        // Add attribute and set it dynamic if aren't unique
        if (tagProperty.isUnique()) {
            ret->mkItem(tagProperty.getAttrStr().c_str(), false, getAttribute(tagProperty.getAttr()));
        } else {
            ret->mkItem(tagProperty.getAttrStr().c_str(), true, getAttribute(tagProperty.getAttr()));
        }
    }
    // close building
    ret->closeBuilding();
    return ret;
}


void
GNEGenericData::drawGL(const GUIVisualizationSettings& /*s*/) const {
    // currently unused
}


void 
GNEGenericData::drawPartialGL(const GUIVisualizationSettings& s, const GNELane* lane) const {
    // get lane width
    const double laneWidth = s.addSize.getExaggeration(s, lane) * (lane->getParentEdge()->getNBEdge()->getLaneWidth(lane->getIndex()) * 0.5);
    // Start drawing adding an gl identificator
    glPushName(getGlID());
    // Add a draw matrix
    glPushMatrix();
    // Start with the drawing of the area traslating matrix to origin
    glTranslated(0, 0, getType());
    // Set orange color
    GLHelper::setColor(RGBColor::BLACK);
    // draw box lines
    GNEGeometry::drawLaneGeometry(myNet->getViewNet(), lane->getLaneShape(), lane->getShapeRotations(), lane->getShapeLengths(), {}, laneWidth);
    // translate to top
    glTranslated(0, 0, 0.01);
    // Set color
    GLHelper::setColor(getColor());
    // draw interne box lines
    GNEGeometry::drawLaneGeometry(myNet->getViewNet(), lane->getLaneShape(), lane->getShapeRotations(), lane->getShapeLengths(), {}, laneWidth - 0.1);
    // Pop last matrix
    glPopMatrix();
    // Pop name
    glPopName();
}


void
GNEGenericData::drawPartialGL(const GUIVisualizationSettings& s, const GNELane* fromLane, const GNELane* toLane) const {
    if (fromLane->getParentEdge() != toLane->getParentEdge()) {
        // Start drawing adding an gl identificator
        glPushName(getGlID());
        // draw lanes
        const auto fromLanes = fromLane->getParentEdge()->getLanes();
        const auto toLanes = toLane->getParentEdge()->getLanes();
        size_t index = 0;
        while ((index < fromLanes.size()) || (index < toLanes.size())) {
            // get lanes
            const GNELane *from = (index < fromLanes.size())? fromLanes.at(index) : fromLanes.back();
            const GNELane *to = (index < toLanes.size())? toLanes.at(index) : toLanes.back();
            // get lane widths
            const double laneWidthFrom = s.addSize.getExaggeration(s, from) * (from->getParentEdge()->getNBEdge()->getLaneWidth(from->getIndex()) * 0.5);
            const double laneWidthTo = s.addSize.getExaggeration(s, to) * (to->getParentEdge()->getNBEdge()->getLaneWidth(to->getIndex()) * 0.5);
            const double laneWidth = laneWidthFrom < laneWidthTo? laneWidthFrom : laneWidthTo;
            // Add a draw matrix
            glPushMatrix();
            // translate to GLO
            glTranslated(0, 0, getType());
            // Set color
            GLHelper::setColor(RGBColor::BLACK);
            if (from->getLane2laneConnections().exist(to)) {
                // draw box lines
                GNEGeometry::drawGeometry(myNet->getViewNet(), from->getLane2laneConnections().getLane2laneGeometry(to), laneWidth);
                // translate to top
                glTranslated(0, 0, 0.01);
                // Set color
                GLHelper::setColor(getColor());
                // draw interne box lines
                GNEGeometry::drawGeometry(myNet->getViewNet(), from->getLane2laneConnections().getLane2laneGeometry(to), laneWidth - 0.1);
            } else {
                // draw line between end of first shape and first position of second shape
                GLHelper::drawBoxLines({from->getLaneShape().back(), to->getLaneShape().front()}, laneWidth);
                // translate to top
                glTranslated(0, 0, 0.01);
                // Set color
                GLHelper::setColor(getColor());
                // draw interne line between end of first shape and first position of second shape
                GLHelper::drawBoxLines({from->getLaneShape().back(), to->getLaneShape().front()}, laneWidth - 0.1);
            }
            // Pop last matrix
            glPopMatrix();
            // update index
            index++;
        }
        // Pop name
        glPopName();
    }
}

/****************************************************************************/
