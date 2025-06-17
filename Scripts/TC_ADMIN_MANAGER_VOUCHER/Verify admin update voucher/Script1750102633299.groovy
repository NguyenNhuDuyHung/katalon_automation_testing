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

CustomKeywords.'auth_package.login.loginMethod'('admin@gmail.com', 'admin@123')

WebUI.click(findTestObject('Object Repository/Manage Voucher/Page_Admin/a_Voucher'))

WebUI.navigateToUrl('http://localhost:3000/admin/coupons')

WebUI.click(findTestObject('Manage Voucher/Page_Quan_ly_khuyen_mai/a_update_voucher'))

WebUI.setText(findTestObject('Object Repository/Manage Voucher/Page_Them_khuyen_mai/input__code'), code)

WebUI.setText(findTestObject('Object Repository/Manage Voucher/Page_Them_khuyen_mai/input__description'), description)

WebUI.click(findTestObject('Manage Voucher/Page_Chinh_sua_khuyen_mai/select_option'))

WebUI.selectOptionByValue(findTestObject('Manage Voucher/Page_Chinh_sua_khuyen_mai/select_option', [('variable') : option]), 
    option, true)

WebUI.setText(findTestObject('Object Repository/Manage Voucher/Page_Them_khuyen_mai/input__discountValue'), discount)

WebUI.setText(findTestObject('Object Repository/Manage Voucher/Page_Them_khuyen_mai/input_minSpend'), min_spend)

WebUI.setText(findTestObject('Manage Voucher/Page_Them_khuyen_mai/input_maxDiscount'), max_discount)

WebUI.setText(findTestObject('Manage Voucher/Page_Them_khuyen_mai/input_usageLimit'), usage_limit)

WebUI.click(findTestObject('Object Repository/Manage Voucher/Page_Them_khuyen_mai/input__isActive'))

WebUI.click(findTestObject('Manage Voucher/Page_Chinh_sua_khuyen_mai/button_update'))

WebUI.verifyElementText(findTestObject('Object Repository/Manage Voucher/Page_Quan_ly_khuyen_mai/div_notification'), notification)

