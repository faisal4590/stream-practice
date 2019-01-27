package com.faisal.StreamPractice.Stream_Practice;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamIntermediateOperationsTest {

	@Test
	public void intermediateOperation() {
		StreamIntermediateOperations op = new StreamIntermediateOperations();
		List<String> ls = Arrays.asList("FAISAL");
		op.StreamIntermediateOperationsMethod();
		//assertEquals(ls, op.StreamIntermediateOperationsMethod());
	}
}
