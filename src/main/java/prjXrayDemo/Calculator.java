package prjXrayDemo;
/**
 *
 * @author diarmuid.healy
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator 
{
    public double addNum(double num1, double num2)
    {
        double res = num1 + num2;
        return res;
    }
    
    public double subNum(double num1, double num2)
    {
        double res = num1 - num2;
        return res;
    }
    
    public double multNum(double num1, double num2)
    {
        double res = num1 * num2;
        return res;
    }
    
    public double divNum(double num1, double num2)
    {
        double res1 = num1 / num2;
        BigDecimal bd = new BigDecimal(res1).setScale(2, RoundingMode.HALF_UP);
        double res2 = bd.doubleValue();
        return res2;
    }
}
