package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SumComponent {
	
	//final indica que es constante, target es el tipo de objeto.
	public static final Target FIRST_NUMBER = Target.the("First number").located(By.id("num1"));
	public static final Target SECOND_NUMBER = Target.the("Second Number").located(By.id("num2"));
	public static final Target BTN_SUM = Target.the("Sum Button").located(By.id("btns"));

}
