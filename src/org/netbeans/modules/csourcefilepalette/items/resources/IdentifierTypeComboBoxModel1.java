
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.netbeans.modules.csourcefilepalette.items.resources;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Ian
 */
class IdentifierTypeComboBoxModel1 extends AbstractListModel implements ComboBoxModel {
    String[] IdentifierTypes = {
            "*","&", "++", "--", "int", "string", "char", "short", "long", "float", "double", "bool",
            "wchar_t", "void", "asm", "auto", "break", "case", "catch", "class", "const", 
            "const_cast", "continue", "default", "delete", "do", "dynamic_cast", "else", "enum", "explicit", "export", "extern", 
            "false", "for", "friend", "goto", "inline", "mutable", "namespace","new", "operator", "private", "protected", "public", "register", 
            "reinterpret_cast", "return","signed", "sizeof", "static", "static_cast", "struct", 
            "switch", "template", "this", "throw", "true", "try", "typedef", "typeid", "typename", "union", 
            "unsigned", "using", "virtual", "void", "volatile", "while" 
    };
    String   selection     = null;

    @Override
    public Object getElementAt(int index) {
        return IdentifierTypes[index];
    }

    @Override
    public int getSize() {
        return IdentifierTypes.length;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;    // to select and register an
    }    // item from the pull-down list

    // Methods implemented from the interface ComboBoxModel
    @Override
    public Object getSelectedItem() {
        return selection;    // to add the selection to the combo box
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
