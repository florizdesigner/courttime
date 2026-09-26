import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	id("java")
	alias(libs.plugins.spring.boot.plugin)
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

	implementation(libs.spring.boot.starter.jooq)
	implementation(libs.spring.boot.starter.webmvc)
	implementation(libs.springdoc.openapi.starter.webmvc.ui)
	developmentOnly(libs.spring.boot.devtools)
	runtimeOnly(libs.postgresql)

	testImplementation(libs.spring.boot.starter.jooq.test)
	testImplementation(libs.spring.boot.starter.webmvc.test)
	testRuntimeOnly(libs.junit.platform.launcher)
	testImplementation(libs.testcontainers.junit.jupiter)
	testImplementation(libs.testcontainers.postgresql)
}

tasks.withType<Test>  {
	useJUnitPlatform()
}
