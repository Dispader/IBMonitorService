package edu.umn.pssa.ibmonitorservice

import org.apache.commons.configuration2.XMLConfiguration
import org.apache.commons.configuration2.builder.fluent.Configurations

import spock.lang.Specification

class ConfigSpecification extends Specification {

    def 'can run a test'() {
        when:
            Configurations configurations = new Configurations()
            XMLConfiguration config = configurations.xml('configs.xml')
        then:
            config.getString('emailUser') == 'dummy@bademail.com'
            config.getString('emailPassword') == 'passw0rd!'
    }
}
