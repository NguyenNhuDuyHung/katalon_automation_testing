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

WebUI.click(findTestObject('Object Repository/Manager_User/Page_Admin_Page/a_Manager_User'))

WebUI.click(findTestObject('Manager_User/Page_Manage_User/a_update_user'))

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/input__name'), name_create)

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/input__phone'), phone_create)

WebUI.click(findTestObject('Manager_User/Page_Update_User/select_role_user'))

WebUI.selectOptionByValue(findTestObject('Manager_User/Page_Update_User/select_role_user', [('variable') : role_select]), 
    role_select, true)

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/input__email'), email_create)

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/textarea_detail_location'), detail_location)

WebUI.click(findTestObject('Manager_User/Page_Update_User/select_-- city', [('variable') : city_select]))

WebUI.selectOptionByValue(findTestObject('Manager_User/Page_Update_User/select_-- city', [('variable') : city_select]), 
    city_select, true)

WebUI.click(findTestObject('Object Repository/Manager_User/Page_Update_User/select_-- district'))

WebUI.selectOptionByValue(findTestObject('Manager_User/Page_Update_User/select_-- district', [('variable') : district_select]), 
    district_select, true)

WebUI.click(findTestObject('Object Repository/Manager_User/Page_Update_User/select_-- ward'))

WebUI.selectOptionByValue(findTestObject('Manager_User/Page_Update_User/select_-- ward', [('variable') : ward_select]), 
    ward_select, true)

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/input_password'), password_create)

WebUI.setText(findTestObject('Object Repository/Manager_User/Page_Update_User/input_confirm_password'), confirm_password_create)

WebUI.click(findTestObject('Object Repository/Manager_User/Page_Update_User/button_update'))

WebUI.navigateToUrl('http://localhost:3000/admin/users?success=updated')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Manager_User/Page_Manage_User/div_Notification_Success'), 10)

WebUI.verifyElementText(findTestObject('Manager_User/Page_Manage_User/div_Notification_Success'), notification_success)

