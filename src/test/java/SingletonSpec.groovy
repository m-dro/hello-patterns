import pl.mirekdrozd.singleton.example1.TheEnumSingleton
import pl.mirekdrozd.singleton.example2.TheClassSingleton
import spock.lang.Specification

class SingletonSpec extends Specification {

    def "should return the same instance when Singleton implemented as class"() {
        given: "several instances"
        def instance_1 = TheClassSingleton.getInstance()
        def instance_2 = TheClassSingleton.getInstance()
        def instance_3 = TheClassSingleton.getInstance()

        expect: "the same instance is always returned"
        instance_1.is(instance_2)

        and:
        instance_1.is(instance_3)

        and:
        instance_2.is(instance_3)
    }

    def "should return the same instance when Singleton implemented as enum"() {
        given: "several instances"
        def instance_1 = TheEnumSingleton.INSTANCE
        def instance_2 = TheEnumSingleton.INSTANCE
        def instance_3 = TheEnumSingleton.INSTANCE

        expect: "the same instance is always returned"
        instance_1.is(instance_2)

        and:
        instance_1.is(instance_3)

        and:
        instance_2.is(instance_3)
    }
}
