import org.koin.core.qualifier.named
import org.koin.dsl.module

val helloModule = module {
    single { HelloMessageData() }
    single(qualifier = named("Hello01")) { HelloServiceImpl(get()) as HelloService }
    single(qualifier = named("Hello02")) { HelloService02Impl(get()) as HelloService }
}