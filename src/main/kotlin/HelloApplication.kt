import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named

class HelloApplication : KoinComponent {
    val helloService by inject<HelloService>(named("Hello02"))
    fun sayHelloWithKoin() = println(helloService.hello())

    fun sayHelloNormalWay() {
        val helloMessageData = HelloMessageData()
        val helloServiceImpl = HelloServiceImpl(helloMessageData)
        helloServiceImpl.hello()
    }
}