package br.com.s2it.utils;
 
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class MyRule extends TestWatcher {
	
	@Override
	public Statement apply(Statement base, Description description) {
		return super.apply(base, description);
	}

	@Override
	protected void succeeded(Description description) {
		System.out.println("Nice! :) ");
	}

	@Override
	protected void failed(Throwable e, Description description) {
		System.out.println("So bad! :( ");
	}

	@Override
	protected void starting(Description description) {
		// TODO - fazer algo
	}

	@Override
	protected void finished(Description description) {
		// TODO - fazer algo
	}

}
