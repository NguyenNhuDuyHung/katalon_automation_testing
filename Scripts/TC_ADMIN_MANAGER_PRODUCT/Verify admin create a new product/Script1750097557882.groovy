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

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Admin_Page/a_Quan_Ly_San_Pahm'))

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Admin_Page/a_Danh_sach_san_pham'))

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Quan_ly_san_pham/a_Create_product'))

WebUI.setText(findTestObject('Object Repository/Manager_Product/Page_Create_pro/input_product_name'), product_name)

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Create_pro/select_category'))

WebUI.selectOptionByValue(findTestObject('Manager_Product/Page_Create_pro/select_category', [('variable') : category_id]), 
    category_id, true)

WebUI.setText(findTestObject('Object Repository/Manager_Product/Page_Create_pro/input_Gi sn phm_price'), price)

WebUI.setText(findTestObject('Object Repository/Manager_Product/Page_Create_pro/input_Gi khuyn mi_discountPrice'), discount_price)

WebUI.setText(findTestObject('Object Repository/Manager_Product/Page_Create_pro/input_S lng_quantity'), quantity)

WebUI.uploadFile(findTestObject('Manager_Product/Page_Create_pro/input_mainImage'), 'C:\\Users\\DELL\\Downloads')

WebUI.uploadFile(findTestObject('Manager_Product/Page_Create_pro/input_productImages'), 'C:\\Users\\DELL\\Downloads')

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Create_pro/input_checkbox_active'))

WebUI.click(findTestObject('Object Repository/Manager_Product/Page_Create_pro/button_create_product'))

WebUI.verifyElementText(findTestObject('Manager_Product/Page_Quan_ly_san_pham/div_notification_success', [('variable') : notification]), 
    notification)

