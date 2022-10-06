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

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Buscar'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    'metapod')

WebUI.sendKeys(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_metapod_card-img'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_metapod'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/b_Habilidades'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_shed-skin'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Read more'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Tipo pokemon bug,'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/b_Tipo pokemon'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/b_Habilidades_1'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/b_Movimientos'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Back'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    'pikachu')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_pikachu'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_pikachu_card-img'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Read more_1'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Tipo pokemon electric,'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Habilidades   static,   lightning-rod,'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_Movimientos mega-punch, pay-day, thunder_c5beef'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/span_Previous_carousel-control-next-icon'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Back'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/div_SearchingSearch'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/html_Proyecto 1          font-face  font-fa_616198'))

WebUI.closeBrowser()

