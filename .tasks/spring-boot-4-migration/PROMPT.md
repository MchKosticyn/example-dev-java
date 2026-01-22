# Spring Boot 4 Migration - Task Execution Instructions

## Your Mission

Migrate the project to Spring Boot 4 following the official migration guide, including build configuration updates, code changes, and verification with tests.

**Context File:** `.tasks/spring-boot-4-migration/CONTEXT.md`
**Tasks Directory:** `.tasks/spring-boot-4-migration`

## Execution Steps

### 1. Read Context
Review the context file for:
- The next incomplete task to work on
- Spring Boot migration decisions and notes
- Information from previous agents
- Key decisions and learnings

### 2. Understand Your Task
Read your task file: `.tasks/spring-boot-4-migration/task-XX-[name].md`
- **Goal** - What you're trying to achieve
- **Description** - Detailed explanation
- **Caveats & Key Points** - Important considerations
- **Main Changes** - Specific files to modify
- **Acceptance Criteria** - How to know you're done

### 3. Execute the Task
- Make necessary code changes
- Follow the Spring Boot 4 migration guide for compatibility
- Ensure code compiles without errors
- Verify all acceptance criteria are met

### 4. Update Context
Update the context file **concisely**:
- Mark task as completed (1-2 sentence summary)
- Document **only critical** decisions that affect future tasks
- Note **only significant** issues or discoveries
- **Keep it brief** - use bullet points, not paragraphs
- **Avoid duplication** - don't repeat what's in task files

### 5. Review Task List
Carefully analyze the task list based on your experience:

**Review Checklist:**
- ✅ Did you encounter unexpected complexity or issues?
- ✅ Are remaining tasks still accurate given what you learned?
- ✅ Should any tasks be split into smaller pieces?
- ✅ Should any tasks be merged or removed?
- ✅ Do tasks need reordering based on new dependencies?
- ✅ Are there missing tasks that should be added?

**Your Responsibility:**
- Actively maintain the task list quality
- Think critically about the remaining work
- Propose improvements even if small
- It's OK to say "no changes needed" but you MUST review first

### 6. Update Task Files (if needed)
- Modify/create task files as needed
- Update task numbering if reordered
- Update CONTEXT.md with task list changes
- Document rationale for changes in CONTEXT.md

### 7. Commit Changes
Commit with descriptive message following this pattern:
- `feat [task-XX]: brief description of changes`
- `fix [task-XX]: brief description of fix` 
- `docs [task-XX]: brief description of documentation`

## Execution Guidelines

**Code Quality:**
- Keep summary brief and focused
- Focus on compilation errors first
- Ensure code compiles without errors before marking task complete
- Follow project coding standards and conventions

**Communication:**
- Ask for guidance if stuck or blocked
- Document blockers clearly in CONTEXT.md
- Mark tasks as "BLOCKED" when cannot proceed

**Task Management:**
- Task list review is part of your responsibility
- Task list maintenance is part of your responsibility
- Think critically about remaining work based on your experience

**Context Updates:**
- Update CONTEXT.md concisely after each task
- Document only critical decisions that affect future tasks
- Use bullet points, not paragraphs
- Keep entries scannable in 5 seconds

**Error Handling:**
- If a task cannot be completed, document the blocker in CONTEXT.md
- Mark task as "BLOCKED" and await user guidance
- Never skip to the next task without resolving blockers

**Specific Notes:**
- Use the official guide: https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-4.0-Migration-Guide
- Use Maven commands as specified by the user: `mvn -DskipTests=false install -f pom.xml`

