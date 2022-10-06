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

WebUI.navigateToUrl('https://guileless-fudge-a7aa48.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/div_Beths Mythologspecies Mythological Crea_a7bb8d'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/img'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/h5_Big Morty'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/p_species Human'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/p_location Citadel of Ricks'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/button_Previous'))

WebUI.click(findTestObject('Object Repository/Page_React App/Page_React App/Page_React App/Page_React App/button_Previous'))

WebUI.closeBrowser()

