package demo

trait MyTrait {

    def handleProble(UnsupportedOperationException e) {
        render 'the exception was handled by the trait method'
    }
}
