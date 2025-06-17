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

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Admin/a_Quan_ly_don_hang'))

WebUI.navigateToUrl('http://localhost:3000/admin/orders')

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Quan_ly_don_hang/a_Xem_chi_tiet'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Chi_tiet_don_hang/a_Cp nht trng thi'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Cho_xac_nhan'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Da_xac_nhan'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Da_giao_hang'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Da_huy'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Cho_thanh_toan'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Da_thanh_toan'))

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_Thanh_toan_that_bai'))

WebUI.setText(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/input_trackingCode'), tracking_code)

WebUI.setText(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/textarea_adminNote'), admin_note)

WebUI.click(findTestObject('Object Repository/Manage Order/Page_Cap_nhat_don_hang/button_update'))

WebUI.verifyElementText(findTestObject('Manage Order/Page_Quan_ly_don_hang/div_notification', [('variable') : notification]), 
    notification)

