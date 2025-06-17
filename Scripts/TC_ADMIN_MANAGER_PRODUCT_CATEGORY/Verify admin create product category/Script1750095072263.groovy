import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'auth_package.login.loginMethod'(email, password)

WebUI.click(findTestObject('Manager_Product_Category/Page_Admin_Page/a_Quan_ly_san_pham'))

WebUI.click(findTestObject('Manager_Product_Category/Page_Admin_Page/a_Danh_muc_san_pham'))

WebUI.click(findTestObject('Manager_Product_Category/Page_Manager_Product_Category/a_Them_danh_muc'))

WebUI.setText(findTestObject('Manager_Product_Category/Page_Create_Product_Category/input_Ten_danh_muc'), product_category_name)

WebUI.click(findTestObject('Manager_Product_Category/Page_Create_Product_Category/button_Them_Danh_muc'))

WebUI.verifyElementText(findTestObject('Manager_Product_Category/Page_Manager_Product_Category/div_Notification_Success', 
        [('variable') : notification_success]), notification_success)

