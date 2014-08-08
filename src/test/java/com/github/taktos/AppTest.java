package com.github.taktos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.experimental.categories.Category;
import org.junit.Test;

@Category(IntegrationTest.class)
public class AppTest {
    @Test
    public void testApp() {
        assertThat(new App().echo("foo"), is("foo"));
    }
}
