package com.company.ordermanagement.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Address;

@UiController("ordermanagement_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {
}