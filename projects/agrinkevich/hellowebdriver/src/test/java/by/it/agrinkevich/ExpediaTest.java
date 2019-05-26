package by.it.agrinkevich;

public class ExpediaTest {

   /* private WebDriver driver;


    @BeforeMethod
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void taskA() throws Exception {
        driver.get("https://www.expedia.com/");

        StartPage startPage = new StartPage(driver);

        ResultPage resultPage = startPage
                .selectSearchFlightMode()
                .selectOneWay()
                .setOrigin("Minsk, Belarus (MSQ-All Airports)")
                .setDestination("Moscow, Russia (MOW-All Airports)")
                .setDepartingDate(30)
                .getSearch();

        int resultSearchCount = resultPage.getResultSearchCount();
        Assert.assertTrue(resultSearchCount > 1);
    }

    @Test
    public void taskB() throws InterruptedException, ParseException {
        driver.get("https://www.expedia.com/");

        FactoryStartPage factoryStartPage = new FactoryStartPage(driver);

        factoryStartPage
                .openAccountDropDown()
                .openSignInForm()
                .setEmail("cr1ji@wimsg.com")
                .setPassword("Aaaa1111")
                .doLogin()
                .selectSearchFlightMode()
                .selectRoundTrip()
                .setOrigin("Minsk, Belarus (MSQ-All Airports)")
                .setDestination("Moscow, Russia (MOW-All Airports)")
                .setDepartingDate(30)
                .setReturningDate(45)
                .setTwoAdult()
                .getSearch();

        FactoryResultPage factoryResultPage = new FactoryResultPage(driver);
        List<WebElement> pricesWebElement = factoryResultPage.getPrices();
        List<String> strPrices = pricesWebElement.stream().map(element -> element.getText()).collect(Collectors.toList());
        List<Integer> num = new ArrayList<>();
        Iterator<String> iter = strPrices.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            str = str.replaceAll("[$,]+", "");
            num.add(Integer.parseInt(str));
        }
        Iterator<Integer> iterNum = num.iterator();
        boolean isPriceLower100 = false;
        while (iterNum.hasNext()) {
            Integer myInteger = iterNum.next();
            int myInt = myInteger.intValue();
            if (myInt < 100) {
                isPriceLower100 = true;
                break;
            }
        }
        Assert.assertEquals(false, isPriceLower100);

    }

    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }
    */
}
