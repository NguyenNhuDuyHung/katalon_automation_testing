package auth_package

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {
	@Keyword
	def loginMethod(String email = null, String password = null) {
		email = email
		password = password

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.delay(2)

		WebUI.navigateToUrl('http://localhost:3000/')

		WebUI.click(findTestObject('Object Repository/Rating_Product/Page_Think Pro_home/a_login'))

		WebUI.setText(findTestObject('Object Repository/Rating_Product/Page_login/input_email'), email)

		WebUI.setText(findTestObject('Object Repository/Rating_Product/Page_login/input_password'), password)

		WebUI.click(findTestObject('Object Repository/Rating_Product/Page_login/button_login'))
	}
}
