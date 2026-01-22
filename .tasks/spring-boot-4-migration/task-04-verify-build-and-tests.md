# Task 04: Verify Build and Tests

**Type:** Verification

## Goal

Run full Maven build with tests and resolve any compilation or test failures introduced by the migration.

## What to Do

- Run `mvn -DskipTests=false install -f pom.xml`.
- Analyze failures and fix root causes in code or configuration.
- Re-run the build until it succeeds or document blockers.

## Files/Areas

- `pom.xml` and module `pom.xml` files.
- `**/src/main/java/**`, `**/src/test/java/**`, `**/src/main/resources/**`.

## Key Points

- ⚠️ Fix root causes, not symptoms; update context with blockers if unresolved.
- 💡 Include relevant excerpts from build output in the context summary.

## Done When

- [ ] Maven build with tests completes successfully, or blockers are documented.
- [ ] Context is updated with results and any critical issues.
