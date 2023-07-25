package com.Actitime.ObjectRepostory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement addnewbtn;

 @FindBy(xpath="//div[.='+ New Customer']")
 private WebElement newcust;
 
 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
 
}
