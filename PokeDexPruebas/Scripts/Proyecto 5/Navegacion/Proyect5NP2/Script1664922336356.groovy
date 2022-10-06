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

WebUI.navigateToUrl('https://bejewelled-concha-1a9a3e.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/div_1 Bulbasaur 6.9 kg0.7 mPesoAltura'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/div_1'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/img_Habilidades_card__img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/h1_Bulbasaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/hr_Bulbasaur_card_hr'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/p_6.9 kg'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/h2_Peso'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/p_0.7 m'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/Page_PokeApi/h2_Altura'))

