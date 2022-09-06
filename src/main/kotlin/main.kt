import org.koin.core.context.startKoin

fun main(args: Array<String>) {

    /*
    *
    In our small app we need to have 2 components:
    HelloMessageData - hold message data
    HelloService - use and display data from HelloMessageData
    HelloApplication - retrieve and use HelloService
    * */
    println("Hello World!")
    startKoin {
        printLogger()
        modules(helloModule)
    }
    val helloApp = HelloApplication()
    helloApp.sayHelloWithKoin()
}