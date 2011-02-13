/*******************************************************************************
 * Copyright (c) 2011 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 *******************************************************************************/
package uk.ac.bolton.archimate.editor.diagram.actions;

import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.Action;

import uk.ac.bolton.archimate.editor.preferences.IPreferenceConstants;
import uk.ac.bolton.archimate.editor.preferences.Preferences;


/**
 * Toggle the Snap Guide Lines
 * 
 * @author Phillip Beauvoir
 */
public class ToggleSnapToAlignmentGuidesAction extends Action {

	public ToggleSnapToAlignmentGuidesAction() {
		super("Show Alignment Guides", AS_CHECK_BOX);
		setToolTipText("Show Alignment Guides");
		setId(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY);
		setActionDefinitionId(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY);
		setChecked(isChecked());
	}

	@Override
    public boolean isChecked() {
	    return Preferences.doShowGuideLines();
	}

	@Override
    public void run() {
	    Preferences.STORE.setValue(IPreferenceConstants.GRID_SHOW_GUIDELINES, !isChecked());
	}
}