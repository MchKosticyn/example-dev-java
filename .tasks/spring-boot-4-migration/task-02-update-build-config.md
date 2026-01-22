# Task 02: Update Build Configuration

**Type:** Code Modification

## Goal

Update Maven configuration (parent/BOM, plugin versions, and dependency management) to Spring Boot 4 compatible versions.

## What to Do

- Update root `pom.xml` to Spring Boot 4 parent/BOM and align key plugin versions per migration guide.
- Update module `pom.xml` files to align with the new parent/BOM and remove outdated overrides.
- Ensure dependency management for Spring Cloud (if present) is compatible with Spring Boot 4.

## Files/Areas

- `pom.xml` - parent, properties, dependency management.
- `**/pom.xml` - module-specific parent references, overrides.

## Key Points

- ⚠️ Follow the official Spring Boot 4 migration guide for version alignment.
- 💡 Prefer centralized version management in the root POM.

## Done When

- [ ] Root and module POMs reference Spring Boot 4 compatible versions.
- [ ] Plugin and BOM versions are aligned with migration guidance.
