package co.com.bancolombia.certificacion.addnumbers.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.SumComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Add implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		
		actor.attemptsTo(Enter.theValue("5").into(SumComponent.FIRST_NUMBER ) , 
				Click.on(SumComponent.BTN_SUM)); 
	}
	
	public static Add viewResult() {
		return instrumented(Add.class);
	}

   
}
