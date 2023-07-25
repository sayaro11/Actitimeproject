package com.Actitime.Testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectRepostory.HomePage;
import com.Actitime.ObjectRepostory.TaskPage;
@Listeners(ListenerImplemation.class)
public class CreateCustomer extends BaseClass{
@Test
public void CreateCustomer(){
HomePage hp = new HomePage(driver);
hp.getTasktab().click();
TaskPage tp=new TaskPage(driver);
tp.getAddnewbtn().click();
FileLibrary f=new FileLibrary();
String name = f.readDataFromExcel("sheet1", 1, 1);
tp.getCustomer().sendkeys(name);
String desp = f.readDataFromExcel("sheet1", 1, 2);
tp.getCustdesp().sendkeys(desp);`
tp.getCreatecustbtn().click();



}
}