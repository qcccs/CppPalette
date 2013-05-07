package org.netbeans.modules.csourcefilepalette.items;

import javax.swing.text.JTextComponent;
import org.netbeans.modules.csourcefilepalette.items.resources.VariablePopup;
import org.openide.text.ActiveEditorDrop;

/**
 *
 * @author Peter
 */
public class Variable implements ActiveEditorDrop {
    public boolean handleTransfer(JTextComponent targetComponent) {
        VariablePopup c = new VariablePopup(this, targetComponent);
        return true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
