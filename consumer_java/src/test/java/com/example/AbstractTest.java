package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;

/**
 * @author Marcin Grzejszczak
 */
@ImportAutoConfiguration(TestChannelBinderConfiguration.class)
public abstract class AbstractTest {

	public JacksonTester<Person> json;
	public JacksonTester<StatsRequest> statsJson;

	@BeforeEach
	public void setup() {
		ObjectMapper objectMappper = new ObjectMapper();
		// Possibly configure the mapper
		JacksonTester.initFields(this, objectMappper);
	}
}
