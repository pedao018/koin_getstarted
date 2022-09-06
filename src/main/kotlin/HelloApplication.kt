import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HelloApplication : KoinComponent {
    val helloService by inject<HelloService>()
    fun sayHelloWithKoin() = println(helloService.hello())

    fun sayHelloNormalWay() {
        val helloMessageData = HelloMessageData()
        val helloServiceImpl = HelloServiceImpl(helloMessageData)
        helloServiceImpl.hello()
    }
}