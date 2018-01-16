package ch.lu.bbzw.operators.builder;

import static com.google.common.truth.Truth.assertThat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.lu.bbzw.calculator.operators.builder.InvalidOperationException;
import ch.lu.bbzw.calculator.operators.builder.OperationBuilder;

public class OperationBuilderTest {
	private OperationBuilder operationBuilder;

	@Before
	public void setUp() {
		operationBuilder = new OperationBuilder();
	}

	@Test
	public void testBuild_7Plus7_ResultIs14() throws InvalidOperationException {
		assertThat(operationBuilder.build("7+7").getResult()).isEqualTo(14.0);
	}

	@Test
	public void testBuild_4Minus7_ResultIsMinus3() throws InvalidOperationException {
		assertThat(operationBuilder.build("4-7").getResult()).isEqualTo(-3.0);
	}

	@Test
	public void testBuild_7Multiply7_ResultIs49() throws InvalidOperationException {
		assertThat(operationBuilder.build("7*7").getResult()).isEqualTo(49.0);
	}

	@Test
	public void testBuild_7Divide7_ResultIs1() throws InvalidOperationException {
		assertThat(operationBuilder.build("7/7").getResult()).isEqualTo(1.0);
	}

	@Test
	public void testBuild_sin7_ResultIs1() throws InvalidOperationException {
		assertThat(operationBuilder.build("s(7)").getResult()).isEqualTo(0.6569865987187891);
	}

	@Test
	public void testBuild_cos7_ResultIs1() throws InvalidOperationException {
		assertThat(operationBuilder.build("c(7)").getResult()).isEqualTo(0.7539022543433046);
	}
}
