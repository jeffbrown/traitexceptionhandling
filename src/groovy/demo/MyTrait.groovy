package demo

trait MyTrait {

    def handleProble(UnsupportedOperationException e) {
        render 'the exception was handled by the trait method'
    }


    // without the annotation, the unit test will pass but the
    // running app does not recognize the method as an action
    @grails.web.Action
    def someAction() {
        render 'handled by some action'
    }
}
