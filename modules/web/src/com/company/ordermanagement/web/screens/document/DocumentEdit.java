package com.company.ordermanagement.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Document;

@UiController("ordermanagement_Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
@LoadDataBeforeShow
public class DocumentEdit extends StandardEditor<Document> {
}