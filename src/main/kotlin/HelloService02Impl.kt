class HelloService02Impl(private val helloMessageData: HelloMessageData) : HelloService {
    override fun hello() = "Woohoo, ${helloMessageData.message}"
}