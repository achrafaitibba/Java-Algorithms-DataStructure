package o_design_patterns.dependency_injection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("/home/one-x-shield/Desktop/prep/oracle-prep/src/o_design_patterns/dependency_injection/payments.txt"));
        Class<?> paymentType = Class.forName(reader.readLine());
        Constructor<?> constructor = paymentType.getConstructor();
        Payment payment = (Payment) constructor.newInstance();
        Command command = new Command();
        command.setPayment(payment);
        command.getPayment().pay(1000);

//
//        Class<?> customerClass = Command.class;
//        Field[] fields = customerClass.getDeclaredFields();  // Gets field metadata from Metaspace
//        for(Field f : fields) {
//            System.out.println(f.getName() + " : " + f.getType());
//        }
    }
}
