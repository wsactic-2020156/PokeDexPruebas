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

WebUI.navigateToUrl('https://proyecto-libre-pokemon.netlify.app/inicio')

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_Next page_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Read more'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h3_bulbasaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Movimientos razor-wind, swords-dance, cu_400251'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Back'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_Read more_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_ivysaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Read more_1'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h3_ivysaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Movimientos swords-dance, cut, bind, vin_8e7648'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Back'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_Read more_card-img_1'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_venusaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Read more_1_2'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h3_venusaur'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Movimientos swords-dance, cut, bind, vin_31fa42'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_PokeApp/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Back'))

WebUI.closeBrowser()

