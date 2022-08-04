package Service;

import Model.Calculator;

import java.io.IOException;

public class CalculatorService {
    private final String INSTANCE_FIELD  ="testdata.value.NumberOfInstancesField";
    Calculator calculator;
    public Calculator getCalculatorData() throws IOException {

        System.out.println(TestDataReader.getTestData(INSTANCE_FIELD));
        calculator= new Calculator(TestDataReader.getTestData(INSTANCE_FIELD));
//       calculator =new Calculator();
//       calculator.setInstancesField(TestDataReader.getTestData(INSTANCE_FIELD));
        //calculator.setInstancesField( PropertyReader.readProperty(INSTANCE_FIELD));
        return calculator;
    }

//    public static void main(String[] args) throws IOException
//    {
//        System.out.println(new CalculatorModel().getCalculatorData().getNumberOfInstances());
    }