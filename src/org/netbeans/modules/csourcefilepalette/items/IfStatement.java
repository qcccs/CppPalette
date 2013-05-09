package org.netbeans.modules.csourcefilepalette.items;

import javax.swing.text.JTextComponent;
import org.netbeans.modules.csourcefilepalette.items.resources.IfPopup;
import org.openide.text.ActiveEditorDrop;

/**
 *
 * @author Peter
 */
public class IfStatement implements ActiveEditorDrop {
    @Override
    public boolean handleTransfer(JTextComponent target) {
        IfPopup c = new IfPopup(target);
        return true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
