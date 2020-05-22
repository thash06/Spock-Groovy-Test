package com.poc.groovy.testing

import org.junit.experimental.categories.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = [TestController])
@Category(UnitTest.class)
class SampleSpec extends Specification {

    @Autowired
    protected MockMvc mvc

    def "when get is performed then the response has status 200 and content is 'Hello world!'"() {
        expect: "Status is 200 and the response is 'Hello world!'"


        when:
        def results = mvc.perform(MockMvcRequestBuilders.get('/hello'))

        then:
        results.andExpect(status().isOk())
                .andReturn()
                .response
                .contentAsString == "Hello world!"
    }


}
