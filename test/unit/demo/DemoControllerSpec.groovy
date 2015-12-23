package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test exception handler"() {
        when:
        controller.index()

        then:
        response.text == 'the exception was handled by the trait method'
    }

    void "test action method"() {
        when:
        controller.someAction()

        then:
        response.text == 'handled by some action'
    }
}
