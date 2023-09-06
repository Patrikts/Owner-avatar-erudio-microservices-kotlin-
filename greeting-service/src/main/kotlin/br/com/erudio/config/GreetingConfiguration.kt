package br.com.erudio.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("greeting-service")
@RefreshScope
class GreetingConfiguration {
    var greeting: String? = null
    var defaultValue: String? = null
}
