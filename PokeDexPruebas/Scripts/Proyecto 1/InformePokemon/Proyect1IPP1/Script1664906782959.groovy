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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bejewelled-seahorse-1ebb1a.netlify.app/')

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/div_8wartortle'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h2_wartortle'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/img_wartortle_img'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/div_torrent'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h2_rain-dish'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_hp  59'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_attack  63'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_defense  80'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_special-attack  65'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_special-defense  80'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/h3_speed  58'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/a_X'))

WebUI.closeBrowser()

