package week13.lab;

import week13.lab.problem3.CamelCaseFormatter;
import week13.lab.problem3.TextEditor;
import week13.lab.problem4.DeviceAdapter;
import week13.lab.problem4.OldDeviceImpl;
import week13.lab.problem6.Coffee;
import week13.lab.problem6.CoffeeDirector;
import week13.lab.problem6.CoffeeSize;

public class Main {
    public static void main(String[] args) {
//        Logger logger = Logger.getInstance();
//
//        logger.log("Something");
//        logger.logInfo("Something");
//        logger.logWarning("Something");
//        logger.logError("Something");
//        CreditCardPaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
//        PayPalPaymentFactory payPalPaymentFactory = new PayPalPaymentFactory();
//
//        PayPalPayment payPalPayment = payPalPaymentFactory.createPayment();
//        CreditCardPayment creditCardPayment = creditCardPaymentFactory.createPayment();
//
//        payPalPayment.processPayment();
//        creditCardPayment.processPayment();

//        TextEditor editor = new TextEditor();
//        editor.setFormatter(new CamelCaseFormatter());
//        System.out.println(editor.formatText("Something in the way"));

//        OldDeviceImpl oldDevice = new OldDeviceImpl();
//        DeviceAdapter adapter = new DeviceAdapter(oldDevice);
//
//        adapter.operateNewFunction();

        CoffeeDirector director = new CoffeeDirector();
        Coffee espresso = director.constructCoffee(new Coffee.EspressoBuilder(CoffeeSize.MEDIUM).buildToppings(new String[]{"Cinnamon"}));
        System.out.println(espresso.getType());
        System.out.println(espresso.getSize());
        System.out.println(espresso.getToppings()[0]);
    }
}
