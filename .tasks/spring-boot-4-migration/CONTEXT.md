# Spring Boot 4 Migration - Context

## Overview

Migration of the project to Spring Boot 4 following the official migration guide, including build configuration updates, code changes, and verification with tests.

---

## Task Progress

- [x] task-01-assess-current-state.md: Assess Current State
- [x] task-02-update-build-config.md: Update Build Configuration
- [ ] task-03-migrate-code.md: Migrate Code to Spring Boot 4
- [ ] task-04-verify-build-and-tests.md: Verify Build and Tests

### task-01 summary
- Root parent uses Spring Boot 3.3.4 in `pom.xml`; modules are `core` and `cluster-api`.
- Key starters/deps include web, security, validation, data-jpa, webflux, thymeleaf, actuator, mail, cache, OAuth2 client, springdoc-openapi, Liquibase, and Spring Kafka test.
- Custom build plugins include Spring Boot Maven Plugin (build-info/start/stop), springdoc-openapi-maven-plugin, and resource copying for Coral assets.

### task-02 summary
- Updated root parent to Spring Boot 4.0.0 and aligned module dependencies with new starters (webmvc, security OAuth2 client, Liquibase, security-test, Kafka test).
- Removed module-specific snakeyaml and spring-kafka-test version overrides to rely on Boot 4 dependency management.
- Task list reviewed; no changes needed.




---

## Shared Knowledge

### Project Context

- Root `pom.xml` manages Maven build; modules include `core/`, `cluster-api/`.
- Spring Boot migration guide is the primary reference.

### Key Decisions

- Full migration to Spring Boot 4 including code changes and tests.
- Use Maven command: `mvn -DskipTests=false install -f pom.xml` for verification.

### Caveats & Problems

- None yet.

---
