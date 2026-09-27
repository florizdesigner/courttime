import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	java
	alias(libs.plugins.spring.boot)
}

group = "ru.florizzz"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(25)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(platform(SpringBootPlugin.BOM_COORDINATES))
	developmentOnly(platform(SpringBootPlugin.BOM_COORDINATES))

	implementation(libs.spring.boot.starter.jooq)
	implementation(libs.spring.boot.starter.webmvc)
	implementation(libs.springdoc.openapi.starter.webmvc.ui)
	developmentOnly(libs.spring.boot.devtools)
	runtimeOnly(libs.postgresql)

	testImplementation(libs.spring.boot.starter.jooq.test)
	testImplementation(libs.spring.boot.starter.webmvc.test)
	testRuntimeOnly(libs.junit.platform.launcher)
	testImplementation(libs.spring.boot.testcontainers)
	testImplementation(libs.testcontainers.postgresql)
}

tasks.withType<Test>  {
	useJUnitPlatform()
}
