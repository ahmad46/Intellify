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

WebUI.waitForElementVisible(findTestObject('input_UserName'), GlobalVariable.G_TimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('input_UserName'), UserName, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('btn_Sign-In'), FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('input_Password'), GlobalVariable.G_TimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('input_Password'), UserPassword, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('btn_Sign-In'), GlobalVariable.G_TimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('btn_Sign-In'), FailureHandling.STOP_ON_FAILURE)

