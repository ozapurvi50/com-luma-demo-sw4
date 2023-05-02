package com.luma.demo.sw4.pages;

import com.luma.demo.sw4.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends Utility {
    By filterProduct = By.id("sorter");
    By productSize = By.xpath("//img[starts-with(@class,'product-image-photo')]");
    By finalPrice = By.cssSelector("span[data-price-type='finalPrice']");
    By elementListDisplay = By.cssSelector(".products .product-item-info .product-item-name");
    public void selectSortByFilterProductName() {
        selectByValueFromDropDown(filterProduct, "name");
    }
    public void selectSortByFilterPrice() {
        selectByValueFromDropDown(filterProduct, "price");
    }
    public void verifyProductSize(){
       verifyProductSize(productSize);
    }
    public void verifyProductsNameAlphabeticalOrder() {
        elementFilter(elementListDisplay);
    }
    public void verifyProductsPriceLowToHigh() {
        verifyFinalPrice(finalPrice);
    }
}
