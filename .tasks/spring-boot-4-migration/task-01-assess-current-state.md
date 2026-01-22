# Task 01: Assess Current State

**Type:** Exploration

## Goal

Identify current Spring Boot version, dependency management, and module structure impacted by Spring Boot 4 migration.

## What to Do

- Locate all Maven `pom.xml` files and record current Spring Boot versions/BOM usage.
- Identify Spring Boot starters, Spring Cloud versions, and key plugins used.
- Note modules and entry points likely affected by migration guide changes.

## Files/Areas

- `pom.xml` - root dependency management and parent POM.
- `**/pom.xml` - module-level dependencies and plugins.
- `src/main/**` - application entry points and configuration classes.

## Key Points

- ⚠️ Capture any custom plugin or dependency overrides that could block migration.
- 💡 Use a concise summary that will inform the next tasks.

## Done When

- [ ] Current Spring Boot version(s) and BOM usage are documented.
- [ ] Major modules and key dependencies affected by migration are listed.
