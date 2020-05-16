/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.springframework.security.webauthn.sample;

import com.webauthn4j.springframework.security.webauthn.sample.app.config.AppConfig;
import com.webauthn4j.springframework.security.webauthn.sample.domain.config.DomainConfig;
import com.webauthn4j.springframework.security.webauthn.sample.infrastructure.config.InfrastructureConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * SampleWebApplication
 */
@Import({AppConfig.class, DomainConfig.class, InfrastructureConfig.class})
@SpringBootConfiguration
@EnableAutoConfiguration
public class SampleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWebApplication.class, args);
    }
}