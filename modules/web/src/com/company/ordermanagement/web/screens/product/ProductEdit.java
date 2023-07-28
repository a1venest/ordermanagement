package com.company.ordermanagement.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Product;

@UiController("ordermanagement_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}