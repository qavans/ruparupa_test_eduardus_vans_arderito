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

WebUI.navigateToUrl('https://www.ruparupa.com/')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/div_Kategori'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/div_Rumah Tangga'))

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/i_DISKON Mandiri 9.9_anticon icon-closecirc_d7b546'))

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/label_Buy 1 Get 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/select_Paling RelevanHarga TermurahHarga Te_ce4ccc'), 
    'newArrival', true)

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/div_Rp99.000Tanaman Artifisial Eucalyptus 8_fc9644'))

WebUI.click(findTestObject('Object Repository/Page_Jual Tanaman Artifisial Grass Bush 70 _2ba12a/span_Rp79.000'))

WebUI.click(findTestObject('Object Repository/Page_Jual Tanaman Artifisial Grass Bush 70 _2ba12a/button_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Jual Tanaman Artifisial Grass Bush 70 _2ba12a/button_Lanjut Ke Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Lanjutkan ke Pembayaran'))

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Daftar_email'), 'admin123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Alamat email atau nomor telepon tidak_577a7d'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Masuk'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Daftar_email'))

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Daftar_email'), 'random@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Masuk'))

WebUI.closeBrowser()

